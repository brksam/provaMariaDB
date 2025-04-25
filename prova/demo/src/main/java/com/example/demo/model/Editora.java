package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String pais;

    @OneToMany(mappedBy = "editora", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Livro> livros;
}
