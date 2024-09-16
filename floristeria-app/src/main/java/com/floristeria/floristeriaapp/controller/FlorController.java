package com.floristeria.floristeriaapp.controller;

import com.floristeria.floristeriaapp.model.Flor;
import com.floristeria.floristeriaapp.service.FlorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flores")
public class FlorController {

    @Autowired
    private FlorService florService;

    @GetMapping
    public List<Flor> listarFlores() {
        return florService.obtenerTodasLasFlores();
    }

    @PostMapping
    public Flor agregarFlor(@RequestBody Flor flor) {
        return florService.agregarFlor(flor);
    }

    

    @PutMapping("/{id}")
    public Flor actualizarFlor(@PathVariable Long id, @RequestBody Flor flor) {
        flor.setId(id);
        return florService.actualizarFlor(flor);
    }

    @DeleteMapping("/{id}")
    public void eliminarFlor(@PathVariable Long id) {
        florService.eliminarFlor(id);
    }
}
