/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_josehernandez;

import java.util.Date;

/**
 *
 * @author jrdjh
 */
public class administrador extends Usuario {

    public administrador() {
    }

    public administrador(String nom_usuario, String contrasena, Date fecha_nacimiento, String num_telefono, String correo, Genero genero_favorito) {
        super(nom_usuario, contrasena, fecha_nacimiento, num_telefono, correo, genero_favorito);
    }

}
