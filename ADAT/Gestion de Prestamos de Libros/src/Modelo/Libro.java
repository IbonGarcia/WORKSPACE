package Modelo;

public class Libro {

	private int codigo;
	private long isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private String asignatura;
	private EstadoLibro estado;
	
	public Libro(int cod, long isbn,String titu,String auto,String edit,String asig, EstadoLibro estado) {
		
		this.codigo=cod;
		this.isbn=isbn;
		this.titulo=titu;
		this.autor=auto;
		this.asignatura=asig;
		this.estado=estado;
		
	}
}
