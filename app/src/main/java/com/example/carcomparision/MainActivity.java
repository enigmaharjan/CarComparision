package com.example.carcomparision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPetrol, btnDiesel;
    private TextView tvResult;
    private EditText etMake, etYear, etColor, etPrice, etEngine;
    private String a = "";
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPetrol = findViewById(R.id.btnPetrol);
        btnDiesel = findViewById(R.id.btnDiesel);
        tvResult = findViewById(R.id.tvCars);
        etColor = findViewById(R.id.etColor);
        etEngine = findViewById(R.id.etEngine);
        etMake = findViewById(R.id.etMake);
        etPrice = findViewById(R.id.etPrice);
        etYear = findViewById(R.id.etYear);


        btnDiesel.setOnClickListener(this);
        btnPetrol.setOnClickListener(this);
    }

    public boolean validate(){
        boolean flag = true;
        if(TextUtils.isEmpty(etMake.getText().toString())){
            etMake.setError("Please Enter The Brand.");
            etMake.requestFocus();
            flag = false;
        }
        if(TextUtils.isEmpty(etYear.getText().toString())){
            etYear.setError("Please Enter Manufacture Year.");
            etYear.requestFocus();
            flag = false;
        }
        if(TextUtils.isEmpty(etColor.getText().toString())){
            etColor.setError("Please Enter The Color.");
            etColor.requestFocus();
            flag = false;
        }
        if(TextUtils.isEmpty(etPrice.getText().toString())){
            etPrice.setError("Please Enter The Price.");
            etPrice.requestFocus();
            flag = false;
        }
        if(TextUtils.isEmpty(etEngine.getText().toString())){
            etEngine.setError("Please Enter The Engine Size.");
            etEngine.requestFocus();
            flag = false;
        }
        return flag;
    }
    @Override
    public void onClick(View v) {
        if(validate()){
            String make = etMake.getText().toString();
            Number year = Integer.parseInt(etYear.getText().toString());
            String color = etColor.getText().toString();
            Double price = Double.parseDouble(etPrice.getText().toString());
            Double engine = Double.parseDouble(etEngine.getText().toString());
            Car pc = new Car();

            switch(v.getId()){
                case R.id.btnPetrol:
                    pc.setColor(color);
                    pc.setEngine(engine);
                    pc.setYear(year);
                    pc.setMake(make);
                    pc.setPrice(price);
                    i++;
                     a += pc.a(i);
                    tvResult.setText(a);
                    break;
                case R.id.btnDiesel:
                    pc.setColor(color);
                    pc.setEngine(engine);
                    pc.setYear(year);
                    pc.setMake(make);
                    pc.setPrice(price);
                    i++;
                    a += pc.a(i);
                    tvResult.setText(a);
                    break;

            }
        }
    }
}
