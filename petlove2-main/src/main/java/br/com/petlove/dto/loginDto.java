package br.com.petlove.dto;

import java.io.Serializable;

public class loginDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String email;
	private String senha;

	public loginDto() {
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

}
