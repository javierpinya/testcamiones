package com.javierpinya.testcamiones.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.javierpinya.testcamiones.Clases.TacprcoEntity;

@Dao
public interface TacprcoDao {

    @Insert
    void insertTacprco(TacprcoEntity tacprco);

    @Update
    void updateTacprcoById(TacprcoEntity tacprco);

    @Delete
    void deleteTacprcoById(TacprcoEntity tacprco);

    @Query("SELECT * FROM tacprco WHERE matricula LIKE :matricula")
    TacprcoEntity findTacprcoByMatricula(String matricula);

    @Query("SELECT * FROM tacprco WHERE id LIKE :id")
    TacprcoEntity findTacprcoById(int id);


}
