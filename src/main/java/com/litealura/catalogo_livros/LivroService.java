package com.litealura.catalogo_livros;

import com.litealura.catalogo_livros.model.Livro;
import com.litealura.catalogo_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // Método para listar todos os livros
    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    // Método para salvar um novo livro
    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    // Método para buscar livros por título
    public List<Livro> buscarPorTitulo(String titulo) {
        return livroRepository.findByTituloContaining(titulo);
    }
}
