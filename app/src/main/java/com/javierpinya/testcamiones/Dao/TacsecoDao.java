package com.javierpinya.testcamiones.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.javierpinya.testcamiones.Clases.TacsecoEntity;

@Dao
public interface TacsecoDao {

    @Insert
    void insertTacprco(TacsecoEntity tacseco);

    @Update
    void updateTacprcoById(TacsecoEntity tacseco);

    @Delete
    void deleteTacprcoById(TacsecoEntity tacseco);

    @Query("SELECT * FROM tacseco WHERE matricula LIKE :matricula")
    TacsecoEntity findTacsecoByMatricula(String matricula);

    @Query("SELECT * FROM tacseco WHERE id LIKE :id")
    TacsecoEntity findTacsecoById(int id);
}
