package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return avaliacaoFisicaRepository.findAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody  AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    }
