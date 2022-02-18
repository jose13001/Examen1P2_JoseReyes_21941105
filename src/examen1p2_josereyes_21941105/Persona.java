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
public class Persona {
    public String nombre;
    public String poder;
    public String debilidad;
    public String HeroeoVillano;
    public int Fuerza;
    public int HablidadM;
    public int HabilidadF;
    public boolean Escuadron;

    public Persona(String nombre, String poder, String debilidad, String HeroeoVillano, int Fuerza, int HablidadM, int HabilidadF, boolean Escuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.HeroeoVillano = HeroeoVillano;
        this.Fuerza = Fuerza;
        this.HablidadM = HablidadM;
        this.HabilidadF = HabilidadF;
        this.Escuadron = Escuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroeoVillano() {
        return HeroeoVillano;
    }

    public void setHeroeoVillano(String HeroeoVillano) {
        this.HeroeoVillano = HeroeoVillano;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public int getHablidadM() {
        return HablidadM;
    }

    public void setHablidadM(int HablidadM) {
        this.HablidadM = HablidadM;
    }

    public int getHabilidadF() {
        return HabilidadF;
    }

    public void setHabilidadF(int HabilidadF) {
        this.HabilidadF = HabilidadF;
    }

    public boolean isEscuadron() {
        return Escuadron;
    }

    public void setEscuadron(boolean Escuadron) {
        this.Escuadron = Escuadron;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HeroeoVillano=" + HeroeoVillano + ", Fuerza=" + Fuerza + ", HablidadM=" + HablidadM + ", HabilidadF=" + HabilidadF + ", Escuadron=" + Escuadron + '}';
    }
    
    
    


    
    
}
