package com.androidapp.hellokotlin427;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount = 0;
    final long startTime = System.currentTimeMillis();
    long elapsedSeconds;

    TextView txtActivityStartTime, txtCountBtnClicks, txtElapsedTime;
    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);
        btnClickMe = findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount += 1;
                txtCountBtnClicks.setText("Button clicks: " + clickCount);
                txtElapsedTime.setText(elapsedSeconds + "seconds elapsed");
            }
        });
        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + timeText);

    }
}