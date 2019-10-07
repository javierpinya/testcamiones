package com.javierpinya.testcamiones.Clases;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.javierpinya.testcamiones.Constants.Constants;

import java.util.Date;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = Constants.NAME_TABLE_INSPECCION,
        indices = {@Index(value = {"id"}, unique = true),
                    @Index(value = {"tractoraId"}, unique = true),
                    @Index(value = {"cisternaId"}, unique = true),
                    @Index(value = {"transportistaId"}, unique = true),
                    @Index(value = {"conductorId"}, unique = true)},
        foreignKeys = {
                @ForeignKey(entity = TacprcoEntity.class,
                        parentColumns = "id",
                        childColumns = "tractoraId",
                        onDelete = CASCADE),
                @ForeignKey(entity = TacsecoEntity.class,
                        parentColumns = "id",
                        childColumns = "cisternaId",
                        onDelete = CASCADE),
                @ForeignKey(entity = TaccatrEntity.class,
                        parentColumns = "id",
                        childColumns = "transportistaId",
                        onDelete = CASCADE),
                @ForeignKey(entity = TaccondEntity.class,
                        parentColumns = "id",
                        childColumns = "conductorId",
                        onDelete = CASCADE)
        }
)
public class InspeccionEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String inspeccion;
    public String inspector;
    public String instalacion;
    public int tractoraId;
    public int cisternaId;
    public Date fechaInicioInspeccion;
    public String albaran;
    public int conductorId;
    public int transportistaId;
    public String slo;
    public String empresaTablaCalibracion;
    public String tipoComponente;
    public boolean isTInspeccionada;
    public boolean isTFavorable;
    public boolean isTRevisada;
    public boolean isTBloqueada;
    public boolean isCInspeccionada;
    public boolean isCFavorable;
    public boolean isCRevisada;
    public boolean isCBloqueada;
    public String observaciones;
    public Date fechaFinInspeccion;
    public boolean isPermisoConducir;
    public boolean isAdrConductor;
    public boolean isItvTractora;
    public boolean isAdrTractora;
    public boolean isItvCisterna;
    public boolean isAdrCisterna;
    public boolean isFichaSeguridad;
    public Date fechaTablaCalibracion;
    public boolean isChipTractora;
    public boolean isChipCisterna;
    public boolean isSuperficieAntideslizante;
    public boolean isPosicionamientoAdecuadoEnIsleta;
    public boolean isAccFrenoEstacionamientoMarchaCorta;
    public boolean isAccDesBaterias;
    public boolean isApagallamas;
    public boolean isDescTfnoMovil;
    public boolean isInterruptorEmergenciaYFuego;
    public boolean isConexionTomaTierra;
    public boolean isConexionMangueraGases;
    public boolean isPurgaCompartimentos;
    public boolean isRopaSeguridad;
    public boolean isEstanqueidadCisterna;
    public boolean isEstanqueidadValvulasApi;
    public boolean isEstanqueidadCajon;
    public boolean isRecogerAlbaran;
    public boolean isTC2;
    public boolean isMontajeCorrectoTags;
    public boolean isBajadaTagPlanta;
    public boolean isLecturaTagIsleta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(String inspeccion) {
        this.inspeccion = inspeccion;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public int getTractoraId() {
        return tractoraId;
    }

    public void setTractoraId(int tractoraId) {
        this.tractoraId = tractoraId;
    }

    public int getCisternaId() {
        return cisternaId;
    }

    public void setCisternaId(int cisternaId) {
        this.cisternaId = cisternaId;
    }

    public Date getFechaInicioInspeccion() {
        return fechaInicioInspeccion;
    }

    public void setFechaInicioInspeccion(Date fechaInicioInspeccion) {
        this.fechaInicioInspeccion = fechaInicioInspeccion;
    }

    public String getAlbaran() {
        return albaran;
    }

    public void setAlbaran(String albaran) {
        this.albaran = albaran;
    }

    public int getConductorId() {
        return conductorId;
    }

    public void setConductorId(int conductorId) {
        this.conductorId = conductorId;
    }

    public int getTransportistaId() {
        return transportistaId;
    }

    public void setTransportistaId(int transportistaId) {
        this.transportistaId = transportistaId;
    }

    public String getSlo() {
        return slo;
    }

    public void setSlo(String slo) {
        this.slo = slo;
    }

    public String getEmpresaTablaCalibracion() {
        return empresaTablaCalibracion;
    }

    public void setEmpresaTablaCalibracion(String empresaTablaCalibracion) {
        this.empresaTablaCalibracion = empresaTablaCalibracion;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public boolean isTInspeccionada() {
        return isTInspeccionada;
    }

    public void setTInspeccionada(boolean TInspeccionada) {
        isTInspeccionada = TInspeccionada;
    }

    public boolean isTFavorable() {
        return isTFavorable;
    }

    public void setTFavorable(boolean TFavorable) {
        isTFavorable = TFavorable;
    }

    public boolean isTRevisada() {
        return isTRevisada;
    }

    public void setTRevisada(boolean TRevisada) {
        isTRevisada = TRevisada;
    }

    public boolean isTBloqueada() {
        return isTBloqueada;
    }

    public void setTBloqueada(boolean TBloqueada) {
        isTBloqueada = TBloqueada;
    }

    public boolean isCInspeccionada() {
        return isCInspeccionada;
    }

    public void setCInspeccionada(boolean CInspeccionada) {
        isCInspeccionada = CInspeccionada;
    }

    public boolean isCFavorable() {
        return isCFavorable;
    }

    public void setCFavorable(boolean CFavorable) {
        isCFavorable = CFavorable;
    }

    public boolean isCRevisada() {
        return isCRevisada;
    }

    public void setCRevisada(boolean CRevisada) {
        isCRevisada = CRevisada;
    }

    public boolean isCBloqueada() {
        return isCBloqueada;
    }

    public void setCBloqueada(boolean CBloqueada) {
        isCBloqueada = CBloqueada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaFinInspeccion() {
        return fechaFinInspeccion;
    }

    public void setFechaFinInspeccion(Date fechaFinInspeccion) {
        this.fechaFinInspeccion = fechaFinInspeccion;
    }

    public boolean isPermisoConducir() {
        return isPermisoConducir;
    }

    public void setPermisoConducir(boolean permisoConducir) {
        isPermisoConducir = permisoConducir;
    }

    public boolean isAdrConductor() {
        return isAdrConductor;
    }

    public void setAdrConductor(boolean adrConductor) {
        isAdrConductor = adrConductor;
    }

    public boolean isItvTractora() {
        return isItvTractora;
    }

    public void setItvTractora(boolean itvTractora) {
        isItvTractora = itvTractora;
    }

    public boolean isAdrTractora() {
        return isAdrTractora;
    }

    public void setAdrTractora(boolean adrTractora) {
        isAdrTractora = adrTractora;
    }

    public boolean isItvCisterna() {
        return isItvCisterna;
    }

    public void setItvCisterna(boolean itvCisterna) {
        isItvCisterna = itvCisterna;
    }

    public boolean isAdrCisterna() {
        return isAdrCisterna;
    }

    public void setAdrCisterna(boolean adrCisterna) {
        isAdrCisterna = adrCisterna;
    }

    public boolean isFichaSeguridad() {
        return isFichaSeguridad;
    }

    public void setFichaSeguridad(boolean fichaSeguridad) {
        isFichaSeguridad = fichaSeguridad;
    }

    public Date getFechaTablaCalibracion() {
        return fechaTablaCalibracion;
    }

    public void setFechaTablaCalibracion(Date fechaTablaCalibracion) {
        this.fechaTablaCalibracion = fechaTablaCalibracion;
    }

    public boolean isChipTractora() {
        return isChipTractora;
    }

    public void setChipTractora(boolean chipTractora) {
        isChipTractora = chipTractora;
    }

    public boolean isChipCisterna() {
        return isChipCisterna;
    }

    public void setChipCisterna(boolean chipCisterna) {
        isChipCisterna = chipCisterna;
    }

    public boolean isSuperficieAntideslizante() {
        return isSuperficieAntideslizante;
    }

    public void setSuperficieAntideslizante(boolean superficieAntideslizante) {
        isSuperficieAntideslizante = superficieAntideslizante;
    }

    public boolean isPosicionamientoAdecuadoEnIsleta() {
        return isPosicionamientoAdecuadoEnIsleta;
    }

    public void setPosicionamientoAdecuadoEnIsleta(boolean posicionamientoAdecuadoEnIsleta) {
        isPosicionamientoAdecuadoEnIsleta = posicionamientoAdecuadoEnIsleta;
    }

    public boolean isAccFrenoEstacionamientoMarchaCorta() {
        return isAccFrenoEstacionamientoMarchaCorta;
    }

    public void setAccFrenoEstacionamientoMarchaCorta(boolean accFrenoEstacionamientoMarchaCorta) {
        isAccFrenoEstacionamientoMarchaCorta = accFrenoEstacionamientoMarchaCorta;
    }

    public boolean isAccDesBaterias() {
        return isAccDesBaterias;
    }

    public void setAccDesBaterias(boolean accDesBaterias) {
        isAccDesBaterias = accDesBaterias;
    }

    public boolean isApagallamas() {
        return isApagallamas;
    }

    public void setApagallamas(boolean apagallamas) {
        isApagallamas = apagallamas;
    }

    public boolean isDescTfnoMovil() {
        return isDescTfnoMovil;
    }

    public void setDescTfnoMovil(boolean descTfnoMovil) {
        isDescTfnoMovil = descTfnoMovil;
    }

    public boolean isInterruptorEmergenciaYFuego() {
        return isInterruptorEmergenciaYFuego;
    }

    public void setInterruptorEmergenciaYFuego(boolean interruptorEmergenciaYFuego) {
        isInterruptorEmergenciaYFuego = interruptorEmergenciaYFuego;
    }

    public boolean isConexionTomaTierra() {
        return isConexionTomaTierra;
    }

    public void setConexionTomaTierra(boolean conexionTomaTierra) {
        isConexionTomaTierra = conexionTomaTierra;
    }

    public boolean isConexionMangueraGases() {
        return isConexionMangueraGases;
    }

    public void setConexionMangueraGases(boolean conexionMangueraGases) {
        isConexionMangueraGases = conexionMangueraGases;
    }

    public boolean isPurgaCompartimentos() {
        return isPurgaCompartimentos;
    }

    public void setPurgaCompartimentos(boolean purgaCompartimentos) {
        isPurgaCompartimentos = purgaCompartimentos;
    }

    public boolean isRopaSeguridad() {
        return isRopaSeguridad;
    }

    public void setRopaSeguridad(boolean ropaSeguridad) {
        isRopaSeguridad = ropaSeguridad;
    }

    public boolean isEstanqueidadCisterna() {
        return isEstanqueidadCisterna;
    }

    public void setEstanqueidadCisterna(boolean estanqueidadCisterna) {
        isEstanqueidadCisterna = estanqueidadCisterna;
    }

    public boolean isEstanqueidadValvulasApi() {
        return isEstanqueidadValvulasApi;
    }

    public void setEstanqueidadValvulasApi(boolean estanqueidadValvulasApi) {
        isEstanqueidadValvulasApi = estanqueidadValvulasApi;
    }

    public boolean isEstanqueidadCajon() {
        return isEstanqueidadCajon;
    }

    public void setEstanqueidadCajon(boolean estanqueidadCajon) {
        isEstanqueidadCajon = estanqueidadCajon;
    }

    public boolean isRecogerAlbaran() {
        return isRecogerAlbaran;
    }

    public void setRecogerAlbaran(boolean recogerAlbaran) {
        isRecogerAlbaran = recogerAlbaran;
    }

    public boolean isTC2() {
        return isTC2;
    }

    public void setTC2(boolean TC2) {
        isTC2 = TC2;
    }

    public boolean isMontajeCorrectoTags() {
        return isMontajeCorrectoTags;
    }

    public void setMontajeCorrectoTags(boolean montajeCorrectoTags) {
        isMontajeCorrectoTags = montajeCorrectoTags;
    }

    public boolean isBajadaTagPlanta() {
        return isBajadaTagPlanta;
    }

    public void setBajadaTagPlanta(boolean bajadaTagPlanta) {
        isBajadaTagPlanta = bajadaTagPlanta;
    }

    public boolean isLecturaTagIsleta() {
        return isLecturaTagIsleta;
    }

    public void setLecturaTagIsleta(boolean lecturaTagIsleta) {
        isLecturaTagIsleta = lecturaTagIsleta;
    }
}
