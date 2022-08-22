package br.com.traveller.beans;

import java.time.LocalDate;

public class Programacao {
	private int id;
	private int cidade_id;
	private String nome;
	private String descricao;
	private String imagem;
	private float preco;
	private LocalDate criado_em;
	
	public Programacao() {
		super();
	}
	public Programacao(int id, int cidade_id, String nome, String descricao, String imagem, float preco,
			LocalDate criado_em) {
		super();
		this.id = id;
		this.cidade_id = cidade_id;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.preco = preco;
		this.criado_em = criado_em;
	}
	public LocalDate getCriado_em() {
		return criado_em;
	}
	public void setCriado_em(LocalDate criado_em) {
		this.criado_em = criado_em;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCidade_id() {
		return cidade_id;
	}
	public void setCidade_id(int cidade_id) {
		this.cidade_id = cidade_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}
