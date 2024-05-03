package backend.project.controllers;
import backend.project.entities.Distrito;
import backend.project.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DistritoController {
    @Autowired
    private DistritoService distritoService;

    @PostMapping("distrito/registrar")
    public ResponseEntity<Distrito> create(@RequestBody Distrito distrito) {
        Distrito nuevoDistrito = distritoService.save(distrito);
        return new ResponseEntity<Distrito>(nuevoDistrito, HttpStatus.CREATED);
    }

    @PutMapping("distrito/actualizar")
    public Distrito update(@RequestBody Distrito distrito) {
        return distritoService.save(distrito);
    }
    @DeleteMapping("distrito/eliminar/{id}")
    public void delete(@PathVariable Integer id) {
        Distrito distrito = distritoService.findById(id);
        distritoService.delete(distrito);
    }

    @GetMapping("distrito/{id}")
    public Distrito findById(@PathVariable Integer id) {
        return distritoService.findById(id);
    }

    @GetMapping("distrito/todos")
    public  ResponseEntity<List<Distrito>> findAll() {
        List<Distrito> distrito = distritoService.findAllDistrito();
        return new ResponseEntity<List<Distrito>>(distrito, HttpStatus.OK);
    }

}
