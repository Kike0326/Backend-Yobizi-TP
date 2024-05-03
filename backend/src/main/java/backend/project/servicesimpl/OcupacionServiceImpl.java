package backend.project.servicesimpl;

import backend.project.entities.Ocupacion;
import backend.project.repositories.OcupacionRepository;
import backend.project.services.OcupacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class OcupacionServiceImpl implements OcupacionService {
    @Autowired
    OcupacionRepository ocupacionRepository;

    @Override
    public Ocupacion save(Ocupacion ocupacion) {return ocupacionRepository.save(ocupacion);}

    @Override
    public void delete(Ocupacion ocupacion){
    }
    @Override
    public List<Ocupacion>ListAllOcupacion(){return List.of();}

    @Override
    public List<Ocupacion>findOcupacionByName(String name){return List.of();}
    @Override
    public Ocupacion findById(int id) {
        Ocupacion ocupacion = ocupacionRepository.findById(id).orElse(null);
        System.out.println(id);
        if (ocupacion == null) {
            throw new EntityNotFoundException("No se encuentran ocupaciones con el siguiente id: "+String.valueOf(id));

        }
        return ocupacion;
    }

}
