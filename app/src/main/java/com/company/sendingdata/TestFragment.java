package com.company.sendingdata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment {

    EditText et_f_name, et_f_email;
    Button btn_f_send;

    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test, container, false);

        et_f_name = view.findViewById(R.id.et_f_name);
        et_f_email = view.findViewById(R.id.et_f_email);
        btn_f_send = view.findViewById(R.id.btn_f_send);

        btn_f_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = et_f_name.getText().toString();
                String userEmail = et_f_email.getText().toString();

                TestFragmentActivity testFragmentActivity = (TestFragmentActivity) getActivity();
                testFragmentActivity.takeData(userName, userEmail);
            }
        });
        return view;
    }
}