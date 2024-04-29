package backend.project.controllers;
import backend.project.entities.Empleador;
import backend.project.services.EmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpleadorController {
    @Autowired
    private EmpleadorService empleadorService;

    @PostMapping("empleador/registrar")
    public ResponseEntity<Empleador> create(@RequestBody Empleador empleador) {
        Empleador nuevoEmpleador = empleadorService.save(empleador);
      return new ResponseEntity<Empleador>(nuevoEmpleador, HttpStatus.CREATED);

    }

    @PutMapping("empleador/actualizar")
    public Empleador update(@RequestBody Empleador empleador) {
        return empleadorService.save(empleador);
    }
    @DeleteMapping("empleador/eliminar/{id}")
    public void delete(@PathVariable Integer id) {
        Empleador empleador = empleadorService.findById(id);
        empleadorService.delete(empleador);
    }

    @GetMapping("empleador/{id}")
    public Empleador findById(@PathVariable Integer id) {
        return empleadorService.findById(id);
    }

    @GetMapping("empleador/todos")
    public  ResponseEntity<List<Empleador>> findAll() {
        List<Empleador> empleador = empleadorService.ListAllEmpleador();
        return new ResponseEntity<List<Empleador>>(empleador, HttpStatus.OK);
    }



}
