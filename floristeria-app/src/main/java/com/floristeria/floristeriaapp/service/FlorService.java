package com.floristeria.floristeriaapp.service;

import com.floristeria.floristeriaapp.model.Flor;
import com.floristeria.floristeriaapp.repository.FlorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlorService {

    @Autowired
    private FlorRepository florRepository;

    public List<Flor> obtenerTodasLasFlores() {
        return florRepository.findAll();
    }

    public Flor agregarFlor(Flor flor) {
        return florRepository.save(flor);
    }

    public Flor actualizarFlor(Flor flor) {
        return florRepository.save(flor);
    }

    public void eliminarFlor(Long id) {
        florRepository.deleteById(id);
    }
}
