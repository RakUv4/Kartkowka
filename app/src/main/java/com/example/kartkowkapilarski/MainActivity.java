package com.example.kartkowkapilarski;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button buttonPlus, buttonMinus;
    Button buttonPlus2, buttonMinus2;
    Button buttonPlus3, buttonMinus3;

    TextView textView3;
    TextView textView2;
    TextView textView;

    int punkty = 0;
    int punkty2 = 0;
    int punkty3 = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonPlus3 = findViewById(R.id.btnplus3);
        buttonMinus3 = findViewById(R.id.btnminus3);
        textView3 = findViewById(R.id.textView7);


        buttonPlus2 = findViewById(R.id.btnplus2);
        buttonMinus2 = findViewById(R.id.btnminus2);
        textView2 = findViewById(R.id.textView6);


        buttonPlus = findViewById(R.id.btnplus);
        buttonMinus = findViewById(R.id.btnminus);
        textView = findViewById(R.id.textView2);

        textView.setText(punkty + "");
        textView2.setText(punkty2 + "");
        textView3.setText(punkty3 + "");


        buttonMinus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty--;
                        textView.setText(punkty + "");
                        if (punkty <= 1){
                            punkty++;
                        }
                    }
                }
        );

        buttonPlus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textView.setText(Integer.toString(punkty));
                        if(punkty >= 10){
                            punkty--;
                        }
                    }
                }
        );
        buttonMinus2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty2--;
                        textView2.setText(punkty2 + "");
                        if (punkty2 <= 1){
                            punkty2++;
                        }
                    }
                }
        );
        buttonPlus2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty2++;
                        textView2.setText(Integer.toString(punkty2));
                        if(punkty2 >= 10){
                            punkty2--;
                        }
                    }
                }
        );

        buttonMinus3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty3--;
                        textView3.setText(punkty3 + "");
                        if (punkty3 <= 1){
                            punkty3++;
                        }
                    }
                }
        );
        buttonPlus3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty3++;
                        textView3.setText(Integer.toString(punkty3));
                        if(punkty3 >= 10){
                            punkty3--;
                        }
                    }
                }
        );
    }
}