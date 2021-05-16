package com.company.sendingdata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    TextView tv_s_f_name;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        tv_s_f_name = view.findViewById(R.id.tv_s_f_name);
        Bundle bundle = getArguments();
        String userName = bundle.getString("name");

        tv_s_f_name.append("\n"+userName);

        return view;
    }
}