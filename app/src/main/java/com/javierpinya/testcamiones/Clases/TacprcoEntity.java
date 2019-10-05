package com.javierpinya.testcamiones.Clases;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.javierpinya.testcamiones.Constants.Constants;

import java.util.Date;

import static androidx.room.ForeignKey.CASCADE;


@Entity(tableName = Constants.NAME_TABLE_TACPRCO,
        indices = {@Index(value = {"id"}, unique = true)})
public class TacprcoEntity {
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
    @ColumnInfo(name = "baja")
    public Date fec_baja;
    @ColumnInfo(name = "nacion")
    public String cod_nacion;
    @ColumnInfo(name = "solo_gasoleo")
    public Boolean solo_gasoleo;
    @ColumnInfo(name = "bloqueado")
    public Boolean ind_bloquo;
    @ColumnInfo(name = "queroseno")
    public Boolean ind_queroseno;


}
