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
@Table(name ="Contrato")
public class Contrato implements Serializable{
    @Id
    @Column(name = "id_Contrato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Contrato;
    @Column(name ="ubicacion_Contrato",nullable = false, length = 50)
    private String ubicacion_Contrato;
    @Column(name ="fecha_Contrato",nullable = false)
    private Date fecha_Contrato;
    @Column(name ="estado_Contrato",nullable = false, length = 50)
    private String estado_Contrato;
    @Column(name ="monto_Contrato",nullable = false, length = 50)
    private Integer monto_Contrato;
    @ManyToOne
    @JoinColumn(name ="Empleador_id")
    private Empleador id_Empleador;
}
