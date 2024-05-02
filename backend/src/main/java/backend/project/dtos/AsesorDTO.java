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
@Table(name ="Asesor")
public class AsesorDTO implements Serializable{
    @Id
    @Column(name = "id_Asesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Asesor;
    @Column(name ="nombre_Asesor",nullable = false,length = 50)
    private String nombre_Asesor;
    @Column(name="apellido_Asesor",nullable = false,length = 100)
    private String apellido_Asesor;
    @Column(name = "correo_Asesor",nullable = false,length = 100)
    private String correo_Asesor;
}
