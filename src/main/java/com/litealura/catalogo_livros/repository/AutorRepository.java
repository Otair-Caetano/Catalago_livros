package com.litealura.catalogo_livros.repository;

import com.litealura.catalogo_livros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Métodos de busca customizados, como por ano
}
