package backend.project.services;

import backend.project.entities.Trabajador;

import java.util.List;

public interface TrabajadorService {

    public Trabajador save (Trabajador trabajador);
    public void delete (int id);
    public Trabajador findbyId (int id);
    public List<Trabajador> findAll();
}
