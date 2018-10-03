package tanda2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableColumnModel;

public class Ejercicio3c extends JFrame{

	
	private JComboBox<String> combo;
	private DefaultComboBoxModel<String> modelo1;
	private JLabel etiqueta;
	public Ejercicio3c() {
		
		this.setLayout(new FlowLayout());
		modelo1= new DefaultComboBoxModel<String>();
		cargarCombo();
		combo= new JComboBox<String>(modelo1);
		etiqueta= new JLabel("Seleccion actual: ");
		
		this.getContentPane().add(combo);
		this.getContentPane().add(etiqueta);
		this.setTitle("Combo dinamico");
		this.setSize(220, 190);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tratarEventos();
	}
	public void tratarEventos() {
		
		combo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				etiqueta.setText("Selecion actual: "+combo.getSelectedItem());
			}
		});
	}
	
	public void cargarCombo() {
		modelo1.addElement("Winesap");
		modelo1.addElement("Cortland");
		modelo1.addElement("Red Delicious");
		modelo1.addElement("Golden Delicious");
		modelo1.addElement("Gala");
		modelo1.addElement("Fuji");
		modelo1.addElement("Pink Lady");
		modelo1.addElement("Granny Smith");
		modelo1.addElement("Fuji");
	}
	public static void main(String[] args) {
		Ejercicio3c ej3= new Ejercicio3c();
	}
}
