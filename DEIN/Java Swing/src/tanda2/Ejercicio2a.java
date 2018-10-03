package tanda2;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejercicio2a extends JFrame{

	private JTextArea campo;
	private JLabel cuenta;
	private long contador;
	
	public Ejercicio2a() {
			
		contador=0;
		this.setLayout(new FlowLayout());
		campo = new JTextArea(10,20);
		campo.setLineWrap(true);
		JScrollPane scroll= new JScrollPane(campo);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
		cuenta = new JLabel("Cuenta actual: "+contador);
		this.getContentPane().add(scroll);
		this.getContentPane().add(cuenta);
		this.setSize(400, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tratarEventos();
	}
	
	public void tratarEventos() {
		
		campo.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {
				
				String str=campo.getText();
				String[] array=str.split(" ");
				contador=array.length;
				cuenta.setText("Cuenta actual: "+contador);
			}
		} );
	}
	
	public static void main(String[] args) {
		Ejercicio2a ej2= new Ejercicio2a();
	}
}
