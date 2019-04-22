package com.example.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Items extends AppCompatActivity  {
    TextView tnew;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);




        im=findViewById(R.id.ar1);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

         tnew=findViewById(R.id.text1);
        Bundle extras=getIntent().getExtras();
        String s=extras.getString("string");
        //Intent intent=getIntent();
        //  int result=intent.getIntExtra("Result",5);
        //Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();

        tnew.setText(String.valueOf(s));


    }



}
