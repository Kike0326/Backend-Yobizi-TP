package backend.project.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name ="ContratoXTrabajador")
public class ContratoXTrabajador implements Serializable {
    @Id
    @Column(name = "id_ContratoXTrabajador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ContratoXTrabajador;
    @Column(name = "estado_ContratoXTrabajador",nullable = false,length = 100)
    private String estado_ContratoXTrabajador;
    @Column(name="descripcion_actividad",nullable = false,length = 100)
    private String descripcion_actividad;

}
