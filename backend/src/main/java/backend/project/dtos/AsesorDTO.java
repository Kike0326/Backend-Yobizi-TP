package backend.project.dtos;

public class AsesorDTO {
    private Integer id_Asesor;
    private String nombre_Asesor;
    private String apellido_Asesor;

    public Integer getId_Asesor() {
        return id_Asesor;
    }

    public void setId_Asesor(Integer id_Asesor) {
        this.id_Asesor = id_Asesor;
    }

    public String getNombre_Asesor() {
        return nombre_Asesor;
    }

    public void setNombre_Asesor(String nombre_Asesor) {
        this.nombre_Asesor = nombre_Asesor;
    }

    public String getApellido_Asesor() {
        return apellido_Asesor;
    }

    public void setApellido_Asesor(String apellido_Asesor) {
        this.apellido_Asesor = apellido_Asesor;
    }
}
