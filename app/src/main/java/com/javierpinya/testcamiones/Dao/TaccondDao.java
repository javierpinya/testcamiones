package com.javierpinya.testcamiones.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.javierpinya.testcamiones.Clases.TaccondEntity;

import java.util.List;

@Dao
public interface TaccondDao {

    @Insert
    void insertTaccond(TaccondEntity taccond);

    @Update
    void updateTaccond(TaccondEntity taccond);

    @Delete
    void deleteTaccondById(TaccondEntity taccond);

    @Query("Delete from taccond")
    void deleteAllTaccond();

    @Query("select * from taccond")
    LiveData<List<TaccondEntity>> findAllTaccond();

    @Query("Select * from taccond where conductor like :conductor")
    TaccondEntity findTaccondByConductor(String conductor);

}
