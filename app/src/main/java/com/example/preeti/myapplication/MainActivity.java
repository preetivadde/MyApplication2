package com.example.preeti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton img1;
    ImageButton img2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageButton)findViewById(R.id.button);
        img2 = (ImageButton)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("1");

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(textView.getText().toString());
                if(number >=0)
                number = number - 1;
                else
                    number = 0;

                textView.setText(number);
            }
        });
    }
}
