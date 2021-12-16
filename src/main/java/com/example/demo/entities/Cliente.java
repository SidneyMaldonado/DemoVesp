package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {


    // comentario do sidney
    // comentario do Luiz
    // comentario enzo
    //Willian
    //Pedro
    //maristela
    //Comentario do vinicius

    @Id
    @Column(name="id")
    private String id;
    @Column(name="nome")
    private String nome;

    @Column(name="situacao")
    private Boolean situacao;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean testar()
    {
        return true;
    }

    public Boolean Somar() {
        return false;
    }
}
