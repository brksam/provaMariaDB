package com.example.demo.controller;

import com.example.demo.model.Livro;
import com.example.demo.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        return livroRepository.findById(id)
            .map(livro -> {
                livro.setTitulo(livroAtualizado.getTitulo());
                livro.setAutor(livroAtualizado.getAutor());
                livro.setPreco(livroAtualizado.getPreco());
                livro.setEditora(livroAtualizado.getEditora());
                return livroRepository.save(livro);
            }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }
}
