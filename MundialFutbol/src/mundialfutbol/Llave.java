/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Llave extends EtapaMundial{

    public Llave(String descripcionEtapa) {
        super(descripcionEtapa);
    }
    @Override
    public List<Equipo> getEquiposQueAvanzan(){
        List<Equipo> Equipillos = new ArrayList<>();
        return Equipillos;
    }
}
