package com.javierpinya.testcamiones;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.Clases.TaccamiEntity;
import com.javierpinya.testcamiones.Repositories.TaccamiRepository;

import java.util.List;

public class TaccamiViewModel extends AndroidViewModel {


    private List<TaccamiEntity> allVehiculos;
    private TaccamiRepository taccamiRepository;

    public TaccamiViewModel(Application application){
        super(application);

        taccamiRepository = new TaccamiRepository(application);
    }


    public LiveData<List<TaccamiEntity>> getAllVehiculos(){
        return taccamiRepository.encuentraVehiculos();
    }

    public void insertarVehiculo(TaccamiEntity taccamiEntity){
        taccamiRepository.insert(taccamiEntity);
    }



}

