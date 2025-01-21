package com.litealura.catalogo_livros.principal;

import com.litealura.catalogo_livros.LivroService;
import com.litealura.catalogo_livros.model.Livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class MenuInicial implements CommandLineRunner {

    @Autowired
    private LivroService livroService;

    @Override
    public void run(String... args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            do {
                exibirMenu();
                System.out.print("\nEscolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente

                switch (opcao) {
                    case 1: // Buscar livro pelo título
                        buscarLivroPorTitulo(scanner);
                        break;
                    case 2: // Listar livros registrados
                        listarLivrosRegistrados();
                        break;
                    case 3: // Listar autores registrados (placeholder)
                        listarAutoresRegistrados(); // Conecte à lógica de autores
                        break;
                    case 4: // Listar autores vivos em um ano (placeholder)
                        listarAutoresVivosPorAno(scanner); // Conecte com lógica adicional
                        break;
                    case 5: // Listar livros por idioma
                        listarLivrosPorIdioma(scanner);
                        break;
                    case 6: // Sair
                        System.out.println("\nSaindo da aplicação... Até logo!");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Tente novamente!");
                        break;
                }
            } while (opcao != 6);
        }
    }

    private void exibirMenu() {
        System.out.println("\n===== Menu LiterAlura =====");
        System.out.println("1 - Buscar livro pelo título");
        System.out.println("2 - Listar livros registrados");
        System.out.println("3 - Listar autores registrados");
        System.out.println("4 - Listar autores vivos em um determinado ano");
        System.out.println("5 - Listar livros em um determinado idioma");
        System.out.println("6 - Sair");
    }

    private void buscarLivroPorTitulo(Scanner scanner) {
        System.out.print("\nDigite o título parcial ou completo do livro: ");
        String titulo = scanner.nextLine();
        List<Livro> livros = livroService.buscarPorTitulo(titulo);

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado com o título: " + titulo);
        } else {
            System.out.println("\n=== Livros Encontrados ===");
            livros.forEach(livro -> System.out.printf("- %s (Autor: %s, Idioma: %s)\n",
                    livro.getTitulo(), livro.getAutor(), livro.getIdioma()));
        }
    }

    private void listarLivrosRegistrados() {
        List<Livro> livros = livroService.listarTodos();
        if (livros.isEmpty()) {
            System.out.println("\nAinda não há livros registrados.");
        } else {
            System.out.println("\n=== Livros Registrados ===");
            livros.forEach(livro -> System.out.printf("- %s (Autor: %s, Idioma: %s)\n",
                    livro.getTitulo(), livro.getAutor(), livro.getIdioma()));
        }
    }

    private void listarAutoresRegistrados() {
        // Placeholder para lógica de autores
        System.out.println("\nPlaceholder: Implementar listagem de autores registrados.");
    }

    private void listarAutoresVivosPorAno(Scanner scanner) {
        System.out.print("\nDigite o ano desejado: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir linha pendente

        // Placeholder para lógica de filtrar autores vivos
        System.out.println("\nPlaceholder: Implementar listagem de autores vivos no ano " + ano);
    }

    private void listarLivrosPorIdioma(Scanner scanner) {
        System.out.print("\nDigite o idioma dos livros (e.g., pt, en): ");
        String idioma = scanner.nextLine();

        // Placeholder para lógica de busca por idioma
        System.out.println("\nPlaceholder: Implementar listagem de livros no idioma " + idioma);
    }
}