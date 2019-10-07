package com.javierpinya.testcamiones.Clases;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.javierpinya.testcamiones.Constants.Constants;

import java.util.Date;

@Entity(tableName = Constants.NAME_TABLE_TACCOND)
public class TaccondEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "conductor")
    public String cod_conductor;
    public String dni;
    public String nombre;
    public String apellidos;
    public Date fechaAlta;

}
