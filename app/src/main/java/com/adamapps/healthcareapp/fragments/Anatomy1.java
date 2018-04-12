package com.adamapps.healthcareapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adamapps.healthcareapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Anatomy1 extends Fragment {


    public Anatomy1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anatomy1, container, false);
    }

}
