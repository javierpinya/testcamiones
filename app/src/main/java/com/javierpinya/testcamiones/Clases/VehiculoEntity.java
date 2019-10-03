package com.javierpinya.testcamiones.Clases;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vehiculo")
public class VehiculoEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String tMatricula;
    public String tTipo;
    public Boolean tBloqueada;
    public Boolean tInspeccionada;
    public String cMatricula;
    public Boolean cBloqueada;
    public Boolean cInspeccionada;

    public VehiculoEntity(String tMatricula, String tTipo, Boolean tBloqueada, Boolean tInspeccionada, String cMatricula, Boolean cBloqueada, Boolean cInspeccionada) {
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

    public String getcMatricula() {
        return cMatricula;
    }

    public void setcMatricula(String cMatricula) {
        this.cMatricula = cMatricula;
    }

    public Boolean gettBloqueada() {
        return tBloqueada;
    }

    public void settBloqueada(Boolean tBloqueada) {
        this.tBloqueada = tBloqueada;
    }

    public Boolean gettInspeccionada() {
        return tInspeccionada;
    }

    public void settInspeccionada(Boolean tInspeccionada) {
        this.tInspeccionada = tInspeccionada;
    }

    public Boolean getcBloqueada() {
        return cBloqueada;
    }

    public void setcBloqueada(Boolean cBloqueada) {
        this.cBloqueada = cBloqueada;
    }

    public Boolean getcInspeccionada() {
        return cInspeccionada;
    }

    public void setcInspeccionada(Boolean cInspeccionada) {
        this.cInspeccionada = cInspeccionada;
    }
}

