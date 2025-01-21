package com.litealura.catalogo_livros.controller;

import com.litealura.catalogo_livros.LivroService;
import com.litealura.catalogo_livros.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarTodos();
    }

    @PostMapping
    public Livro salvarLivro(@RequestBody Livro livro) {
        return livroService.salvar(livro);
    }

    @GetMapping("/{titulo}")
    public List<Livro> buscarPorTitulo(@PathVariable String titulo) {
        return livroService.buscarPorTitulo(titulo);
    }
}
