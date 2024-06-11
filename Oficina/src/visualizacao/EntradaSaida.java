package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitaOpcao() {
		
		String[] opcoes = {"Cadastrar serviço", "Visualizar serviços não concluidos", "Sair do programa"};

		JComboBox<String> menu = new JComboBox<String>(opcoes);
		
		JOptionPane.showConfirmDialog(null,menu, "Selecione a opção desejada",
				JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
		
	}
	
	public static String solicitaCliente() {
		
		String cliente = JOptionPane.showInputDialog(null, "Insira o nome do cliente");
		
		return cliente;
	}
	
	public static String solicitaServico() {
		
		String servico = JOptionPane.showInputDialog(null, "Insira o tipo de serviço a ser realizado");
		
		return servico;
	}

	public static String solicitaModelo() {
		
		String modelo = JOptionPane.showInputDialog(null, "Insira o modelo do carro do cliente");
		
		return modelo;
	}

	public static String solicitaCor() {
		
		String cor = JOptionPane.showInputDialog(null, "Insira a cor do carro do cliente");
		
		return cor;
	}

	public static int solicitaAno() {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano do carro do cliente"));
		
		return ano;
	}
	
	public static double solicitaValor() {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a ser cobrado"));
		
		return valor;
		
	}

}
