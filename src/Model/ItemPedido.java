package Model;

import java.math.BigDecimal;

public class ItemPedido {
	private BigDecimal precoProduto;
	private int quantidade;
	private Pedido pedido;
	private Produto produto;
	
	public ItemPedido(BigDecimal precoProduto, int quantidade, Pedido pedido,
			Produto produto) {
		this.precoProduto = precoProduto;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produto = produto;
	}
	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}