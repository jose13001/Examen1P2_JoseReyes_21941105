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
public class Mutante extends Persona{
    
    ArrayList <String> FactoresMutantes;

    public Mutante(ArrayList<String> FactoresMutantes, String nombre, String poder, String debilidad, String HeroeoVillano, int Fuerza, int HablidadM, int HabilidadF, boolean Escuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, Fuerza, HablidadM, HabilidadF, Escuadron);
        this.FactoresMutantes = FactoresMutantes;
    }
    
    
    
    
}
