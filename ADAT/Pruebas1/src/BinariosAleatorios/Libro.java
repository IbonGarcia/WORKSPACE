package BinariosAleatorios;

import java.io.Serializable;

public class Libro implements Serializable{
	private long isbn;
	private String titulo;
	private String autor;
	private String genero;
	private int vendidos;

	Libro(long isbn, String titu, String auto, String gen, int ven){
		this.isbn=isbn;
		this.titulo=titu;
		this.autor=auto;
		this.genero=gen;
		this.vendidos=ven;
	}
	public String toString(){
		String str="ISBN: "+this.isbn+", título: "+this.titulo+
				"\nAutor: "+this.autor+", genero: "+this.genero+", libros vendidos: "+vendidos;
		return str;
	}
	public int getIsbn() {
		return (int) isbn;
	}
	public int getVendidos() {
		return vendidos;
	}
	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}
	public String getGenero() {
		return genero;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
}
