package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Editora;

public interface EditoraRepository extends JpaRepository<Editora, Long> {
}
