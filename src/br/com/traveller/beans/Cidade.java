 package br.com.traveller.beans;

import java.time.LocalDate;

public class Cidade {
	private int id;
	private String nome;
	private String pais;
	private String estado;
	private String imagem;
	private String descricao;
	private LocalDate criado_em;
	
	public Cidade() {
		super();
	}
	public Cidade(int id, String nome, String pais, String estado, String imagem, String descricao,
			LocalDate criado_em) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.estado = estado;
		this.imagem = imagem;
		this.descricao = descricao;
		this.criado_em = criado_em;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getCriado_em() {
		return criado_em;
	}
	public void setCriado_em(LocalDate criado_em) {
		this.criado_em = criado_em;
	}
	
	
}
