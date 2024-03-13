package view;

import javax.swing.JOptionPane;

import controller.DistroController;

public class Main {
	
	public static void main (String[] args) {
		
		DistroController distro = new DistroController();
		
		int opc = 0;
		
		while (opc!=9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n" +
					"1 - Exibir nome e versão da distribuição.\n" +
					"9 - Sair."));
			
			switch (opc) {
			case 1:
				
				distro.exibeDistro();
				break;
				
			case 9:
				
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Opção não identificada... Digite novamente.");
		
			}
			
		}
		
	}

}
