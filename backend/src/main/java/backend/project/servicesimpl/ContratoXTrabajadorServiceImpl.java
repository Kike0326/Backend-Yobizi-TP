package backend.project.servicesimpl;

import backend.project.entities.ContratoXTrabajador;
import backend.project.repositories.ContratoXTrabajadorRepository;
import backend.project.services.ContratoXTrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ContratoXTrabajadorServiceImpl implements ContratoXTrabajadorService {

    @Autowired
    private ContratoXTrabajadorRepository contratoXTrabajadorRepository;

    @Override
    public ContratoXTrabajador save(ContratoXTrabajador contratoXTrabajador) {
        return contratoXTrabajadorRepository.save(contratoXTrabajador);
    }

    @Override
    public void delete(ContratoXTrabajador contratoXTrabajador) {

    }

    @Override
    public ContratoXTrabajador findById(int id) {
        ContratoXTrabajador contratoXTrabajador = contratoXTrabajadorRepository.findById(id).orElse(null);
        System.out.println(id);
        if (contratoXTrabajador == null) {
            throw new EntityNotFoundException("No se encuentra contrato por trabajador con el siguiente id: "+String.valueOf(id));

        }
        return contratoXTrabajador;
    }

    @Override
    public List<ContratoXTrabajador> ListAllContratoXTrabajador() {
        return List.of();
    }

    @Override
    public List<ContratoXTrabajador> findContratoXTrabajadorByName(String name) {
        return List.of();
    }
}
