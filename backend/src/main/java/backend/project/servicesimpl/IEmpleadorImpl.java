package backend.project.servicesimpl;
import backend.project.entities.Empleador;
import backend.project.repositories.EmpleadorRepository;
import backend.project.services.EmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class IEmpleadorImpl implements EmpleadorService {

    @Autowired
    EmpleadorRepository empleadorRepository;

    @Override
    public Empleador save(Empleador empleador) {
        return empleadorRepository.save(empleador);
    }

    @Override
    public void delete(Empleador empleador) {
    empleadorRepository.delete(empleador);
    }

    @Override
    public Empleador findById(int id) {
        Empleador empleador = empleadorRepository.findById(id).orElse(null);
        if (empleador == null) {
throw new EntityNotFoundException("No se encuentra Empleador con el siguiente id: "+String.valueOf(id));

        }
        return empleador;
    }

    @Override
    public List<Empleador> findAllEmpleador() {
        return empleadorRepository.findAll();
    }

    @Override
    public List<Empleador> findEmpleadorByName(String name) {
        return List.of();
    }

}
