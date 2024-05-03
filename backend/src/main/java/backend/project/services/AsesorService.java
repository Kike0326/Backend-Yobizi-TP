package backend.project.services;

import backend.project.entities.Asesor;

import java.util.List;

public interface AsesorService {
    Asesor save(Asesor asesor);

    void delete(Asesor asesor);

    Asesor findById(int id);

    List<Asesor> ListAllAsesor();

    List<Asesor> findAsesorByName(String name);
}
