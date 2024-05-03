package backend.project.services;

import backend.project.entities.Contrato;

import java.util.List;

public interface ContratoService {

    public Contrato save (Contrato contrato);
    public void delete (Contrato contrato);
    public Contrato findById(int id);
    public List<Contrato> findAllContrato();

}
