import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Eje1 extends JFrame{

	
	Eje1(){
		
		this.setLayout(null);
		JButton boton=new JButton("Aceptar");
		boton.setBounds(90, 80, 100, 20);
		JLabel etiqueta1= new JLabel("Hola colega");
		etiqueta1.setBounds(110,100,100,25);
		
		//Ventana
		this.getContentPane().add(boton);
		this.getContentPane().add(etiqueta1);
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Eje1 e1 = new Eje1();
	}
	
}
