package backend.project.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "Trabajador")
public class Trabajador implements Serializable {
    @Id
    @Column(name = "id_Trabajador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Trabajador;  // recomendable idTrabajador

    @Column(name = "nombre_Trabajador",nullable = false, length = 50)
    private String nombre_Trabajador;
    @Column(name = "apellido_Empleador",nullable = false, length = 50)
    private String apellido_Empleador;
    @Column(name = "fechaNacimiento_Trabaja",nullable = false)
    private Date fechaNacimiento_Trabaja;
    @Column(name = "direccion_Trabajador",nullable = false, length = 50)
    private String direccion_Trabajador;
    @Column(name = "correo_Trabajador",nullable = false,length = 50)
    private String correo_Trabajador;
    @Column(name = "celular_Trabajador",nullable = false, length = 50)
    private double celular_Trabajador;
    @Column(name = "Asesor_id_Asesor")
    private Integer asesor_id_Asesor;
    @Column(name = "estado_Trabajador")
    private boolean estado_Trabajador;
    @Column(name = "users_id")
    private Integer users_id;
}
