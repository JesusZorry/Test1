/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *
 * @author Administrador
 */
public class Resultado {
    private int golesLocal;
    private int golesVisitante;
    
    public int getGolesLocal(){
        return golesLocal;
    }
    public int getGolesVisitante(){
        return golesVisitante;
    }
    public boolean ganoLocal(){
        if(this.golesLocal > this.golesVisitante){
            return true;
        }
        return false;
    }
    public boolean empate(){
        if(this.golesLocal == this.golesVisitante){
            return true;
        }
        return false;
    }
}
