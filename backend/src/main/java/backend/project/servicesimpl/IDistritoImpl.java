package backend.project.servicesimpl;

import backend.project.entities.Distrito;
import backend.project.repositories.DistritoRepository;
import backend.project.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class IDistritoImpl implements DistritoService {
    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public Distrito save (Distrito distrito) {
        return distritoRepository.save(distrito);
    }

    @Override
    public void delete(Distrito distrito) {
    distritoRepository.delete(distrito);
    }

    @Override
    public Distrito findById(int id) {
        Distrito distrito = distritoRepository.findById(id).orElse(null);
        if (distrito == null) {
            throw new EntityNotFoundException("No se encuentra Distrito con el siguiente id: "+String.valueOf(id));
        }
        return distrito;

    }

    @Override
    public List<Distrito> findAllDistrito() {
        return List.of();
    }


}
