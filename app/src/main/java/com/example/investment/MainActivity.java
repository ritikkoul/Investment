package com.example.investment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private Button fa;
    private Button md;
    private Button eir;
    private Button fd;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1= (EditText) findViewById(R.id.editTextNumberDecimal);
        num2= (EditText)  findViewById(R.id.editTextNumberDecimal4);
        num3= (EditText) findViewById(R.id.editTextNumberDecimal5);
        num4= (EditText)  findViewById(R.id.editTextNumber);
        fa= (Button) findViewById(R.id.button);
        md= (Button) findViewById(R.id.button3);
        eir= (Button) findViewById(R.id.button2);
        fd= (Button) findViewById(R.id.button4);
        result=(TextView) findViewById(R.id.textView7);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(num1.getText().toString());
                double r=Double.parseDouble(num2.getText().toString());
                double n=Double.parseDouble(num3.getText().toString());
                double fann=(100*a*Math.pow((1+r/100),n)-100*a)/r;
                result.setText("Maturity Value: "+String.valueOf(fann));

            }
        });



        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r=Double.parseDouble(num2.getText().toString());
                double nyr=72/r;
                result.setText("No years to Double:"+String.valueOf(nyr));

            }
        });



        eir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(num1.getText().toString());
                double r=Double.parseDouble(num2.getText().toString());
                double n=Double.parseDouble(num3.getText().toString());
                double c=Double.parseDouble(num4.getText().toString());
                double eff=a*(Math.pow((1+r/(100*c)),n*c)-1) ;
                result.setText("Profit: "+String.valueOf(eff));


            }
        });


        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a=Double.parseDouble(num1.getText().toString());
                double r=Double.parseDouble(num2.getText().toString());
                double n=Double.parseDouble(num3.getText().toString());
                double c=Double.parseDouble(num4.getText().toString());
                double eff=a*(Math.pow((1+r/100),n)) ;
                result.setText("Maturity Value: "+String.valueOf(eff));


            }
        });



    }
}