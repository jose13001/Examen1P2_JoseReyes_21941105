/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_josereyes_21941105;

/**
 *
 * @author josec
 */
public class Deidad extends Extraterrestre{
    
    boolean creyentes;
    String religion;

    public Deidad(boolean creyentes, String religion, String nombre, String poder, String debilidad, String HeroeoVillano, int Fuerza, int HablidadM, int HabilidadF, boolean Escuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, Fuerza, HablidadM, HabilidadF, Escuadron);
        this.creyentes = creyentes;
        this.religion = religion;
    }

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return super.toString()+"Deidad{" + "creyentes=" + creyentes + ", religion=" + religion + '}';
    }
    

    @Override
    public void finalChance(Persona p1, Persona p2) {
        p1.setFuerza(p1.getFuerza()*4);
        p1.setHabilidadF(p1.getHabilidadF()*4);
        p1.setHablidadM(p1.getHablidadM()*4);
        p2.setFuerza(p2.getFuerza()/2);
        p2.setHabilidadF(p2.getHabilidadF()/2);
        p2.setHablidadM(p2.getHablidadM()/2);

    }
    
    
    
}
