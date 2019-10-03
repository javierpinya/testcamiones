package com.javierpinya.testcamiones;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.Clases.VehiculoEntity;

import java.util.List;

public class VehiculoViewModel extends AndroidViewModel {


    private List<VehiculoEntity> allVehiculos;
    private VehiculoRepository vehiculoRepository;

    public VehiculoViewModel(Application application){
        super(application);

        vehiculoRepository = new VehiculoRepository(application);
    }


    public LiveData<List<VehiculoEntity>> getAllVehiculos(){
        return vehiculoRepository.encuentraVehiculos();
    }

    public void insertarVehiculo(VehiculoEntity vehiculoEntity){
        vehiculoRepository.insert(vehiculoEntity);
    }



}

