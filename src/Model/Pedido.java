package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import DTO.ClienteDTO;
import Enums.StatusPedido;

public class Pedido {
	private int id;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUltimaAtualizacao;
	private LocalDateTime dataConclusao;
	private BigDecimal total;
	private StatusPedido status;
	private EnderecoEntregaPedido endereco;
	private ClienteDTO clienteDTO;
	private NotaFiscal notaFiscal;
	private ArrayList<ItemPedido> itensPedido = new ArrayList<>();
	private Pagamento pagamento;
	
	public Pedido(int id, LocalDateTime dataCriacao, LocalDateTime dataUltimaAtualizacao,
			LocalDateTime dataConclusao, BigDecimal total, StatusPedido status,
			EnderecoEntregaPedido endereco, ClienteDTO clienteDTO, NotaFiscal notaFiscal,
			Pagamento pagamento) {
		this.id = id;
		this.dataCriacao = dataCriacao;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
		this.dataConclusao = dataConclusao;
		this.total = total;
		this.status = status;
		this.endereco = endereco;
		this.clienteDTO = clienteDTO;
		this.notaFiscal = notaFiscal;
		this.pagamento = pagamento;
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
	public LocalDateTime getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(LocalDateTime dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public EnderecoEntregaPedido getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoEntregaPedido endereco) {
		this.endereco = endereco;
	}
	public ClienteDTO getClienteDTO() {
		return clienteDTO;
	}
	public void setCliente(ClienteDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public ArrayList<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}