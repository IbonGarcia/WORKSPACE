package Visual;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Principal extends JFrame{
	
	private JButton bglibros;
	private JButton bgalumnos;
	private JButton bgdevoluciones;
	
	public Ventana_Principal() {
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,30,50));
		//this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		JLabel etitulo=new JLabel("Gestión de préstramos de libros");
		//etitulo.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
		etitulo.setFont(new Font("Old English Text MT",Font.BOLD,25));
		
		JPanel panelmedio= new JPanel();
		JLabel iconolibro= new JLabel(new ImageIcon("imagenes/iconolibro.png"));
		JLabel iconoalumno= new JLabel(new ImageIcon("imagenes/iconoalumno.png"));
		bglibros= new JButton("Gestion de libros");
		bgalumnos= new JButton("Gestion de alumnos");
		bgdevoluciones= new JButton("Gestion de devoluciones");
		panelmedio.add(iconolibro);
		panelmedio.add(bglibros);
		panelmedio.add(iconoalumno);
		panelmedio.add(bgalumnos);
		panelmedio.add(bgdevoluciones);
		
		JPanel panelbajo= new JPanel();
		JLabel fotomonton= new JLabel(new ImageIcon("imagenes/monton.png"));
		JLabel fotolibro= new JLabel(new ImageIcon("imagenes/libro.png"));
		panelbajo.add(fotomonton);
		panelbajo.add(fotolibro);
		
		this.getContentPane().add(etitulo);
		this.getContentPane().add(panelmedio);
		this.getContentPane().add(panelbajo);
		this.setTitle("Gestión de Préstamos de Libros");
		this.setSize(700,650);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ventana_Principal();
	}

}
