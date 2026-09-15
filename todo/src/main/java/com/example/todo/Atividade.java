package com.example.todo;

import jakarta.persistence.*;

@Entity //Utiliza o entity para ser lido como uma entidade para a classe Atividade
//@ID para identificar a chave primaria
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
