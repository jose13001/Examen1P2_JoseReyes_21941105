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
public class Alien extends Extraterrestre{
    
    String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, String HeroeoVillano, int Fuerza, int HablidadM, int HabilidadF, boolean Escuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, Fuerza, HablidadM, HabilidadF, Escuadron);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return super.toString()+"Alien{" + "planeta=" + planeta + '}';
    }
    

    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rmd = new Random();
        int r = rmd.nextInt();
        switch(r){
            case 1:
                p2.setFuerza(p2.getFuerza()/2);
                p2.setHabilidadF(p2.getHabilidadF()/2);
            case 2:
                p2.setHablidadM(p2.getHablidadM()/2);
                p2.setFuerza(p2.getFuerza()/2);
            case 3:
                p2.setHabilidadF(p2.getHabilidadF()/2);
                p2.setHablidadM(p2.getHablidadM()/2);
        }
        
    }

    
    
    
}
