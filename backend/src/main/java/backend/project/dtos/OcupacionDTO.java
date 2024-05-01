package backend.project.dtos;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name ="Ocupacion")
public class OcupacionDTO implements Serializable {
    @Id
    @Column(name="id_Ocupacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Ocupacion;
    @Column(name ="nombre_Ocupacion",nullable = false, length = 50)
    private String nombre_Ocupacion;
    @Column(name ="descripcion",nullable = false, length = 50)
    private String descripcion;
}
