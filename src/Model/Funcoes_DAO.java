package Model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Funcoes_DAO {
	
	public static List<Integer> aviao = new ArrayList<>();
	
	public static List<Integer> assento = new ArrayList<>();
	
	public static void consulta() {
		int op = 0;
		while(op != 4) {			
			String x = JOptionPane.showInputDialog(null, "1-Por número do vôo\n2-Por origem\n3-Por destino\n4-Voltar");
			op = Integer.parseInt(x);
			
			switch(op) {
				case 1:
					String y = JOptionPane.showInputDialog(null, "Digite o número do vôo");
					int num = Integer.parseInt(y);
					
					if(aviao.contains(num)) {
						JOptionPane.showMessageDialog(null, "[]  []\n[]  []\n[]  []\n[]  []");
					}else {
						JOptionPane.showMessageDialog(null, "Vôo não encontrado");
					}
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Voltando ao menu inicial");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;
				
			}
		}
		
	}
	public static void reserva() {
	    String x = JOptionPane.showInputDialog(null, "Digite o número do vôo para efetuar a reserva");
	    int intX = Integer.parseInt(x);
	    aviao.add(intX);

	    String y = JOptionPane.showInputDialog(null, "Digite o número do assento");

	    int numAssento = Integer.parseInt(y);

	    if(assento.contains(numAssento)) {
	        JOptionPane.showMessageDialog(null, "Assento já reservado, escolha outro");
	    } else {
	        JOptionPane.showMessageDialog(null, "Reserva concluída");
	        assento.add(numAssento);
	    }
	    System.out.println(assento);
	}

}
