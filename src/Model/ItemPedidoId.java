package Model;

public class ItemPedidoId {
	private int pedidoId;
	private int produtoId;
	
	public ItemPedidoId(int pedidoId, int produtoId) {
		super();
		this.pedidoId = pedidoId;
		this.produtoId = produtoId;
	}
	public int getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(int pedidoId) {
		this.pedidoId = pedidoId;
	}
	public int getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}
}