/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;
import java.util.Date;


/**
 *
 * @author Administrador
 */
public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    
     public  Partido(Date Fecha,Equipo Local, Equipo Visitante){
        this.fecha=Fecha;
        this.local=Local;
        this.visitante=Visitante;
    }
    public Resultado getResultado(){
        return this.resultado;
    }
    public Equipo getLocal(){
        return this.local;
    }
    public Equipo getVisitante(){
        return this.visitante;
    }
    
}
