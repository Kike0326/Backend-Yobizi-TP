package backend.project.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table (name = "Users")
public class Users implements Serializable {
    @Id
    @Column (name="id_Users")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Users;
}
