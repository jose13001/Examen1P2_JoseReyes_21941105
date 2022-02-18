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
public class SuperHumano extends Persona{
    
    String superpoder;

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, String HeroeoVillano, int Fuerza, int HablidadM, int HabilidadF, boolean Escuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, Fuerza, HablidadM, HabilidadF, Escuadron);
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return super.toString()+"SuperHumano{" + "superpoder=" + superpoder + '}';
    }
    

    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rdm = new Random();
        int r = rdm.nextInt(3);
        int r2 =rdm.nextInt(2);
        switch(r){
            case 1:
                p1.setFuerza((int)Math.round(p1.getFuerza()*4));
                switch(r2){
                    case 1:
                        p1.setHabilidadF(p1.getHabilidadF()/2);
                        break;
                    case 2:
                        p1.setHablidadM(p1.getHablidadM()/2);
                        break;
                }
                break;
            case 2:
                p1.setHablidadM((int)Math.round(p1.getHablidadM()*4));
                switch(r2){
                    case 1:
                        p1.setHabilidadF(p1.getHabilidadF()/2);
                        break;
                    case 2:
                        p1.setFuerza(p1.getFuerza()/2);
                        break;
                }
                break;
            case 3:
                p1.setHabilidadF((int)Math.round(p1.getHabilidadF()*4));
                switch(r2){
                    case 1:
                        p1.setFuerza(p1.getFuerza()/2);
                        break;
                    case 2:
                        p1.setHablidadM(p1.getHablidadM()/2);
                        break;
                }
                break;
        }
    }
    
    
    
}
