package com.javierpinya.testcamiones.Clases;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vehiculo")
public class VehiculoEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String tMatricula;
    public String tTipo;
    public String tBloqueada;
    public String tInspeccionada;
    public String cMatricula;
    public String cBloqueada;
    public String cInspeccionada;

    public VehiculoEntity(String tMatricula, String tTipo, String tBloqueada, String tInspeccionada, String cMatricula, String cBloqueada, String cInspeccionada) {
        this.tMatricula = tMatricula;
        this.tTipo = tTipo;
        this.tBloqueada = tBloqueada;
        this.tInspeccionada = tInspeccionada;
        this.cMatricula = cMatricula;
        this.cBloqueada = cBloqueada;
        this.cInspeccionada = cInspeccionada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettMatricula() {
        return tMatricula;
    }

    public void settMatricula(String tMatricula) {
        this.tMatricula = tMatricula;
    }

    public String gettTipo() {
        return tTipo;
    }

    public void settTipo(String tTipo) {
        this.tTipo = tTipo;
    }

    public String gettBloqueada() {
        return tBloqueada;
    }

    public void settBloqueada(String tBloqueada) {
        this.tBloqueada = tBloqueada;
    }

    public String gettInspeccionada() {
        return tInspeccionada;
    }

    public void settInspeccionada(String tInspeccionada) {
        this.tInspeccionada = tInspeccionada;
    }

    public String getcMatricula() {
        return cMatricula;
    }

    public void setcMatricula(String cMatricula) {
        this.cMatricula = cMatricula;
    }

    public String getcBloqueada() {
        return cBloqueada;
    }

    public void setcBloqueada(String cBloqueada) {
        this.cBloqueada = cBloqueada;
    }

    public String getcInspeccionada() {
        return cInspeccionada;
    }

    public void setcInspeccionada(String cInspeccionada) {
        this.cInspeccionada = cInspeccionada;
    }
}
