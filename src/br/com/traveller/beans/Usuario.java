package br.com.traveller.beans;

import java.time.LocalDate;

public class Usuario {
	private int id;
	private String email;
	private String nome;
	private boolean email_verificado;
	private String password;
	private LocalDate criado_em;
	
	public Usuario() {
		super();
	}
	public Usuario(int id, String email, String nome, boolean email_verificado, String password, LocalDate criado_em) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.email_verificado = email_verificado;
		this.password = password;
		this.criado_em = criado_em;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isEmail_verificado() {
		return email_verificado;
	}
	public void setEmail_verificado(boolean email_verificado) {
		this.email_verificado = email_verificado;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getCriado_em() {
		return criado_em;
	}
	public void setCriado_em(LocalDate criado_em) {
		this.criado_em = criado_em;
	}
	
}
