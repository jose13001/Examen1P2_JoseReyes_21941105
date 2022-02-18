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
        do{
            System.out.println("OPCIONES UNIVERSO");
            System.out.println("0...Salir");
            System.out.println("1...Crear Universo");
            System.out.println("2...Modificar Universo");
            System.out.println("3...Eliminar Universo");
            System.out.println("4...Listar Universos");
            System.out.println("Ingrese una opcion");
            opc1=lea.nextInt();
            switch(opc1){
                case 1:
                    System.out.println("***Creando Universo***");
                    System.out.println("Como llamaras a este nuevo universo: ");
                    String Universo=lea.next();
                    universo.add(new Universo(Universo));
                    break;
                case 2:
                    System.out.println("Ingrese la posicion del universo que desea modificar: ");
                    int pos=lea.nextInt();
                    System.out.println("Ingrese un nuevo nombre:  ");
                    Universo =lea.next();
                    universo.get(pos).setNombre(Universo);
                    break;
                case 3:  
                    System.out.println("Que universo deseas eliminar el dia de hoy?");                   
                    int delete=lea.nextInt();
                    universo.remove(delete);
                    
                    break;
                case 4:
                    System.out.println("Lista de Universos");
                    int i=0;
                    for(Universo U: universo){
                        i++;
                        System.out.println(i+" "+U);
                    }
                    break;
            }
        }while(opc1!=0);
        
    }
    
    public static void menuEscuadron(){
        
    }
    
    public static void menuPersona(){
        
    }
    
}
