package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     EditText ed;
     Button b;
     ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=findViewById(R.id.ed1);
        b=findViewById(R.id.b1);
        iv=findViewById(R.id.iv1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=ed.getText().toString();
                if(s.equals("538"))
                {
                    iv.setImageResource(R.drawable.download);
                }
                else if(s.equals("539"))
                {
                    iv.setImageResource(R.drawable.a);
                }
                else if(s.equals("537"))
                {
                    iv.setImageResource(R.drawable.b);
                }
                else if(s.equals("536"))
                {
                    iv.setImageResource(R.drawable.c);
                }
                else if(s.equals("535"))
                {
                    iv.setImageResource(R.drawable.d);
                }
                else
                    ed.setError("invalid pin");
                       }
        });






    }

    }




