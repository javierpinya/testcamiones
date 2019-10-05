package com.javierpinya.testcamiones.Clases;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.javierpinya.testcamiones.Constants.Constants;

import java.util.Date;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = Constants.NAME_TABLE_TACCAMI,
        foreignKeys = {
                @ForeignKey(entity = TacprcoEntity.class,
                        parentColumns = "id",
                        childColumns = "tMatriculaId",
                        onDelete = CASCADE),
                @ForeignKey(entity = TacsecoEntity.class,
                        parentColumns = "id",
                        childColumns = "cMatriculaId",
                        onDelete = CASCADE)
        },
        indices = {@Index(value = {"id"}, unique = true),
                @Index(value = {"tMatriculaId"}, unique = true),
                @Index(value = {"cMatriculaId"}, unique = true)}
)
public class TaccamiEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public int cod_vehiculo;
    public int tMatriculaId;
    public int cMatriculaId;
    public int tara;
    public int pesoMaximo;
    public Date fec_baja = new Date();




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod_vehiculo() {
        return cod_vehiculo;
    }

    public void setCod_vehiculo(int cod_vehiculo) {
        this.cod_vehiculo = cod_vehiculo;
    }

    public int gettMatriculaId() {
        return tMatriculaId;
    }

    public void settMatriculaId(int tMatriculaId) {
        this.tMatriculaId = tMatriculaId;
    }

    public int getcMatriculaId() {
        return cMatriculaId;
    }

    public void setcMatriculaId(int cMatriculaId) {
        this.cMatriculaId = cMatriculaId;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Date getFec_baja() {
        return fec_baja;
    }

    public void setFec_baja(Date fec_baja) {
        this.fec_baja = fec_baja;
    }
}

