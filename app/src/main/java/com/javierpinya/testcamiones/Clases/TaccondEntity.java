package com.javierpinya.testcamiones.Clases;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.javierpinya.testcamiones.Constants.Constants;

@Entity(tableName = Constants.NAME_TABLE_TACCOND)
public class TaccondEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;
}
