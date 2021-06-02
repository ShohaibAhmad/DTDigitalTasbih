package com.promoteprovider.dtdigitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private TextView tvCount;
        private Button buttonAdd,buttonSub,buttonReset;
        int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);

        // buttonAdd
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast For Confirm This Button working properly
                Toast.makeText(MainActivity.this, "Add number Successfully", Toast.LENGTH_SHORT).show();
                //main code start from her
                count++;
                tvCount.setText(""+count);
            }
        });
        // buttonSub
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast For Confirm This Button working properly
                Toast.makeText(MainActivity.this, "Sub number Successfully", Toast.LENGTH_SHORT).show();
                //main code start from her
                if (count<=0){
                    tvCount.setText(""+0);
                }
                else {
                    count--;
                }
//                count--;
                tvCount.setText(""+count);
            }
        });
        // buttonReset
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast For Confirm This Button working properly
                Toast.makeText(MainActivity.this, "Reset number Successfully", Toast.LENGTH_SHORT).show();
                //main code start from her
                count=0;
                tvCount.setText(""+count);

            }
        });


    }
}