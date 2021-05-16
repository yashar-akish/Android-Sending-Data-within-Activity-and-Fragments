package com.company.sendingdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et_name, et_email, et_phone;
    Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_phone = findViewById(R.id.et_phone);
        btn_signUp = findViewById(R.id.btn_signUp);

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = et_name.getText().toString();
                String userEmail = et_email.getText().toString();
                int userPhone = Integer.valueOf(et_phone.getText().toString());

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", userName);
                intent.putExtra("email", userEmail);
                intent.putExtra("phone", userPhone);
                startActivity(intent);
            }
        });
    }
}