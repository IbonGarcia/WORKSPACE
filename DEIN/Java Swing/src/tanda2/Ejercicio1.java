package tanda2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame{
	
	private JButton calcular;
	private JTextField tfvalor;
	private JTextField tf50;
	private JTextField tf20;
	private JTextField tf10;
	private JTextField tf5;
	private JTextField tf1;
	
	public Ejercicio1() {
		
		this.setLayout(new GridLayout(6,3,5,10));
		
		calcular= new JButton("Calcular");
		JLabel valor= new JLabel("Ingrese un valor:");
		JLabel e50= new JLabel("Monedas de 50");
		JLabel e20= new JLabel("Monedas de 20");
		JLabel e10= new JLabel("Monedas de 10");
		JLabel e5= new JLabel("Monedas de 5");
		JLabel e1= new JLabel("Monedas de 1");
		JLabel vacia1= new JLabel("");
		JLabel vacia2= new JLabel("");
		JLabel vacia3= new JLabel("");
		JLabel vacia4= new JLabel("");
		JLabel vacia5= new JLabel("");
		tfvalor= new JTextField(10);
		tfvalor.requestFocus();
		tf50= new JTextField(10);
		tf20= new JTextField(10);
		tf10= new JTextField(10);
		tf5= new JTextField(10);
		tf1= new JTextField(10);
				
		//Ventana
		this.getContentPane().add(valor);
		this.getContentPane().add(tfvalor);
		this.getContentPane().add(calcular);
		this.getContentPane().add(e50);
		this.getContentPane().add(tf50);
		this.getContentPane().add(vacia1);
		this.getContentPane().add(e20);
		this.getContentPane().add(tf20);
		this.getContentPane().add(vacia2);
		this.getContentPane().add(e10);
		this.getContentPane().add(tf10);
		this.getContentPane().add(vacia3);
		this.getContentPane().add(e5);
		this.getContentPane().add(tf5);
		this.getContentPane().add(vacia4);
		this.getContentPane().add(e1);
		this.getContentPane().add(tf1);
		this.getContentPane().add(vacia5);
		
		this.setVisible(true);
		this.setSize(360, 220);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tratarEventos();
	}
	
	public void tratarEventos() {
		
		calcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Dado que son billetes, siempre nos van a meter un valor redondo, por lo tanto basta con multiplicar el valor por 100
				//para pasarlo a centimos y despues dividir entre las monedas para saber cuanta cantidad de monedas necesitamos.
				double inicial=Double.parseDouble(tfvalor.getText());
				double centimos=inicial*100;
				tf50.setText((centimos/50)+"");
				tf20.setText((centimos/20)+"");
				tf10.setText((centimos/10)+"");
				tf5.setText((centimos/5)+"");
				tf1.setText((centimos/1)+"");
			}
		});
	}
	
	public static void main(String[] args) {
		Ejercicio1 ej1= new Ejercicio1();
	}
	
}
