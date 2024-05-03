package backend.project.services;

import backend.project.entities.Empleador;

import java.util.List;

public interface EmpleadorService {

    public Empleador save(Empleador empleador);
    public void delete(Empleador empleador);
    public Empleador findById(int id);
    public List<Empleador> ListAllEmpleador();
    public List<Empleador> findEmpleadorByName(String name);
}

