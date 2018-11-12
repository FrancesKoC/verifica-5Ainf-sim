
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package compito;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(800,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<table style=width:100%>");
		sb.append("<tr><th><h1> Formula 1 Passion </h1></th></tr><br>");
		sb.append("<th> Pilota </th>");
		sb.append("<th><h3>Punteggio</h3></th>);
		sb.append("</body>");
		
		// TODO Convertire lo StringBuilder in String
		String html= sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

