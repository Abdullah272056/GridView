package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    CustomAdapter customAdapter;


    String [] nameText;
    String [] nameMeaning;
//    int [] allahNameImage={
//            R.drawable.ic_allah,R.drawable.ic_ar_rahman,R.drawable.ic_ar_rahim,
//            R.drawable.ic_al_maliqu,R.drawable.al_kuddusu,R.drawable.ic_as_salamu,
//            R.drawable.ic_al_muminu,R.drawable.ic_al_muyaiminu,R.drawable.ic_al_azizu,
//            R.drawable.ic_al_zabbaru,R.drawable.ic_al_khaliqu,R.drawable.ic_al_bari,
//            R.drawable.ic_al_gaffaru,R.drawable.ic_al_kahaharu,R.drawable.ic_ar_razzak,
//            R.drawable.ic_al_muyezzib,R.drawable.ic_al_alim,R.drawable.ic_al_basitu
//
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText=getResources().getStringArray(R.array.name_text);
        nameMeaning=getResources().getStringArray(R.array.name_meaning);
        gridView=findViewById(R.id.gridViewId);
        // kuddusu image error
        int [] allahNameImage={
            R.drawable.ic_allah,R.drawable.ic_ar_rahman,R.drawable.ic_ar_rahim,
            R.drawable.ic_al_maliqu,R.drawable.al_kuddusu,R.drawable.ic_as_salamu,
            R.drawable.ic_al_muminu,R.drawable.ic_al_muyaiminu,R.drawable.ic_al_azizu,
            R.drawable.ic_al_zabbaru,R.drawable.ic_al_khaliqu,R.drawable.ic_al_bari,
            R.drawable.ic_al_gaffaru,R.drawable.ic_al_kahaharu,R.drawable.ic_ar_razzak,
            R.drawable.ic_al_muyezzib,R.drawable.ic_al_alim,R.drawable.ic_al_basitu

    };



         customAdapter=new CustomAdapter(MainActivity.this,allahNameImage,nameText,nameMeaning);
        gridView.setAdapter(customAdapter);


    }
}