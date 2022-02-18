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
public class Escuadron {
    
    //ATRIBUTOS
    String nombre ,LugarBase ,lider;
    boolean HeroeVillano;
    ArrayList<Persona>miembros;

    public Escuadron(String nombre, String LugarBase, String lider, boolean HeroeVillano, ArrayList<Persona> miembros) {
        this.nombre = nombre;
        this.LugarBase = LugarBase;
        this.lider = lider;
        this.HeroeVillano = HeroeVillano;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return LugarBase;
    }

    public void setLugarBase(String LugarBase) {
        this.LugarBase = LugarBase;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public boolean isHeroeVillano() {
        return HeroeVillano;
    }

    public void setHeroeVillano(boolean HeroeVillano) {
        this.HeroeVillano = HeroeVillano;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", LugarBase=" + LugarBase + ", lider=" + lider + ", HeroeVillano=" + HeroeVillano + ", miembros=" + miembros + '}';
    }
    
    
}
