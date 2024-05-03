package backend.project.controllers;


import backend.project.entities.Ocupacion;
import backend.project.services.OcupacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocupaciones")
public class OcupacionController {
    @Autowired
    private OcupacionService ocupacionService;

    @PostMapping("ocupacion/registrar")
    public ResponseEntity<Ocupacion> create(@RequestBody Ocupacion ocupacion) {
        Ocupacion nuevoOcupacion = ocupacionService.save(ocupacion);
        return new ResponseEntity<Ocupacion>(nuevoOcupacion, HttpStatus.CREATED);
    }

    @PutMapping("ocupacion/actualizar")
    public Ocupacion update(@RequestBody Ocupacion ocupacion) {
        return ocupacionService.save(ocupacion);
    }

    @DeleteMapping("ocupacion/eliminar/{id}")
    public void delete(@PathVariable Integer id) {
        Ocupacion ocupacion = ocupacionService.findById(id);
        ocupacionService.delete(ocupacion);
    }
    @GetMapping("ocupacion/{id}")
    public Ocupacion findById(@PathVariable Integer id) {
        return ocupacionService.findById(id);
    }

    @GetMapping("ocupacion/todos")
    public  ResponseEntity<List<Ocupacion>> findAll() {
        List<Ocupacion> ocupacion = ocupacionService.ListAllOcupacion();
        return new ResponseEntity<List<Ocupacion>>(ocupacion, HttpStatus.OK);
    }
}
