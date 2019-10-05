package com.javierpinya.testcamiones.Clases;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.javierpinya.testcamiones.Constants.Constants;

import java.util.Date;

@Entity(tableName = Constants.NAME_TABLE_TACSECO,
        indices = {@Index(value = {"id"}, unique = true)})
public class TacsecoEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "matricula")
    public String matricula;
    @ColumnInfo(name = "itv")
    public Date fec_cadu_itv;
    @ColumnInfo(name = "adr")
    public Date fec_cadu_adr;
    @ColumnInfo(name = "tara")
    public int tara;
    @ColumnInfo(name = "peso_maximo")
    public int peso_maximo;
    @ColumnInfo(name = "chip")
    public int chip;
    @ColumnInfo(name = "tipo")
    public String tipo;
    @ColumnInfo(name = "cadu_calibracion")
    public Date fec_cadu_calibracion;
    @ColumnInfo(name = "ejes")
    public int num_ejes;
    @ColumnInfo(name = "pesados")
    public boolean ind_carga_pesados;
    @ColumnInfo(name = "baja")
    public Date fec_baja = new Date();
    @ColumnInfo(name = "nacion")
    public String cod_nacion;
    @ColumnInfo(name = "solo_gasoleo")
    public Boolean solo_gasoleo;
    @ColumnInfo(name = "bloqueado")
    public Boolean ind_bloquo;
    @ColumnInfo(name = "queroseno")
    public Boolean ind_queroseno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFec_cadu_itv() {
        return fec_cadu_itv;
    }

    public void setFec_cadu_itv(Date fec_cadu_itv) {
        this.fec_cadu_itv = fec_cadu_itv;
    }

    public Date getFec_cadu_adr() {
        return fec_cadu_adr;
    }

    public void setFec_cadu_adr(Date fec_cadu_adr) {
        this.fec_cadu_adr = fec_cadu_adr;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getPeso_maximo() {
        return peso_maximo;
    }

    public void setPeso_maximo(int peso_maximo) {
        this.peso_maximo = peso_maximo;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFec_cadu_calibracion() {
        return fec_cadu_calibracion;
    }

    public void setFec_cadu_calibracion(Date fec_cadu_calibracion) {
        this.fec_cadu_calibracion = fec_cadu_calibracion;
    }

    public int getNum_ejes() {
        return num_ejes;
    }

    public void setNum_ejes(int num_ejes) {
        this.num_ejes = num_ejes;
    }

    public boolean isInd_carga_pesados() {
        return ind_carga_pesados;
    }

    public void setInd_carga_pesados(boolean ind_carga_pesados) {
        this.ind_carga_pesados = ind_carga_pesados;
    }

    public Date getFec_baja() {
        return fec_baja;
    }

    public void setFec_baja(Date fec_baja) {
        this.fec_baja = fec_baja;
    }

    public String getCod_nacion() {
        return cod_nacion;
    }

    public void setCod_nacion(String cod_nacion) {
        this.cod_nacion = cod_nacion;
    }

    public Boolean getSolo_gasoleo() {
        return solo_gasoleo;
    }

    public void setSolo_gasoleo(Boolean solo_gasoleo) {
        this.solo_gasoleo = solo_gasoleo;
    }

    public Boolean getInd_bloquo() {
        return ind_bloquo;
    }

    public void setInd_bloquo(Boolean ind_bloquo) {
        this.ind_bloquo = ind_bloquo;
    }

    public Boolean getInd_queroseno() {
        return ind_queroseno;
    }

    public void setInd_queroseno(Boolean ind_queroseno) {
        this.ind_queroseno = ind_queroseno;
    }
}

