package com.fatec.sigvs.ti_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.sigvs.model.Biblioteca;
import com.fatec.sigvs.model.Livro;

@SpringBootTest
public class Req01CadastrarLivro {
    private Biblioteca biblioteca;
    
    @Test
    public void ct01CadastrarLivroComSucesso() {
        //Dado que o usuário entrou com as informações do livro
        biblioteca = new Biblioteca();
        Livro livro = new Livro("Redes de Computador", "Tanenbaum");
        //Quando o usuário confirma a operação
        biblioteca.save(livro);
        //O livro fica disponível para a consulta
        assertEquals(1, biblioteca.size());
    }
}
