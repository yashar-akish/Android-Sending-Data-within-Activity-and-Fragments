package com.company.sendingdata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TestFragmentActivity extends AppCompatActivity {

    TextView tv_f_name, tv_f_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TestFragment testFragment = new TestFragment();
        fragmentTransaction.add(R.id.linear, testFragment);
        fragmentTransaction.commit();

    }

    public void takeData(String userName, String userEmail){
        tv_f_name = findViewById(R.id.tv_f_name);
        tv_f_email = findViewById(R.id.tv_f_email);
        tv_f_name.setText(userName);
        tv_f_email.setText(userEmail);
    }
}