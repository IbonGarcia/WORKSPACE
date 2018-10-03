package tanda2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Ejercicio3a extends JFrame{

	private JScrollPane scroll;
	private JButton buy;
	private JList<String> lista;
	private DefaultListModel<String> modelo1;
	private JLabel etiqueta;
	
	public Ejercicio3a() {
		
		this.setLayout(new FlowLayout());
		
		modelo1= new DefaultListModel<String>();
		cargarLista();
		buy= new JButton("Buy Apple");
		lista=new JList<String>(modelo1);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroll=new JScrollPane(lista);
		scroll.setPreferredSize(new Dimension(120, 90));
		etiqueta= new JLabel("Selecion actual: ");
		
		this.getContentPane().add(scroll);
		this.getContentPane().add(buy);
		this.getContentPane().add(etiqueta);
		this.setSize(200, 200);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		tratarEventos();
	}
	public void tratarEventos() {
		
		buy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String str=lista.getSelectedValue();
				etiqueta.setText("Seleccion actual: "+str);
			}
		});
		
	}
	public void cargarLista() {			//METODO PARA LLENAR LA LISTA
		
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
		Ejercicio3a ej3= new Ejercicio3a();
	}	
}
