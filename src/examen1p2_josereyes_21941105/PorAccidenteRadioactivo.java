/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_josereyes_21941105;

import java.util.Random;

/**
 *
 * @author josec
 */
public class PorAccidenteRadioactivo extends Persona{
    
    int edadAccidente;
    String tipoAccidente;

    public PorAccidenteRadioactivo(int edadAccidente, String tipoAccidente, String nombre, String poder, String debilidad, String HeroeoVillano, int Fuerza, int HablidadM, int HabilidadF, boolean Escuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, Fuerza, HablidadM, HabilidadF, Escuadron);
        this.edadAccidente = edadAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public String toString() {
        return super.toString()+"PorAccidenteRadioactivo{" + "edadAccidente=" + edadAccidente + ", tipoAccidente=" + tipoAccidente + '}';
    }

    @Override
    public void finalChance(Persona p1, Persona p2) {
         Random rdm = new Random();
        int r = rdm.nextInt(3);
        switch(r){
            case 1:
                p1.setFuerza((int)Math.round(p1.getFuerza()*4));
                break;
            case 2:
                p1.setHablidadM((int)Math.round(p1.getHablidadM()*4));
                break;
            case 3:
                p1.setHabilidadF((int)Math.round(p1.getHabilidadF()*4));
                break;
        }
    }
    
    

    
    
}
