package DAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import Enums.SexoCliente;
import Model.Pedido;

public interface ClienteDAOImpl {
	
	public int getId();
	
	public void setId(int id);
	
	public String getNome();
	
	public void setNome(String nome);
	
	public String getPrimeiroNome();
	
	public void setPrimeiroNome(String primeiroNome);
	
	public String getCPF();
	
	public void setCPF(String CPF);
	
	public Map<String, String> getContato();
	
	public void setContato(Map<String, String> contato);
	
	public LocalDateTime getDataNascimento();
	
	public void setDataNascimento(LocalDateTime dataNascimento);
	
	public SexoCliente getSexo();
	
	public void setSexo(SexoCliente sexo);
	
	public ArrayList<Pedido> getPedidos();
	
	public void setPedidos(ArrayList<Pedido> pedidos);
}