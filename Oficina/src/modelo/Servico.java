package modelo;

public class Servico {

	protected String cliente;
	protected String servico;
	protected Double valor;
	protected int ano;
	protected String modelo;
	protected String cor;
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void setCliente(String m) {
		this.cliente = m;
	}
	
	public String getServico() {
		return this.servico;
	}
	
	public void setServico(String m) {
		this.servico = m;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public void setValor(Double m) {
		this.valor = m;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int m) {
		this.ano = m;
	}

	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}

	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String m) {
		this.cor = m;
	}

}
