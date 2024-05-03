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
    @Column(name = "estado_ContratoXTrabajador",nullable = false)
    private boolean estado_ContratoXTrabajador;
    @Column(name="descripcion_actividad",nullable = false,length = 100)
    private String descripcion_actividad;
    @ManyToOne
    @JoinColumn(name="id_Contrato",nullable = false)
    private Contrato contrato;
    @ManyToOne
    @JoinColumn(name="id_Ocupacion", nullable = false)
    private Ocupacion ocupacion;
}
