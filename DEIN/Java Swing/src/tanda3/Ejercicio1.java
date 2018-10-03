package tanda3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Ejercicio1 extends JFrame{

	private JButton guardar;
	private JButton salir;
	private JTextField tfpaterno;
	private JTextField tfmaterno;
	private JTextField tfnombre;
	private JComboBox<String> comboEstado;
	private DefaultComboBoxModel<String> modeloEstado;
	private JRadioButton masculino;
	private JRadioButton femenino;
	private JTextArea tfarea;
	private JScrollPane scroll;
	
	public Ejercicio1() {
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		//PANEL 1
		JPanel p1= new JPanel(new GridLayout(0, 2));
		p1.setBorder(BorderFactory.createTitledBorder(b,"Datos Personales",TitledBorder.DEFAULT_POSITION,TitledBorder.ABOVE_TOP));
		JPanel puno1= new JPanel();
		JLabel et2= new JLabel("Apellido Paterno: ");
		puno1.add(et2);
		JPanel puno2= new JPanel();
		tfpaterno= new JTextField(25);
		puno2.add(tfpaterno);
		JPanel puno3= new JPanel();
		JLabel et3= new JLabel("Apellido Materno: ");
		puno3.add(et3);
		JPanel puno4= new JPanel();
		tfmaterno= new JTextField(25);
		puno4.add(tfmaterno);
		JPanel puno5= new JPanel();
		JLabel et4= new JLabel("Nombre:");
		puno5.add(et4);
		JPanel puno6= new JPanel();
		tfnombre= new JTextField(25);
		puno6.add(tfnombre);
		JPanel puno7= new JPanel();
		JLabel et5= new JLabel("Estado civil ");
		puno7.add(et5);
		JPanel puno8= new JPanel();
		modeloEstado= new DefaultComboBoxModel<String>();
		modeloEstado.addElement("Soltero");
		modeloEstado.addElement("Casado");
		comboEstado= new JComboBox<String>(modeloEstado);
		puno8.add(comboEstado);
		JLabel vac= new JLabel("");
		JPanel psexo= new JPanel();
		psexo.setBorder(BorderFactory.createTitledBorder("Sexo"));
		ButtonGroup grupobotones= new ButtonGroup();
		masculino= new JRadioButton("Masculino");
		masculino.setSelected(true);
		femenino= new JRadioButton("Femenino");
		grupobotones.add(masculino);
		grupobotones.add(femenino);
		psexo.add(masculino);
		psexo.add(femenino);
		p1.add(puno1);
		p1.add(puno2);
		p1.add(puno3);
		p1.add(puno4);
		p1.add(puno5);
		p1.add(puno6);
		p1.add(puno7);
		p1.add(puno8);
		p1.add(vac);
		p1.add(psexo);
		
		//PANEL 2
		JPanel p2= new JPanel(new BorderLayout());
		p2.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		guardar= new JButton("Guardar");
		salir= new JButton("Salir");
		p2.add("West",guardar);
		p2.add("East",salir);
		
		//PANEL 3
		JPanel p3= new JPanel(new FlowLayout());
		p3.setBorder(BorderFactory.createTitledBorder(b,"Listado",TitledBorder.DEFAULT_POSITION,TitledBorder.ABOVE_TOP));
		tfarea= new JTextArea();
		scroll= new JScrollPane(tfarea);
		scroll.setPreferredSize(new Dimension(580, 190));
		tfarea.setLineWrap(true);
		p3.add(scroll);
		
		this.getContentPane().add(p1);
		this.getContentPane().add(p2);
		this.getContentPane().add(p3);
		this.setSize(600, 600);
		this.setTitle("Datos personales");
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tratarEventos();
	}
	
	public void tratarEventos() {
		
		guardar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String persona="";
				if (masculino.isSelected()) {
					
					persona=tfpaterno.getText()+" "+tfmaterno.getText()+" "+tfnombre.getText()+", "+comboEstado.getSelectedItem()+", masculino";
				}
				else {
					persona=tfpaterno.getText()+" "+tfmaterno.getText()+" "+tfnombre.getText()+", "+comboEstado.getSelectedItem()+", femenino";
				}
				tfarea.setText(tfarea.getText()+persona+"\n");
			}
		});
		
		salir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new Ejercicio1();
	}
	
}
