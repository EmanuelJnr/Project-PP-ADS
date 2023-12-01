package Model;

import Enums.StatusPagamento;

public class Pagamento {
	private int id;
	private StatusPagamento status;
	private Pedido pedido;
	
	public Pagamento(int id, StatusPagamento status, Pedido pedido) {
		this.id = id;
		this.status = status;
		this.pedido = pedido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StatusPagamento getStatus() {
		return status;
	}
	public void setStatus(StatusPagamento status) {
		this.status = status;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}