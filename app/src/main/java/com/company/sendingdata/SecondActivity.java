package com.company.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_name, tv_email, tv_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_name = findViewById(R.id.tv_name);
        tv_email = findViewById(R.id.tv_email);
        tv_phone = findViewById(R.id.tv_phone);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");
        String userEmail = intent.getStringExtra("email");
        int userPhone = intent.getIntExtra("phone",0);

        tv_name.setText(String.format("Hello %s", userName));
        tv_email.setText(String.format("Your Email : %s", userEmail));
        tv_phone.setText(String.format("Your Phone Number : %s", String.valueOf(userPhone)));
    }
}