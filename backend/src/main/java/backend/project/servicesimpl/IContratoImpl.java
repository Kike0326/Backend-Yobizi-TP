package backend.project.servicesimpl;

import backend.project.entities.Contrato;
import backend.project.repositories.ContratoRepository;
import backend.project.services.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class IContratoImpl implements ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Contrato save(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public void delete(Contrato contrato) {
        contratoRepository.delete(contrato);
    }

    @Override
    public Contrato findById(int id) {
        Contrato contrato = contratoRepository.findById(id).orElse(null);
        if (contrato == null) {
            throw new EntityNotFoundException("No se encuentra Contrato con el siguiente id: "+String.valueOf(id));
        }
        return contrato;
    }

    @Override
    public List<Contrato> findAllContrato() {
        return contratoRepository.findAll();
    }
}
