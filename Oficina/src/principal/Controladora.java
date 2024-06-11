package principal;

import java.util.ArrayList;

import modelo.CadastraServico;
import visualizacao.EntradaSaida;

public class Controladora {
	
	public void exibeMenu() {
		
		int opcao;
		
		ArrayList<CadastraServico> listaServico = new ArrayList<CadastraServico>();
		
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			
			case 0:
				
				CadastraServico servico = CadastraServico.cadastraServico();
				listaServico.add(servico);
				
				break;
				
			case 1:
				
				
				
				break;
				
				
				
			}
			
		} while (opcao != 1);
		
	}

}
