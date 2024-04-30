package View;

import javax.swing.JOptionPane;

public class Menu_GUI {

	public static void menu() {
		int op = 0;
		
		while(op != 3) {			
			String x = JOptionPane.showInputDialog(null, "Reserva Aéria\n1-Consultar\n2-Efetuar Reserva\n3-Sair");
			op = Integer.parseInt(x);
			
			switch(op) {
				case 1:
					Model.Funcoes_DAO.consulta();
					break;
				case 2:
					Model.Funcoes_DAO.reserva();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Encerrando programa");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
					break;
			}
		}

	}

}
