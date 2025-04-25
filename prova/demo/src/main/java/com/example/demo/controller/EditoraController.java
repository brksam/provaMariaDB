package com.example.demo.controller;

import com.example.demo.model.Editora;
import com.example.demo.repository.EditoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
@RequiredArgsConstructor
public class EditoraController {

    private final EditoraRepository editoraRepository;

    @GetMapping
    public List<Editora> listarTodas() {
        return editoraRepository.findAll();
    }

    @PostMapping
    public Editora criar(@RequestBody Editora editora) {
        return editoraRepository.save(editora);
    }

    @PutMapping("/{id}")
    public Editora atualizar(@PathVariable Long id, @RequestBody Editora editoraAtualizada) {
        return editoraRepository.findById(id)
            .map(editora -> {
                editora.setNome(editoraAtualizada.getNome());
                editora.setPais(editoraAtualizada.getPais());
                return editoraRepository.save(editora);
            }).orElseThrow(() -> new RuntimeException("Editora não encontrada"));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        editoraRepository.deleteById(id);
    }
}
