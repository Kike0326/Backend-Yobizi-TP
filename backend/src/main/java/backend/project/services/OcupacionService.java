package backend.project.services;

import backend.project.entities.Ocupacion;

import java.util.List;

public interface OcupacionService {
    Ocupacion save(Ocupacion ocupacion);

    void delete(Ocupacion ocupacion);

    List<Ocupacion> ListAllOcupacion();

    List<Ocupacion>findOcupacionByName(String name);

    Ocupacion findById(int id);
}
