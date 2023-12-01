package Model;

import Enums.StatusPagamento;

public class PagamentoCartao extends Pagamento{
	private String numeroCartao;
	
	public PagamentoCartao(int id, StatusPagamento status, Pedido pedido,
			String numeroCartao) {
		super(id, status, pedido);
		this.numeroCartao = numeroCartao;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
}