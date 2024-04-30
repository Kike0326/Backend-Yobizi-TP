package backend.project.services;
import backend.project.entities.Distrito;

import java.util.List;

public interface DistritoService {

    public Distrito save (Distrito distrito);
    public void delete (Distrito distrito);
    public Distrito findById(int id);
    public List<Distrito> findAllDistrito();

}
