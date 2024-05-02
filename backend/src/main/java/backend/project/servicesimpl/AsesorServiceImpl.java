package backend.project.servicesimpl;

import backend.project.entities.Asesor;
import backend.project.repositories.AsesorRepository;
import backend.project.services.AsesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AsesorServiceImpl implements AsesorService {

    @Autowired
    private AsesorRepository asesorRepository;

    @Override
    public Asesor save(Asesor asesor) {
        return asesorRepository.save(asesor);
    }

    @Override
    public void delete(Asesor asesor) {

    }

    @Override
    public Asesor findById(int id) {
        Asesor asesor = asesorRepository.findById(id).orElse(null);
        System.out.println(id);
        if (asesor == null) {
            throw new EntityNotFoundException("No se encuentra asesor con el siguiente id: "+String.valueOf(id));

        }
        return asesor;
    }

    @Override
    public List<Asesor> ListAllAsesor() {
        return List.of();
    }

    @Override
    public List<Asesor> findAsesorByName(String name) {
        return List.of();
    }

}
