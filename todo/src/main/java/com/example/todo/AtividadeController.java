package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //controla a comunicacao da view e model, mas para isso precisa tambem do endpoint(caminho que vou seguir para a requisicao)
@RequestMapping ("/")//Mapear e criar a rota utilizado no http
public class AtividadeController {

    @Autowired //cria um objeto sozinho, intancia um objeto para depois utilizar
    private AtividadeRepository repo;

    @GetMapping//Mapeia a requisicao inicial de Get
    public List<Atividade> listarTudo(){
        return repo.findAll();
    }
    @GetMapping("/{nome}")
    public String Listar(PathVariable String nome){ //PathVariable é uma variavel de caminho, pegar uma coisa digitada e retornando no backend
        return "Ola" + nome;
    }
}
