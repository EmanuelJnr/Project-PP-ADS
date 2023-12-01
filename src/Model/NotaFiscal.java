package Model;

import java.time.LocalDateTime;

public class NotaFiscal {
	private int id;
	private LocalDateTime dataEmissao;
	private Pedido pedido;
	
	public NotaFiscal(int id, LocalDateTime dataEmissao, Pedido pedido) {
		super();
		this.id = id;
		this.dataEmissao = dataEmissao;
		this.pedido = pedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDateTime dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}