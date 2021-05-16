package com.company.sendingdata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BmiFragment extends Fragment {

    TextView tv_result;


    public BmiFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);

        tv_result = view.findViewById(R.id.tv_result);

        Bundle bundle = getArguments();
        int userWeight = bundle.getInt("weight");
        int userHeight = bundle.getInt("height");

        double userBMI = (userWeight * 1000) / (userHeight * userHeight);

        tv_result.setText("Your BMI is: "+userBMI);

        return view;
    }
}