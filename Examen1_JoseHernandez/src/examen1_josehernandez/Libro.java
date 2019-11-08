package examen1_josehernandez;

import java.util.Date;
import javax.swing.JOptionPane;

public class Libro {

    private String titulo;
    private String descripcion;
    private int puntaje;
    private int cop_disponibles;
    private Genero genero;
    private double valor;
    private String edicion;
    private String autor;
    private Date ano_publicacion;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, int puntaje, int cop_disponibles, Genero genero, double valor, String edicion, String autor, Date ano_publicacion) throws miExcepcion {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.setPuntaje(puntaje);
        this.cop_disponibles = cop_disponibles;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.ano_publicacion = ano_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) throws miExcepcion {
        if (puntaje < 1 || puntaje > 5) {
            throw new miExcepcion("El puntaje solo puede ser de 1-5");
        }
        this.puntaje = puntaje;
    }

    public int getCop_disponibles() {
        return cop_disponibles;
    }

    public void setCop_disponibles(int cop_disponibles) {
        this.cop_disponibles = cop_disponibles;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAno_publicacion() {
        return ano_publicacion;
    }

    public void setAno_publicacion(Date ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }

    @Override
    public String toString() {
        return titulo ;
    }

    

}
