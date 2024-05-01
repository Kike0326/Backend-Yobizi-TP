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
@Table(name="Trabajador")
public class Trabajador implements Serializable {
    @Id
    @Column(name="id_Trabajador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Trabajador;
}
