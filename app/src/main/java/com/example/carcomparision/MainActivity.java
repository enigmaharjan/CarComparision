package com.example.carcomparision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPetrol, btnDiesel;
    private TextView tvResult;
    private EditText etMake, etYear, etColor, etPrice, etEngine;

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
            switch(v.getId()){
                case R.id.btnPetrol:
                    tvResult.setText("Say Hello to Petrol Car");
                    break;
                case R.id.btnDiesel:
                    tvResult.setText("Say Hello to Diesel Car");
                    break;

            }
        }
    }
}
