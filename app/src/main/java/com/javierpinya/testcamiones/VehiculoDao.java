package com.javierpinya.testcamiones;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.javierpinya.testcamiones.Clases.VehiculoEntity;

import java.util.List;

@Dao
public interface VehiculoDao {

    @Query("select * from vehiculo")
    LiveData<List<VehiculoEntity>> getVehiculos();

    @Insert
    void insert(VehiculoEntity vehiculo);
}
