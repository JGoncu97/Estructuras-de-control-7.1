package practicaEstructuraDeControl;

import javax.swing.JOptionPane;

public class estructuraMenuPrincipal {
	public static void main(String args[]) {
		int codMenuPpal=0;
		do {
			String menu="MENU RESTAURANTE\n\n";
			menu+="1. Plato tipico \n";
			menu+="2. Plato a la Carta\n";
			menu+="3. Plato Internacional";
			menu+="4. Salir\n\n";
			menu+="Por favor Seleccione una opcion \n";
			codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codMenuPpal) {
			case 1:
				JOptionPane.showMessageDialog(null,"Menu 1" );
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Menu 2" );
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Menu 3" );
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Menu 4" );
				break;
			default:
				JOptionPane.showMessageDialog(null,"No corresponde a un"
						+ "codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE );
				break;
					
			}
		}while(codMenuPpal !=4);
		
		
		
	}

}
