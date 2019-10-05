package com.javierpinya.testcamiones;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.Clases.TaccamiEntity;

import java.util.List;

public class VehiculoViewModel extends AndroidViewModel {


    private List<TaccamiEntity> allVehiculos;
    private VehiculoRepository vehiculoRepository;

    public VehiculoViewModel(Application application){
        super(application);

        vehiculoRepository = new VehiculoRepository(application);
    }


    public LiveData<List<TaccamiEntity>> getAllVehiculos(){
        return vehiculoRepository.encuentraVehiculos();
    }

    public void insertarVehiculo(TaccamiEntity taccamiEntity){
        vehiculoRepository.insert(taccamiEntity);
    }



}

