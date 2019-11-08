package examen1_josehernandez;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private String nom_usuario;
    private String contrasena;
    private Date fecha_nacimiento;
    private String num_telefono;
    private String correo;

    private Genero genero_fav;
    private ArrayList<Libro> lista_libros;

    public Usuario() {
    }

    public Usuario(String nom_usuario, String contrasena, Date fecha_nacimiento, String num_telefono, String correo, Genero genero_favorito) {
        this.nom_usuario = nom_usuario;
        this.contrasena = contrasena;
        this.fecha_nacimiento = fecha_nacimiento;
        this.num_telefono = num_telefono;
        this.correo = correo;

        this.genero_fav = genero_favorito;

    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Genero getGenero_favorito() {
        return genero_fav;
    }

    public void setGenero_favorito(Genero genero_favorito) {
        this.genero_fav = genero_favorito;
    }

    public ArrayList<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(ArrayList<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nom_usuario=" + nom_usuario + ", contrasena=" + contrasena + ", fecha_nacimiento=" + fecha_nacimiento + ", num_telefono=" + num_telefono + ", correo=" + correo + ", genero_favorito=" + genero_fav + '}';
    }

}
