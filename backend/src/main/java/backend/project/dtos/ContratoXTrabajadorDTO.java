package backend.project.dtos;

import backend.project.entities.Contrato;
import backend.project.entities.Ocupacion;

public class ContratoXTrabajadorDTO {
    private Integer id_ContratoXTrabajador;
    private boolean estado_ContratoXTrabajador;
    private String descripcion_actividad;
    private Contrato contrato;
    private Ocupacion ocupacion;

    public Integer getId_ContratoXTrabajador() {
        return id_ContratoXTrabajador;
    }

    public void setId_ContratoXTrabajador(Integer id_ContratoXTrabajador) {
        this.id_ContratoXTrabajador = id_ContratoXTrabajador;
    }

    public boolean isEstado_ContratoXTrabajador() {
        return estado_ContratoXTrabajador;
    }

    public void setEstado_ContratoXTrabajador(boolean estado_ContratoXTrabajador) {
        this.estado_ContratoXTrabajador = estado_ContratoXTrabajador;
    }

    public String getDescripcion_actividad() {
        return descripcion_actividad;
    }

    public void setDescripcion_actividad(String descripcion_actividad) {
        this.descripcion_actividad = descripcion_actividad;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }
}
