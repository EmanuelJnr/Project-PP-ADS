package Model;

import java.time.LocalDateTime;
import Enums.StatusPagamento;

public class PagamentoBoleto extends Pagamento{
	private LocalDateTime dataVencimento;
	private String codigoBarras;

	public PagamentoBoleto(int id, StatusPagamento status, Pedido pedido,
			LocalDateTime dataVencimento, String codigoBarras) {
		super(id, status, pedido);
		this.codigoBarras = codigoBarras;
		this.dataVencimento = dataVencimento;
	}
	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDateTime dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
}