package com.example.modeule_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class about extends Fragment {
    private Button myButton;

    public about() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_about, container, false);
        myButton  = v.findViewById(R.id.button_contact);
        myButton.setOnClickListener(view -> {
            startActivity(new Intent(new Intent(getActivity(), contact.class)));
        });
        return v;
    }
}