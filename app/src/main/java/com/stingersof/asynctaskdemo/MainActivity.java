package com.stingersof.asynctaskdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        textView.setText("I have never slept");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Napping...");
                try {
                    //Thread.sleep(4000);

                } catch (Exception ex) {

                }

                MyAsyncTask asyncTask = new MyAsyncTask(textView);
                asyncTask.execute();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hey...don't wake me");
            }
        });

    }
}
