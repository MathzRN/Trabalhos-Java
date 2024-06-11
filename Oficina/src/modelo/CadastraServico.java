package modelo;

import visualizacao.EntradaSaida;

public class CadastraServico {
	
	public static CadastraServico cadastraServico() {
		
		Servico servico = new Servico();
		
		servico.setCliente(EntradaSaida.solicitaCliente());
		servico.setServico(EntradaSaida.solicitaServico());
		servico.setModelo(EntradaSaida.solicitaModelo());
		servico.setCor(EntradaSaida.solicitaCor());
		servico.setAno(EntradaSaida.solicitaAno());
		servico.setValor(EntradaSaida.solicitaValor());
		
		return null;
		
	}

}
