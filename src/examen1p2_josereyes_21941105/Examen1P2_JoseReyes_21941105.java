/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_josereyes_21941105;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author josec
 */
public class Examen1P2_JoseReyes_21941105 {
    static ArrayList<Universo>universo =new ArrayList<>();
    static ArrayList<Escuadron>escuadron =new ArrayList<>();
    static ArrayList<Persona>heroes =new ArrayList<>();
    static ArrayList<Persona>villanos =new ArrayList<>();
    static Scanner lea =new Scanner(System.in);

   
    public static void main(String[] args) {
     
        int opc;
        do{
            System.out.println("****MENU PRINCIPAL****");
            System.out.println("0...SALIR");
            System.out.println("1...OPCIONES UNIVERSO");
            System.out.println("2...OPCIONES ESCUADRON");
            System.out.println("3...OPCIONES PERSONA");
            System.out.println("INGRESE UNA OPCION: ");
            opc=lea.nextInt();
            
            switch(opc){
                case 0:
                    System.out.println("Gracias por jugar marvel:universe collide");
                    break;
                case 1:
                    menuUniverso();
                    break;
                case 2:
                    menuEscuadron();
                    break;
                case 3:
                    menuPersona();
                    break;
                    
            }
        }while(opc!=0);
    }
    
    public static void menuUniverso(){
        int opc1;
        
    }
    
    public static void menuEscuadron(){
        
    }
    
    public static void menuPersona(){
        
    }
    
}
