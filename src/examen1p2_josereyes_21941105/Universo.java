/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_josereyes_21941105;

import java.util.ArrayList;

/**
 *
 * @author josec
 */
public class Universo {
    
    String nombre;
    
    ArrayList<Escuadron> squads = new ArrayList();

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", squads=" + squads + '}';
    }
    
    

    
    
}
