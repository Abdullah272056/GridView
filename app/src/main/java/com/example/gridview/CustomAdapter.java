package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int [] allahNameImage;
    String [] nameText;
    String [] nameMeaning;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int[] allahNameImage, String[] nameText, String[] nameMeaning) {
        this.context = context;
        this.allahNameImage = allahNameImage;
        this.nameText = nameText;
        this.nameMeaning = nameMeaning;
    }

    @Override
    public int getCount() {
        return allahNameImage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.sample,parent,false);

            TextView nameTextView=convertView.findViewById(R.id.nameTextViewId);
            TextView nameMeaningTextView=convertView.findViewById(R.id.nameMeaningTextViewId);
            ImageView imageView=convertView.findViewById(R.id.imageViewId);


            imageView.setImageResource(allahNameImage[position]);
            nameTextView.setText(nameText[position]);
            nameMeaningTextView.setText(nameMeaning[position]);

        }


        return convertView;
    }
}
