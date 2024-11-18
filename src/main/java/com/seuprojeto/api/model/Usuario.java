// Caminho: src/main/java/com/seuprojeto/meuapi/model/Usuario.java

package com.seuprojeto.api.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public CharSequence getSenha() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setSenha(String encode) {
		// TODO Auto-generated method stub
		this.password = encode;
	}
}
