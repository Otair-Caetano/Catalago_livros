package com.litealura.catalogo_livros.repository;

import com.litealura.catalogo_livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
  List<Livro> findByTituloContaining(String titulo); // Busca por título
}
