import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.omg.Messaging.SyncScopeHelper;

public class Eje3 extends JFrame{

	//Menu
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton e;
	private JButton f;
	private JButton g;
	private JButton h;
	private JButton i;
	private JTextField tf1;
	
	//Apartado A
	private JTextField tf2;
	private JLabel etiquetaA;
	
	//Apartado B
	private JLabel todotexto;
	private JLabel seleccionado;
	private JButton cortar;
	private JButton pegar;
	private String strcortar;
	
	//Apartado C
	private JFrame frameC;
	private JButton aceptarC;
	private JButton cancelarC;
	private JLabel etiquetaC;
	private int conta�os;
	private int a�oactual;
	
	//Apartadp D
	private JButton aceptarD;
	private int sum1;
	private int sum2;
	private JLabel resultado;
	
	//Apartado E
	//Para el apartado E voy a reciclar las variables del apartado D
	private double rest1;
	private double rest2;
	
	//Apartado F
	private JTextField tf3;
	private JButton convertidor;
	private JLabel euros;
	
	//Apartado G
	private JRadioButton[] botones;
	private JCheckBox[] casillas;
	private JRadioButton windows;
	private JRadioButton linux;
	private JRadioButton mac;
	private JButton generar;
	private JLabel num;
	private JSlider bhoras;
	private ButtonGroup bg;
	
	//Apartado H
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tfresultado;
	private JButton sumar;
	private JButton restar;
	private JButton multiplicar;
	private JButton dividir;
	private JButton limpiar;
	
	//Apartado I
	private JTextField pantalla;
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton cero;
	private JButton punto;
	private JButton ce;
	private JButton cee;
	private JButton igual;
	private JButton mod;
	private int contador;
	private long entrada1;
	private long entrada2;
	private int contarAccion;
	private boolean realizado;
	
	
	
 	public Eje3() {
		
		this.setLayout(new FlowLayout());
		
		a=new JButton(" A ");
		b=new JButton(" B ");
		c=new JButton(" C ");
		d=new JButton(" D ");
		e=new JButton(" E ");
		f=new JButton(" F ");
		g=new JButton(" G ");
		h=new JButton(" H ");
		i=new JButton(" I ");
		JLabel etiqueta=new JLabel("Elije un apartado");				
		
		//Ventana principal 'menu'
		this.getContentPane().add(a);
		this.getContentPane().add(b);
		this.getContentPane().add(c);
		this.getContentPane().add(d);
		this.getContentPane().add(e);
		this.getContentPane().add(f);
		this.getContentPane().add(g);
		this.getContentPane().add(h);
		this.getContentPane().add(i);
		
		this.getContentPane().add(etiqueta);
		this.setTitle("Ejercicio 3");
		this.setSize(300,160);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		tratarEventos();				
	}
	
