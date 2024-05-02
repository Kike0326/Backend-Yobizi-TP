package backend.project.services;

import backend.project.entities.ContratoXTrabajador;

import java.util.List;

public interface ContratoXTrabajadorService {
    ContratoXTrabajador save(ContratoXTrabajador contratoXTrabajador);

    void delete(ContratoXTrabajador contratoXTrabajador);

    ContratoXTrabajador findById(int id);

    List<ContratoXTrabajador> ListAllContratoXTrabajador();

    List<ContratoXTrabajador> findContratoXTrabajadorByName(String name);
}
