package com.promoteprovider.dtdigitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {
        private TextView result;
        private Button Add;
        private LinearLayout back;
        private LinearLayout reset;
        int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Objects.requireNonNull(getSupportActionBar()).hide();
        result = findViewById(R.id.result);
        Add = findViewById(R.id.Add);
        back = findViewById(R.id.back);
        reset = findViewById(R.id.reset);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                result.setText(""+count);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count<=0){
                    count=0;
                    result.setText(""+count);
                }
                else {
                    count--;
                }
                result.setText(""+count);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                result.setText(""+count);
            }
        });


    }
}