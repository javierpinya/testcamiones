package com.javierpinya.testcamiones.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.javierpinya.testcamiones.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SincronizarFragment extends Fragment {


    public SincronizarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sincronizar, container, false);

        return view;
    }

}
