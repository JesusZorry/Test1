/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Equipo {
    private String nombre;
    private List<Partido> partidosJugados;
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=Nombre;
    }
}
