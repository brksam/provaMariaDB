package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
