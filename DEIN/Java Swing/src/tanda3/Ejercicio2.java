package tanda3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio2 extends JFrame{

	private JCheckBox habilitado;
	private JCheckBox velocidad;
	private JCheckBox tamaño;
	private JCheckBox debug;
	private JLabel selec;
	private JLabel selecciones;
	
	public Ejercicio2() {
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		habilitado= new JCheckBox("Habilita opciones");
		JLabel eti1= new JLabel("Opciones:");
		velocidad= new JCheckBox("Mayor velocidad");
		velocidad.setEnabled(false);
		tamaño= new JCheckBox("Menor tamaño");
		tamaño.setEnabled(false);
		debug= new JCheckBox("Debug");
		debug.setEnabled(false);
		selec= new JLabel("Cambiar seleccion: ");
		selecciones= new JLabel("Opciones seleccionadas: ");
		
		this.getContentPane().add(habilitado);
		this.getContentPane().add(eti1);
		this.getContentPane().add(velocidad);
		this.getContentPane().add(tamaño);
		this.getContentPane().add(debug);
		this.getContentPane().add(selec);
		this.getContentPane().add(selecciones);
		this.setTitle("Cajas de texto");
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		tratarEventos();
	}
	
	public void tratarEventos() {
		
		habilitado.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				if(habilitado.isSelected()) {
					velocidad.setEnabled(true);
					tamaño.setEnabled(true);
					debug.setEnabled(true);
				}
				else {
					velocidad.setEnabled(false);
					tamaño.setEnabled(false);
					debug.setEnabled(false);
					selec.setText("Cambiar seleccion:");
					selecciones.setText("Opciones seleccionadas");
				}
			}
		});
		
		velocidad.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (velocidad.isSelected()) {
					selec.setText("Cambiar seleccion: Mayor velocidad");
				}			
			}
		});
		tamaño.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (tamaño.isSelected()) {
					selec.setText("Cambiar seleccion: Menor tamaño");
				}			
			}
		});
		debug.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (debug.isSelected()) {
					selec.setText("Cambiar seleccion: Debug");
				}			
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ejercicio2();
	}

}
