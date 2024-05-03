package backend.project.dtos;


public class OcupacionDTO {
   private Integer id_Ocupacion;
   private String nombre_Ocupacion;
   private String descripcion;

    public Integer getId_Ocupacion() {return id_Ocupacion;}

    public void setId_Ocupacion(Integer id_Ocupacion) {this.id_Ocupacion = id_Ocupacion;}

    public String getNombre_Ocupacion() {return nombre_Ocupacion;}

    public void setNombre_Ocupacion(String nombre_Ocupacion) {this.nombre_Ocupacion = nombre_Ocupacion;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
}
