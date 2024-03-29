package com.javierpinya.testcamiones.ui;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.javierpinya.testcamiones.BuscarVehiculoActivity;
import com.javierpinya.testcamiones.MainActivity;
import com.javierpinya.testcamiones.MenuActivity;
import com.javierpinya.testcamiones.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment{

    private ImageButton buscarCamion;
    private ImageButton buscarInspeccion;
    private ImageButton nuevaInspeccion;
    private ImageButton calculadora;


    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        buscarCamion = view.findViewById(R.id.imageBuscarCamion);
        buscarInspeccion = view.findViewById(R.id.imageBuscarInspeccion);
        nuevaInspeccion = view.findViewById(R.id.imageNuevaInspeccion);
        calculadora = view.findViewById(R.id.imageCalculadora);


        buscarCamion.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(), BuscarVehiculoActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
