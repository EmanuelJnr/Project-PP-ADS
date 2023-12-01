package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Produto {
	private int id;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUltimaAtualizacao;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private boolean ativo;
	private ArrayList<Categoria> categorias = new ArrayList<>();
	private Estoque estoque;

	public Produto(int id, LocalDateTime dataCriacao, LocalDateTime dataUltimaAtualizacao,
			String nome, String descricao, BigDecimal preco, boolean ativo, Estoque estoque) {
		this.id = id;
		this.dataCriacao = dataCriacao;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.ativo = ativo;
		this.estoque = estoque;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDateTime getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
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
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
}