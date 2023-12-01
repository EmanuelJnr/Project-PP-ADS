package DAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import Enums.SexoCliente;
import Model.Pedido;

public class ClienteDAO implements ClienteDAOImpl{
	private int id;
	private String nome;
	private String primeiroNome;
	private String CPF;
	private Map<String,String> contato;
	private String email;
	private LocalDateTime dataNascimento;
	private SexoCliente sexo;
	private ArrayList<Pedido> pedidos = new ArrayList<>();

	public ClienteDAO(int id, String nome, String primeiroNome, String CPF,
			Map<String, String> contato, String email,
			LocalDateTime dataNascimento, SexoCliente sexo) {
		this.id = id;
		this.nome = nome;
		this.primeiroNome = primeiroNome;
		this.CPF = CPF;
		this.contato = contato;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	public String toString() {
		return primeiroNome + ", " + CPF;
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
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public Map<String, String> getContato() {
		return contato;
	}
	public void setContato(Map<String, String> contato) {
		this.contato = contato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public SexoCliente getSexo() {
		return sexo;
	}
	public void setSexo(SexoCliente sexo) {
		this.sexo = sexo;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}