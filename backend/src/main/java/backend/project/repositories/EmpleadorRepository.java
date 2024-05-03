package backend.project.repositories;
import backend.project.entities.Empleador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadorRepository extends JpaRepository <Empleador, Integer> {
}
