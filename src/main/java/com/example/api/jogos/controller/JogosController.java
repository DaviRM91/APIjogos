package com.example.api.jogos.controller;

import com.example.api.jogos.model.Jogos;
import com.example.api.jogos.repository.JogosRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    private JogosRepositorio jogosRepositorio;

    public JogosController(JogosRepositorio jogosRepositorio){
        this.jogosRepositorio = jogosRepositorio;
    }

    @GetMapping("/{id}")
    public Jogos obterPorId(@PathVariable("id") String id){
        return jogosRepositorio.findById(id).orElse(null);
    }

    @PostMapping
    public void salvar(@RequestBody Jogos jogos){
        String id = UUID.randomUUID().toString();
        jogos.setId(id);
        jogosRepositorio.save(jogos);

        System.out.println("Jogo recebido" + jogos);
    }

    @DeleteMapping({"/{id}"})
    public void deletar(@PathVariable("id") String id){
        jogosRepositorio.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Jogos jogos) {
        jogos.setId(id);
        jogosRepositorio.save(jogos);
    }
}
