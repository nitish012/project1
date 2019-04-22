package com.example.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView told1,told2,told3,told4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         told1=findViewById(R.id.tv1);
        told2=findViewById(R.id.tv2);
        told3=findViewById(R.id.t3);
        told4=findViewById(R.id.tv4);

    }

    public void Items1(View view) {


        Intent intent=new Intent(this,Items.class);
        intent.putExtra("string",told1.getText().toString());

        startActivity(intent);


    }

    public void Items2(View view) {

        Intent intent=new Intent(this,Items.class);
        intent.putExtra("string",told2.getText().toString());

        startActivity(intent);


    }

    public void Items3(View view) {

        Intent intent=new Intent(this,Items.class);
        intent.putExtra("string",told3.getText().toString());

        startActivity(intent);

    }

    public void Items4(View view) {

        Intent intent=new Intent(this,Items.class);
        intent.putExtra("string",told4.getText().toString());

        startActivity(intent);

    }
}
