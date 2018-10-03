package tanda2;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

public class Ejercicio2b extends JFrame{

	private JTextArea area;
	private JTextField tfbuscar;
	private JButton inicio;
	private JButton siguiente;
	private int index;
	
	public Ejercicio2b() {
		
		this.setLayout(new FlowLayout());
		area = new JTextArea(20,20);
		area.setLineWrap(true);
		JScrollPane scroll= new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
		
		JLabel buscar= new JLabel("Buscar...");
		tfbuscar= new JTextField(20);
		inicio = new JButton("Buscar desde inicio");
		siguiente = new JButton("Buscar desde siguiente");
		
		//Ventana
		this.getContentPane().add(scroll);
		this.getContentPane().add(buscar);
		this.getContentPane().add(tfbuscar);
		this.getContentPane().add(inicio);
		this.getContentPane().add(siguiente);
		this.setSize(290, 510);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		tratarEventos();
	}
	
	public void tratarEventos() {
		
		inicio.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				area.getHighlighter().removeAllHighlights();
				
				HighlightPainter subrallador=new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
				String str= area.getText();
				String buscado=tfbuscar.getText();
				int ini=str.indexOf(buscado);
				index=ini;
				int fin=ini+buscado.length();
				
				try {
					area.getHighlighter().addHighlight(ini, fin, subrallador);
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
			}
		});
		siguiente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				HighlightPainter subrallador=new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
				String str= area.getText();
				String buscado=tfbuscar.getText();
				index = str.indexOf(buscado,index+buscado.length());
				
				try {
					area.getHighlighter().addHighlight(index, index+buscado.length(), subrallador);
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args) {
			
		Ejercicio2b ej2= new Ejercicio2b();
	}
	
}
