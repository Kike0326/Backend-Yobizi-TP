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
@Table(name ="Distrito")
public class Distrito implements Serializable {
    @Id
    @Column(name = "id_Distrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Distrito;
    @Column(name ="nombre_Distrito",nullable = false, length = 50)
    private String nombre_Distrito;
}
