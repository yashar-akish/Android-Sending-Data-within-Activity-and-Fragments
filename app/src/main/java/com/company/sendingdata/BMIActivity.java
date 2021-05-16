package com.company.sendingdata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class BMIActivity extends AppCompatActivity {

    EditText et_weight, et_height;
    Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        BmiFragment bmiFragment = new BmiFragment();

        et_weight = findViewById(R.id.et_weight);
        et_height = findViewById(R.id.et_height);
        btn_calculate = findViewById(R.id.btn_calculate);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();

                int userWeight = Integer.valueOf(et_weight.getText().toString());
                int userHeight = Integer.valueOf(et_height.getText().toString());

                bundle.putInt("weight", userWeight);
                bundle.putInt("height", userHeight);

                bmiFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.frame, bmiFragment);
                fragmentTransaction.commit();
            }
        });


    }
}