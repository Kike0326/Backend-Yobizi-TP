package backend.project.controllers;
import backend.project.entities.ContratoXTrabajador;
import backend.project.services.ContratoXTrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ContratoXTrabajadores")
public class ContratoXTrabajadorController {
    @Autowired
    ContratoXTrabajadorService contratoXTrabajadorService;

    @PostMapping("ContratoXTrabajador/registrar")
    public ResponseEntity<ContratoXTrabajador> create(@RequestBody ContratoXTrabajador contratoXTrabajador) {
        ContratoXTrabajador nuevoContratoXTrabajador= contratoXTrabajadorService.save(contratoXTrabajador);
        return new ResponseEntity<ContratoXTrabajador>(nuevoContratoXTrabajador, HttpStatus.CREATED);

    }

    @PutMapping("ContratoXTrabajador/actualizar")
    public ContratoXTrabajador update(@RequestBody ContratoXTrabajador contratoXTrabajador) {
        return contratoXTrabajadorService.save(contratoXTrabajador);
    }

    @DeleteMapping("ContratoXTrabajador/eliminar/{id}")
    public void delete(@PathVariable Integer id) {
        ContratoXTrabajador contratoXTrabajador = contratoXTrabajadorService.findById(id);
        contratoXTrabajadorService.delete(contratoXTrabajador);
    }

    @GetMapping("ContratoXTrabajador/{id}")
    public ContratoXTrabajador findById(@PathVariable Integer id) {
        return contratoXTrabajadorService.findById(id);
    }

    @GetMapping("ContratoXTrabajador/todos")
    public  ResponseEntity<List<ContratoXTrabajador>> findAll() {
        List<ContratoXTrabajador> contratoXTrabajadors = contratoXTrabajadorService.ListAllContratoXTrabajador();
        return new ResponseEntity<List<ContratoXTrabajador>>(contratoXTrabajadors, HttpStatus.OK);
    }
}
