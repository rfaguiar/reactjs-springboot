package br.com.caelum.cdcreact.controllers.forms;


import br.com.caelum.cdcreact.models.Autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AutorForm {

	@NotBlank
	private String nome;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String senha;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Autor build() {
		Autor autor = new Autor();
		autor.setEmail(email);
		autor.setNome(nome);
		autor.setSenha(senha);
		return autor;
	}

}
