import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Eje2 extends JFrame{

	private JButton b1;
	private JButton b2;
	private JLabel l1;
	
	private JButton a;
	private JButton b;
	private JButton c;
	private long t1;
	Date tiempoinicial;
	//He hecho que primero se abra una ventana a modo de menu en el cual
	//seleccionas que apartado quieres ver (A, B o C) y cuando seleccionas uno
	//entonces se muestra el apartado correspondiente.
	Eje2(){
		
		this.setLayout(new FlowLayout());
				
		a=new JButton(" A ");
		b=new JButton(" B ");
		c=new JButton(" C ");
		JLabel etiqueta=new JLabel("Elije un apartado");				
		
		//Ventana principal 'menu'
		this.getContentPane().add(a);
		this.getContentPane().add(b);
		this.getContentPane().add(c);
		this.getContentPane().add(etiqueta);
		this.setTitle("Ejercicio 2");
		this.setSize(245,100);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		tratarEventos();
	}
	//Este metodo es para tratar los eventos del menu
	public void tratarEventos() {
			
			a.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dibujarA();
				}
			});
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dibujarB();
				}
			});
			c.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dibujarC();
				}
			});
	}
	public void dibujarA() {
		
		JFrame frame= new JFrame("Apartado A");
		frame.setLayout(null);
		b1=new JButton("Primero");
		b1.setBounds(100,50,90,25);
		b2=new JButton("Segundo");
		b2.setBounds(200,50,90,25);
		l1=new JLabel("Presione un boton");
		l1.setBounds(130,100,180,25);
				
		//Ventana A
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(l1);
		frame.setTitle("Ejemplo de botones");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		//Esto ultimo lo hago para que se puedan volver a la primera ventana
		//cuando se cierre esta.
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				setVisible(true);
			}
		});
		tratarEventosA();
	}
	public void dibujarB() {
		
		JFrame frame= new JFrame("Apartado B");
		frame.setLayout(null);
		b1=new JButton("Primero");
		b1.setBounds(100,50,90,25);
		b2=new JButton("Segundo");
		b2.setEnabled(false);
		b2.setBounds(200,50,90,25);
		l1=new JLabel("Presione un boton");
		l1.setBounds(130,100,180,25);
				
		//Ventana B
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(l1);
		frame.setTitle("Ejemplo de botones");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		//Esto ultimo lo hago para que se puedan volver a la primera ventana
		//cuando se cierre esta.
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				setVisible(true);
			}
		});
		tratarEventosB();
	}
	public void dibujarC() {
		
		JFrame frame= new JFrame("Apartado B");
		frame.setLayout(new FlowLayout());
		b1=new JButton("Start");
		b2=new JButton("Stop");
		l1=new JLabel("Presione arrancar para empezar a cronometrar");
				
		//Ventana C
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(l1);
		frame.setTitle("Ejemplo de botones");
		frame.setSize(400,100);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		//Esto ultimo lo hago para que se puedan volver a la primera ventana
		//cuando se cierre esta.
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				setVisible(true);
			}
		});
		tratarEventosC();
	}
	
	
	//Este metodo es para tratar los eventos de la ventana A
	public void tratarEventosA() {
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				l1.setText("Primer boton presionado");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				l1.setText("Segundo boton presionado");
			}
		});
	}
	//Este metodo trata los eventos de la ventana B
	public void tratarEventosB() {
		
		b1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				if (e.getClickCount()==1) {
					b2.setEnabled(true);
					l1.setText("Segundo boton habilitado");
					
				}
				if (e.getClickCount()==2) {
					b2.setEnabled(false);
					l1.setText("Segundo boton deshabilitado");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				l1.setText("Segundo presionado");
				
			}
		});
	}
	//Este metodo trata los eventos de la ventana C
	public void tratarEventosC() {
		//En la variable date se guarda la hora cada vez que hacemos el 'new date' por eso 
		//necesito tres variables date, la primera para saber cuando empieza, la segunda para
		//saber cuando acaba y la tercera para hacer la diferencia, luego nos quedamos con 
		//los minutos y segundos y los mostramos.
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tiempoinicial = new Date();
				l1.setText("Crono en marcha...");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Date tiempofinal = new Date();
				long resultado=tiempofinal.getTime()-tiempoinicial.getTime();
				Date tiempor= new Date(resultado);
				if(tiempor.getSeconds()<10) {
					l1.setText("Tiempo cronometrado: "+tiempor.getMinutes()+":0"+tiempor.getSeconds());
				}
				else {
					l1.setText("Tiempo cronometrado: "+tiempor.getMinutes()+":"+tiempor.getSeconds());
				}
				
				
			}
		});
		
	}
	public static void main(String[] args) {
		Eje2 e2= new Eje2();
	}
	
}
