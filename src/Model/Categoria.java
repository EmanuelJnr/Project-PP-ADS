package Model;

import java.util.ArrayList;

public class Categoria {
	private int id;
	private String nome;
	private Categoria subCategoria;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	public Categoria getSubCategoria() {
		return subCategoria;
	}
	public void setSubCategoria(Categoria subCategoria) {
		this.subCategoria = subCategoria;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}