package com.company.sendingdata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FirstFragment extends Fragment {

    EditText et_f_f_name;
    Button btn_f_f_send;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        et_f_f_name = view.findViewById(R.id.et_f_f_name);
        btn_f_f_send = view.findViewById(R.id.btn_f_f_send);

        btn_f_f_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = et_f_f_name.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("name", userName);

                //  creating second fragment:
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.frameLayout, secondFragment);
                fragmentTransaction.commit();

            }
        });
        return view;
    }
}