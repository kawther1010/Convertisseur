package com.example.appexo03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;

    TextView textView1;
    EditText editText;

    Button btn;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1= findViewById(R.id.radioButton1);
        radioButton2= findViewById(R.id.radioButton2);
        textView1= findViewById(R.id.textView1);
        editText= findViewById(R.id.editText);
        btn= findViewById(R.id.btn);
        textView2= findViewById(R.id.textView2);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButton1.isChecked()){
                    textView1.setText(" ");
                    textView1.setText("Entrer le montant en dinar dz:");
                }
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButton2.isChecked()){
                    textView1.setText(" ");
                    textView1.setText("Entrer le montant en euro:");
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioButton1.isChecked()){
                    Editable amountString1= editText.getText();
                    float amount1= Float.parseFloat(String.valueOf(amountString1));
                    float result1= amount1/200;
                    String resultString1= Float.toString(result1);
                    textView2.setText(resultString1);
                } else if (radioButton2.isChecked()){
                    Editable amountString2= editText.getText();
                    float amount2= Float.parseFloat(String.valueOf(amountString2));
                    float result2= amount2*200;
                    String resultString2= Float.toString(result2);
                    textView2.setText(resultString2);
                } else {
                    textView2.setText("You have to click on one of the radio buttons.");
                }
            }
        });

    }
}























