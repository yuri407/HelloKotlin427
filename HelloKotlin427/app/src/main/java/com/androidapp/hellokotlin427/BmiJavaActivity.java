package com.androidapp.hellokotlin427;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BmiJavaActivity extends AppCompatActivity {
    EditText heightField, weightField;
    TextView txtResult;
    Button btnBmi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightField = findViewById(R.id.heightField);
        weightField = findViewById(R.id.weightField);
        txtResult = findViewById(R.id.txtResult);
        btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {

           public void onClick(View view) {
               String sHeight, sWeight;

              /* String sHeight = heightField.getText().toString();
               String sWeight = weightField.getText().toString();
               if (!weightField.getText().toString().isEmpty() && !heightField.getText().toString().isEmpty()) {
                   if (sHeight != null && sWeight != null) {
                       double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100, 2.);
                       txtResult.setText("Your BMI = " + bmi);
                   }
                   } else {
                   txtResult.setText("Input(s) missing");
               }*/
               try {
                   sHeight = heightField.getText().toString();
                   sWeight = weightField.getText().toString();
                   double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100, 2.);
                   txtResult.setText("Your BMI = " + bmi);
               } catch (Exception e){
                   txtResult.setText("Input(s) missing");
               }
           }
       });
    }
}