	public void tratarEventos() {
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				setVisible(false);
				dibujarA();
			}
		});
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarB();		
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				setVisible(false);
				dibujarC();		
			}
		});
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarD();		
			}
		});
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarE();		
			}
		});
		f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarF();		
			}
		});
		g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarG();		
			}
		});
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarH();		
			}
		});
		i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dibujarI();		
			}
		});
	}
	public void dibujarA() {
		JFrame frameA=new JFrame(" A ");
		
		frameA.setLayout(new FlowLayout());
		tf1= new JTextField(10);
		tf2= new JTextField(10);
		etiquetaA= new JLabel("");
		//Ventana
		frameA.setSize(300, 100);
		frameA.getContentPane().add(tf1);
		frameA.getContentPane().add(tf2);
		frameA.getContentPane().add(etiquetaA);
		frameA.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameA.setVisible(true);
		
		//Esto hace visible la ventana principal cuando cerramos la ventana 'A'
		frameA.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarA();
	}
	public void dibujarB() {
		JFrame frameB=new JFrame(" B ");
		
		frameB.setLayout(new FlowLayout());
		tf1= new JTextField(15);
		todotexto=new JLabel("Todo el texto: ");
		seleccionado= new JLabel("Texto selecionado: Null");
		cortar= new JButton("Cortar");
		pegar= new JButton("Pegar");
		//Ventana
		frameB.setSize(215, 250);
		frameB.getContentPane().add(tf1);
		frameB.getContentPane().add(cortar);
		frameB.getContentPane().add(pegar);
		frameB.getContentPane().add(todotexto);
		frameB.getContentPane().add(seleccionado);
		frameB.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameB.setVisible(true);
		
		//Esto hace visible la ventana principal cuando cerramos la ventana 'B'
		frameB.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
					setVisible(true);
					}
				});
		tratarB();
	}
	public void dibujarC() {
		frameC=new JFrame(" C ");
		a�oactual=0;
		conta�os=0;
		frameC.setLayout(null);
		aceptarC=new JButton("Aceptar");
		aceptarC.setBounds(188, 95,85,20);
		aceptarC.setBackground(Color.getHSBColor(1.6f,0.5f,0.9f));
		cancelarC=new JButton("Cancelar");
		cancelarC.setBounds(90, 95,85,20);
		tf1= new JTextField();
		tf1.setBounds(75, 60, 200, 20);
		etiquetaC= new JLabel("A�o actual");
		etiquetaC.setBounds(75,20,150,40);
		JLabel icono= new JLabel(new ImageIcon("java.png"));
		icono.setBounds(20, 10, 50, 80);
		
		//Ventana
		frameC.setSize(350, 200);
		frameC.getContentPane().add(icono);
		frameC.getContentPane().add(etiquetaC);
		frameC.getContentPane().add(tf1);
		frameC.getContentPane().add(cancelarC);
		frameC.getContentPane().add(aceptarC);
		frameC.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameC.setVisible(true);
		//Esto hace visible la ventana principal cuando cerramos la ventana 'B'
		frameC.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tf1.requestFocus();
		tratarC();
	}
	public void dibujarD() {
		JFrame frameD=new JFrame(" D ");
		frameD.setLayout(null);
		aceptarD=new JButton("Aceptar");
		aceptarD.setBounds(188, 95,85,20);
		aceptarD.setBackground(Color.getHSBColor(1.6f,0.5f,0.9f));
		cancelarC=new JButton("Cancelar");
		cancelarC.setBounds(90, 95,85,20);
		tf1= new JTextField();
		tf1.setBounds(75, 60, 200, 20);
		etiquetaC= new JLabel("Introduce el #1 ");
		etiquetaC.setBounds(75,20,150,40);
		JLabel icono= new JLabel(new ImageIcon("java.png"));
		icono.setBounds(20, 10, 50, 80);
		resultado= new JLabel("");
		resultado.setBounds(75,60,200,20);
		resultado.setVisible(false);
		
		//Ventana
		frameD.setSize(350, 200);
		frameD.getContentPane().add(icono);
		frameD.getContentPane().add(etiquetaC);
		frameD.getContentPane().add(tf1);
		frameD.getContentPane().add(cancelarC);
		frameD.getContentPane().add(aceptarD);
		frameD.getContentPane().add(resultado);
		frameD.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameD.setVisible(true);
		//Esto hace visible la ventana principal cuando cerramos la ventana 'B'
		frameD.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarD();
	}
	public void dibujarE() {

		JFrame frameD=new JFrame(" E ");
		frameD.setLayout(null);
		aceptarD=new JButton("Aceptar");
		aceptarD.setBounds(188, 95,85,20);
		aceptarD.setBackground(Color.getHSBColor(1.6f,0.5f,0.9f));
		cancelarC=new JButton("Cancelar");
		cancelarC.setBounds(90, 95,85,20);
		tf1= new JTextField();
		tf1.setBounds(75, 60, 200, 20);
		etiquetaC= new JLabel("Introduce el #1 ");
		etiquetaC.setBounds(75,20,150,40);
		JLabel icono= new JLabel(new ImageIcon("java.png"));
		icono.setBounds(20, 10, 50, 80);
		resultado= new JLabel("");
		resultado.setBounds(75,60,200,20);
		resultado.setVisible(false);
		
		//Ventana
		frameD.setSize(350, 200);
		frameD.getContentPane().add(icono);
		frameD.getContentPane().add(etiquetaC);
		frameD.getContentPane().add(tf1);
		frameD.getContentPane().add(cancelarC);
		frameD.getContentPane().add(aceptarD);
		frameD.getContentPane().add(resultado);
		frameD.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameD.setVisible(true);
		
		frameD.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarE();
	}
	public void dibujarF() {
		
		JFrame frameF= new JFrame(" F ");
		frameF.setLayout(null);
		tf3 = new JTextField(10);
		tf3.setBounds(7,5,128,20);
		JLabel pesetas = new JLabel("Pesetas");
		pesetas.setBounds(138, 5, 55, 20);
		convertidor = new JButton(" Cambio Pta -> �");
		convertidor.setBounds(7, 30, 127, 20);
		euros = new JLabel("Euros");
		euros.setBounds(138,30,200,20);
		
		//Ventana
		frameF.getContentPane().add(tf3);
		frameF.getContentPane().add(pesetas);
		frameF.getContentPane().add(convertidor);
		frameF.getContentPane().add(euros);
		frameF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameF.setSize(350, 100);
		frameF.setVisible(true);
		frameF.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarF();
	}
	public void dibujarG() {

		
		JFrame frameG= new JFrame(" G ");
		frameG.setLayout(new FlowLayout());
		JLabel so = new JLabel("Elije un sistema operativo");
		frameG.getContentPane().add(so);
	
		//Panel 1
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(120, 100));
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		botones= new JRadioButton[3];
		bg= new ButtonGroup();
		windows = new JRadioButton("Windows");
		linux = new JRadioButton("Linux");
		mac = new JRadioButton("MAC");
		bg.add(windows);
		bg.add(linux);
		bg.add(mac);
		botones[0]=windows;
		botones[1]=linux;
		botones[2]=mac;
		panel1.add(windows);
		panel1.add(linux);
		panel1.add(mac);
		
		//Panel 2
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(120, 130));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		JLabel especialidad = new JLabel("Elije tu especialidad");
		panel2.add(especialidad);
		JCheckBox prom= new JCheckBox("Programaci�n");
		panel2.add(prom);
		JCheckBox dise= new JCheckBox("Dise�o gr�fico");
		panel2.add(dise);
		JCheckBox admin= new JCheckBox("Administraci�n");
		panel2.add(admin);
		casillas= new JCheckBox[3];
		casillas[0]=prom;
		casillas[1]=dise;
		casillas[2]=admin;
		JLabel h = new JLabel("Horas que dedicas en el ordenador");
		
		//Panel 3
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		bhoras = new JSlider(0, 10);
		bhoras.setPreferredSize(new Dimension(170, 20));
		num = new JLabel(bhoras.getValue()+"");
		panel3.add(num);
		panel3.add(bhoras);
		generar=new JButton("Generar");
		
		//Ventana
		frameG.getContentPane().add(panel1);
		frameG.getContentPane().add(panel2);
		frameG.getContentPane().add(h);
		frameG.getContentPane().add(panel3);
		frameG.getContentPane().add(generar);
		frameG.setSize(230,460);
		frameG.setVisible(true);
		frameG.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameG.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarG();
	}
	public void dibujarH() {
		
		JFrame frameH= new JFrame(" H ");
		frameH.setLayout(new FlowLayout());
		JLabel n1= new JLabel("Numero ");
		tf4= new JTextField(15);
		JLabel n2= new JLabel("Numero ");
		tf5= new JTextField(15);
		sumar= new JButton(" + ");
		sumar.setPreferredSize(new Dimension(75, 30));
		restar= new JButton(" - ");
		restar.setPreferredSize(new Dimension(75, 30));
		multiplicar= new JButton(" x ");
		multiplicar.setPreferredSize(new Dimension(75, 30));
		dividir= new JButton(" / ");
		dividir.setPreferredSize(new Dimension(75, 30));
		limpiar= new JButton("Limpiar");
		tfresultado= new JTextField(15);
		
		//Ventana
		frameH.getContentPane().add(n1);
		frameH.getContentPane().add(tf4);
		frameH.getContentPane().add(n2);
		frameH.getContentPane().add(tf5);
		frameH.getContentPane().add(sumar);
		frameH.getContentPane().add(restar);
		frameH.getContentPane().add(multiplicar);
		frameH.getContentPane().add(dividir);
		frameH.getContentPane().add(limpiar);
		frameH.getContentPane().add(tfresultado);
		frameH.setSize(250, 250);
		frameH.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameH.setVisible(true);
		frameH.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarH();
	}
	public void dibujarI() {
		
		//La ventana principal tiene un flowlayout en la cual hay una pantalla y un panel principal con un flowlayout tambn
		//en dicho panel principal hay dos paneles con boxlayout, dichos paneles tienen dentro mas paneles
		//los cuales tienen flowlayout.
		
		contador=0;
		contarAccion=0;
		realizado=false;
		
		JFrame frameI= new JFrame(" I ");
		frameI.setLayout(new FlowLayout());
		pantalla= new JTextField("0",25);
		pantalla.setPreferredSize(new Dimension(25, 30));
		pantalla.setBackground(Color.getHSBColor(4.1f, 1.6f, 0.8f));
		pantalla.setFont(new Font("default", 1, 15));
		pantalla.setHorizontalAlignment(pantalla.RIGHT);
		JPanel pprincipal= new JPanel();
		pprincipal.setLayout(new FlowLayout());
		pprincipal.setPreferredSize(new Dimension(400, 250));
		
		//Panel de los numeros
		JPanel numeros= new JPanel();
		numeros.setLayout(new BoxLayout(numeros, BoxLayout.Y_AXIS));
		JPanel n1= new JPanel();
		JPanel n2= new JPanel();
		JPanel n3= new JPanel();
		JPanel n4= new JPanel();
		n1.setLayout(new FlowLayout());
		n2.setLayout(new FlowLayout());
		n3.setLayout(new FlowLayout());
		n4.setLayout(new FlowLayout());
		
		siete = new JButton(" 7 ");
		siete.setPreferredSize(new Dimension(50, 45));
		siete.setFont(new Font("default", 1, 15));
		
		ocho = new JButton(" 8 ");
		ocho.setPreferredSize(new Dimension(50, 45));
		ocho.setFont(new Font("default", 1, 15));
		
		nueve = new JButton(" 9 ");
		nueve.setPreferredSize(new Dimension(50, 45));
		nueve.setFont(new Font("default", 1, 15));
		
		cuatro = new JButton(" 4 ");
		cuatro.setPreferredSize(new Dimension(50, 45));
		cuatro.setFont(new Font("default", 1, 15));
		
		cinco = new JButton(" 5 ");
		cinco.setPreferredSize(new Dimension(50, 45));
		cinco.setFont(new Font("default", 1, 15));
		
		seis = new JButton(" 6 ");
		seis.setPreferredSize(new Dimension(50, 45));
		seis.setFont(new Font("default", 1, 15));
		
		uno = new JButton(" 1 ");
		uno.setPreferredSize(new Dimension(50, 45));
		uno.setFont(new Font("default", 1, 15));
		
		dos = new JButton(" 2 ");
		dos.setPreferredSize(new Dimension(50, 45));
		dos.setFont(new Font("default", 1, 15));
		
		tres = new JButton(" 3 ");
		tres.setPreferredSize(new Dimension(50, 45));
		tres.setFont(new Font("default", 1, 15));
		
		cero = new JButton(" 0 ");
		cero.setPreferredSize(new Dimension(107, 45));
		cero.setFont(new Font("default", 1, 15));
		
		punto = new JButton(" . ");
		punto.setPreferredSize(new Dimension(50, 45));
		punto.setFont(new Font("default", 1, 15));
		
		//Panel de las operaciones
		JPanel operaciones= new JPanel();
		operaciones.setLayout(new BoxLayout(operaciones, BoxLayout.Y_AXIS));
		JPanel op1= new JPanel();
		JPanel op2= new JPanel();
		JPanel op3= new JPanel();
		JPanel op4= new JPanel();
		op1.setLayout(new FlowLayout());
		op2.setLayout(new FlowLayout());
		op3.setLayout(new FlowLayout());
		op4.setLayout(new FlowLayout());
		
		ce = new JButton(" C ");
		ce.setPreferredSize(new Dimension(61, 45));
		ce.setFont(new Font("default", 1, 13));
		
		cee = new JButton(" CE ");
		cee.setPreferredSize(new Dimension(61, 45));
		cee.setFont(new Font("default", 1, 13));
		
		dividir = new JButton(" / ");
		dividir.setPreferredSize(new Dimension(61, 45));
		dividir.setFont(new Font("default", 1, 13));
		
		restar = new JButton(" - ");
		restar.setPreferredSize(new Dimension(61, 45));
		restar.setFont(new Font("default", 1, 13));
		
		multiplicar = new JButton(" x ");
		multiplicar.setPreferredSize(new Dimension(61, 45));
		multiplicar.setFont(new Font("default", 1, 13));
		
		sumar = new JButton(" + ");
		sumar.setPreferredSize(new Dimension(61, 45));
		sumar.setFont(new Font("default", 1, 13));
		
		igual = new JButton(" = ");
		igual.setPreferredSize(new Dimension(61, 45));
		igual.setFont(new Font("default", 1, 13));
		
		mod = new JButton(" % ");
		mod.setPreferredSize(new Dimension(61, 45));
		mod.setFont(new Font("default", 1, 13));
		
		//VENTANA
		n1.add(siete);
		n1.add(ocho);
		n1.add(nueve);
		n2.add(cuatro);
		n2.add(cinco);
		n2.add(seis);
		n3.add(uno);
		n3.add(dos);
		n3.add(tres);
		n4.add(cero);
		n4.add(punto);
		numeros.add(n1);
		numeros.add(n2);
		numeros.add(n3);
		numeros.add(n4);
		
		op1.add(ce);
		op1.add(cee);
		op2.add(dividir);
		op2.add(restar);
		op3.add(multiplicar);
		op3.add(sumar);
		op4.add(igual);
		op4.add(mod);
		operaciones.add(op1);
		operaciones.add(op2);
		operaciones.add(op3);
		operaciones.add(op4);
		
		pprincipal.add(numeros);
		pprincipal.add(operaciones);
		frameI.getContentPane().add(pantalla);
		frameI.getContentPane().add(pprincipal);
		frameI.setSize(360, 320);
		frameI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frameI.setVisible(true);
		frameI.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(true);
			}
		});
		tratarI();
	}
	public void tratarA() {
		
		tf1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String str=tf1.getText();
				etiquetaA.setText("Ha pulsado enter en jtf1: "+str);
			}
		});
		tf2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String str=tf2.getText();
				etiquetaA.setText("Ha pulsado enter en jtf2: "+str);
			}
		});
	}
	public void tratarB() {
		tf1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String str=tf1.getText();
				todotexto.setText("Todo el texto: "+str);
			}
		});
		cortar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Para 'cortar' usamos el metodo getSelectedText, y despues tenemos que guardar todo
				//el string en una variable, sobre esa variable usamos indexOf para saber en que posicion
				//empieza el string selecionado
				strcortar=tf1.getSelectedText();
				String completo=tf1.getText();
				seleccionado.setText("Texto seleccionado: "+strcortar);
				int indice=completo.indexOf(strcortar);
				//Guardamos en una variable auxiliar el string desde la posicion 0 hasta el indice
				//que hemos obtenido antes, y luego en otra variable guardamos desde el 
				//el indice + la largura del texto seleccionado hasta el final.
				String aux= completo.substring(0,indice);
				String aux2=completo.substring(indice+strcortar.length());
				tf1.setText(aux+aux2);
			}
		});
		pegar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Para 'pegar' de nuvo cojemos la posicion del cursor con el metodo
				//getCaretPosition y lo guardamos en un int, depues guardamos en un string desde
				//dese la posicion 0 hasta la de el cursor, y en otro string guardamos desde la 
				//posicion del cursor hasta el final, despues concatenamos el primer string seguido
				//del texto a copiar seguido del string que va hasta el final.
				int cursor=tf1.getCaretPosition();
				String completo=tf1.getText();
				String aux=completo.substring(0, cursor);
				String aux1=completo.substring(cursor);
				String auxcompleto= aux+strcortar+aux1;
				tf1.setText(auxcompleto);
			}
		});
	}
	public void tratarC() {
		
		cancelarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				conta�os=0;
				etiquetaC.setText("A�o actual");
				tf1.requestFocus();
			}
		});
		aceptarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				if (conta�os==0) {
					a�oactual = Integer.parseInt(tf1.getText());
					etiquetaC.setText("A�o nacimiento");
					tf1.setText("");
					conta�os++;
					tf1.requestFocus();
				}
				else {
					int a�onac = Integer.parseInt(tf1.getText());
					frameC.setVisible(false);
					VentanaCdos vc2= new VentanaCdos(true, a�oactual, a�onac);
				}					
			}
		});
	}
	public void tratarD() {
		cancelarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				etiquetaC.setText("Introduce el #1 ");
				conta�os=0;
				resultado.setVisible(false);
				tf1.setVisible(true);
				//He usado variables del apartado anterior para no usar muchas variables
				//y asi no usar tanta memoria
			}
		});
		aceptarD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				if (conta�os==0) {
					sum1 = Integer.parseInt(tf1.getText());
					etiquetaC.setText("Introduce el #2 ");
					tf1.setText("");
					conta�os++;
				}
				else {
					sum2 = Integer.parseInt(tf1.getText());
					int res=sum1+sum2;
					tf1.setVisible(false);
					resultado.setText("La suma de "+sum1+" + "+sum2+"="+res);
					resultado.setVisible(true);
				}				
			}
		});
	}
	public void tratarE() {
		cancelarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				etiquetaC.setText("Introduce el #1 ");
				conta�os=0;
				resultado.setVisible(false);
				tf1.setVisible(true);
				//He usado variables del apartado anterior para no usar muchas variables
				//y asi no usar tanta memoria
			}
		});
		aceptarD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				if (conta�os==0) {
					rest1 = Integer.parseInt(tf1.getText());
					etiquetaC.setText("Introduce el #2 ");
					tf1.setText("");
					conta�os++;
				}
				else {
					rest2 = Integer.parseInt(tf1.getText());
					double res=rest1-rest2;
					tf1.setVisible(false);
					resultado.setText("La resta de "+rest1+" - "+rest2+"= "+res);
					resultado.setVisible(true);
				}				
			}
		});
	}
	public void tratarF() {
		convertidor.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int pes= Integer.parseInt(tf3.getText());
				double eur=pes/166.386;
				//Lo siguiente lo he hecho para que me saque solo dos decimales
				String str=String.valueOf(eur);
				String arstr[]= str.split("\\.");
				str=arstr[0]+"."+arstr[1].substring(0, 2);
				euros.setText(str+" Euros");
			}
		});
	}
	public void tratarG() {
		
		bhoras.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				num.setText(bhoras.getValue()+"");
			}
		});
		generar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String str="";
				ArrayList<JCheckBox>arr= casillaselecionada();
				for (JCheckBox box : arr) {
					str=str+box.getText();
					str=str+" , ";
				}
				
				JOptionPane.showMessageDialog(null,
				"Tu sistema operativo preferido es "+botonseleccionado().getText()
				+"\n tus especialidades son "+str+
				"\n y el numero de horas dedicas en el ordenador son "+bhoras.getValue(),
				"Muestra de datos",JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	public void tratarH() {
		
		sumar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				long suma=Long.parseLong(tf4.getText())+Long.parseLong(tf5.getText());
				tfresultado.setText(suma+"");
			}
		});
		restar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				long resta=Long.parseLong(tf4.getText())-Long.parseLong(tf5.getText());
				tfresultado.setText(resta+"");
			}
		});
		multiplicar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				long multi=Long.parseLong(tf4.getText())*Long.parseLong(tf5.getText());
				tfresultado.setText(multi+"");
			}
		});
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double div=Long.parseLong(tf4.getText())/Long.parseLong(tf5.getText());
				tfresultado.setText(div+"");
			}
		});	
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf4.setText("");
				tf5.setText("");
				tfresultado.setText("");
			}
		});	
	}
	public void tratarI() {
		
		pantalla.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (((e.getKeyChar()<'0')||(e.getKeyChar()>'9'))&&(e.getKeyChar()!=e.VK_BACK_SPACE)){
					e.consume();
					JOptionPane.showMessageDialog(null,
							"Solo se pueden introducir numeros",
							"ERROR",JOptionPane.ERROR_MESSAGE);
					System.out.println(e.KEY_TYPED);
				}
			}
		});
		ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(0+"");
				contador=0;
				entrada1=0;
				entrada2=0;
				contarAccion=0;
			}
		});
		ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(0+"");
				contador=0;
				entrada2=0;
			}
		});
		uno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+1);
			}
		});
		dos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+2);
			}
		});
		tres.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+3);
			}
		});
		cuatro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+4);
			}
		});
		cinco.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+5);
			}
		});
		seis.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+6);
			}
		});
		siete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+7);
			}
		});
		ocho.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+8);
			}
		});
		nueve.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+9);
			}
		});
		cero.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				if(realizado==true) {
					pantalla.setText("");
					realizado=false;
				}
				pantalla.setText(pantalla.getText()+0);
			}
		});
		punto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (contador==0) {
					pantalla.setText("");
					contador++;
				}
				
				pantalla.setText(pantalla.getText()+".");
			}
		});
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contarAccion==0) {
					entrada1=Long.parseLong(pantalla.getText());
					pantalla.setText("");
					contarAccion++;
				}
				else {
					entrada2=Long.parseLong(pantalla.getText());
					entrada1=entrada1/entrada2;
					pantalla.setText(entrada1+"");
					realizado=true;
				}
				
			}
		});
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (contarAccion==0) {
					entrada1=Long.parseLong(pantalla.getText());
					pantalla.setText("");
					contarAccion++;
				}
				else {
					entrada2=Long.parseLong(pantalla.getText());
					entrada1=entrada1+entrada2;
					pantalla.setText(entrada1+"");
					realizado=true;
				}
			}
		});
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contarAccion==0) {
					entrada1=Long.parseLong(pantalla.getText());
					pantalla.setText("");
					contarAccion++;
				}
				else {
					entrada2=Long.parseLong(pantalla.getText());
					entrada1=entrada1-entrada2;
					pantalla.setText(entrada1+"");
					realizado=true;
				}
			}
		});
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contarAccion==0) {
					entrada1=Long.parseLong(pantalla.getText());
					pantalla.setText("");
					contarAccion++;
				}
				else {
					entrada2=Long.parseLong(pantalla.getText());
					entrada1=entrada1*entrada2;
					pantalla.setText(entrada1+"");
					realizado=true;
				}
				
			}
		});
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contarAccion==0) {
					entrada1=Long.parseLong(pantalla.getText());
					pantalla.setText("");
					contarAccion++;
				}
				else {
					entrada2=Long.parseLong(pantalla.getText());
					entrada1=entrada1%entrada2;
					pantalla.setText(entrada1+"");
					realizado=true;
				}
				
			}
		});
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
	
	public JRadioButton botonseleccionado() {
		for(int i=0;i<3;i++) {
			boolean elejido = botones[i].isSelected();
			if (elejido==true) {
				return botones[i];
			}
		}
		return null;
	}
	public ArrayList casillaselecionada() {
		ArrayList<JCheckBox> seleccionadas = new ArrayList<JCheckBox>();
		for(int i=0;i<3;i++) {
			boolean elejido = casillas[i].isSelected();
			if (elejido==true) {
				seleccionadas.add(casillas[i]);
			}
		}
		return seleccionadas;
	}
	
	//Esto es una clase interna para crear la segunda ventana que sale en el apartado C
 	class VentanaCdos extends JFrame{
		
		private JButton aceptar;
				
		VentanaCdos(boolean visible,int actual,int nacimiento) {
			
			this.setLayout(null);
			int diferencia=(actual-nacimiento);
			JLabel icono= new JLabel(new ImageIcon("java.png"));
			icono.setBounds(20, 5, 50, 80);
			JLabel e1= new JLabel("Tienes:");
			e1.setBounds(85,17,150,40);
			JLabel e2= new JLabel(diferencia+" A�os cumplidos");
			e2.setBounds(85,37,150,40);
			JLabel e3= new JLabel((diferencia*12)+" Meses");
			e3.setBounds(85,52,150,40);
			JLabel e4= new JLabel((diferencia*365)+" Dias");
			e4.setBounds(85,67,150,40);
			JLabel e5= new JLabel(diferencia*365*24+" Horas");
			e5.setBounds(85,82,150,40);
			JLabel e6= new JLabel(diferencia*365*24*60+" Minutos");
			e6.setBounds(85,97,150,40);
			JLabel e7= new JLabel(diferencia*365*24*60*60+" Segundos");
			e7.setBounds(85,112,150,40);
			aceptar=new JButton("Aceptar");
			aceptar.setBounds(105,157,100,20);
			aceptar.setBackground(Color.getHSBColor(1.6f,0.5f,0.9f));
			
			//Ventana
			this.getContentPane().add(icono);
			this.getContentPane().add(e1);
			this.getContentPane().add(e2);
			this.getContentPane().add(e3);
			this.getContentPane().add(e4);
			this.getContentPane().add(e5);
			this.getContentPane().add(e6);
			this.getContentPane().add(e7);
			this.getContentPane().add(aceptar);
			this.setSize(250, 250);
			this.setVisible(visible);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					frameC.setVisible(true);
				}
			});
			eventosVentana();
		}
		public void  eventosVentana(){
			aceptar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					tf1.setText("");
					conta�os=0;
					etiquetaC.setText("A�o actual");
					frameC.setVisible(true);
				}
			});
		}
	}
	
	public static void main(String[] args) {
		Eje3 e3 = new Eje3();
	}	
}