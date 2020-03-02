package com.example.ex005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView iv;
    int num=0;
    Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        iv = (ImageView)findViewById(R.id.iv);

    }

    public void push(View view) {

       num= rnd.nextInt(3)+1;
       if (num==1) {
           iv.setImageResource(R.drawable.oneone);
           btn.setText("one");
       }
       else if (num==2) {
           iv.setImageResource(R.drawable.twotwo);
           btn.setText("two");
       }
       else {
           iv.setImageResource(R.drawable.threethree);
           btn.setText("three");
       }

    }
}
