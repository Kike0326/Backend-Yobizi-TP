package backend.project.dtos;

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
@Table(name ="Empleador")
public class EmpleadorDTO implements Serializable {
    @Id
    @Column(name = "id_Empleador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Empleador;
    //@ManyToOne
    //@JoinColumn(name ="user_id")
    //private Users users_id;
    @Column(name ="nombre_Empleador", length = 50)
    private String nombre_Empleador;
    @Column(name ="apellido_Empleador", length = 50)
    private String apellido_Empleador;
    @Column(name ="fecha_Nacimiento_Empleador")
    private Date fecha_Nacimiento_Empleador;
    @Column(name ="direccion_Empleador", length = 50)
    private String direccion_Empleador;
    @Column(name ="celular_Empleador",length = 9)
    private String celular_Empleador;
    @Column(name ="correo_Empleador",length = 50)
    private String correo_Empleador;

}
