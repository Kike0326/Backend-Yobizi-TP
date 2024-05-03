package backend.project.controllers;


import backend.project.entities.Contrato;
import backend.project.services.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContratoController {
    @Autowired
    private ContratoService contratoService;
    
    @PostMapping("contrato/registrar")
    public ResponseEntity<Contrato> create(@RequestBody Contrato contrato) {
        Contrato nuevocontrato = contratoService.save(contrato);
        return new ResponseEntity<Contrato>(nuevocontrato, HttpStatus.CREATED);
    }

    @PutMapping("contrato/actualizar")
    public Contrato update(@RequestBody Contrato contrato) {
        return contratoService.save(contrato);
    }
    @DeleteMapping("contrato/eliminar/{id}")
    public void delete(@PathVariable Integer id) {
        Contrato contrato = contratoService.findById(id);
        contratoService.delete(contrato);
    }

    @GetMapping("contrato/{id}")
    public Contrato findById(@PathVariable Integer id) {
        return contratoService.findById(id);
    }

    @GetMapping("contrato/todos")
    public  ResponseEntity<List<Contrato>> findAll() {
        List<Contrato> contrato = contratoService.findAllContrato();
        return new ResponseEntity<List<Contrato>>(contrato, HttpStatus.OK);
    }


}
