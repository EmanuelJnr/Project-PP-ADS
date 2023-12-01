package DTO;

import java.time.LocalDateTime;
import java.util.Map;
import Enums.SexoCliente;

public class ClienteDTO {
	private String primeiroNome;
	private Map<String,String> contato;
	private String email;
	private LocalDateTime dataNascimento;
	private SexoCliente sexo;

	public ClienteDTO(String primeiroNome, Map<String, String> contato,
			String email, LocalDateTime dataNascimento, SexoCliente sexo) {
		this.primeiroNome = primeiroNome;
		this.contato = contato;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	public String toString() {
		return primeiroNome;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
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
}