package backend.project.controllers;
import backend.project.entities.Asesor;
import backend.project.entities.Empleador;
import backend.project.services.AsesorService;
import backend.project.services.EmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/asesores")
public class AsesorController {
    @Autowired
    private AsesorService asesorService;

    @PostMapping("asesor/registrar")
    public ResponseEntity<Asesor> create(@RequestBody Asesor asesor) {
        Asesor nuevoAsesor = asesorService.save(asesor);
        return new ResponseEntity<Asesor>(nuevoAsesor, HttpStatus.CREATED);

    }

    @PutMapping("asesor/actualizar")
    public Asesor update(@RequestBody Asesor asesor) {
        return asesorService.save(asesor);
    }
    @DeleteMapping("asesor/eliminar/{id}")
    public void delete(@PathVariable Integer id) {
        Asesor asesor = asesorService.findById(id);
        asesorService.delete(asesor);
    }

    @GetMapping("asesor/{id}")
    public Asesor findById(@PathVariable Integer id) {
        return asesorService.findById(id);
    }

    @GetMapping("asesor/todos")
    public  ResponseEntity<List<Asesor>> findAll() {
        List<Asesor> asesor = asesorService.ListAllAsesor();
        return new ResponseEntity<List<Asesor>>(asesor, HttpStatus.OK);
    }
}
