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
        universo.add(new Universo("616"));
        universo.add(new Universo("Ultimate"));
        universo.add(new Universo("2099"));
        universo.add(new Universo("NOIR"));
        universo.add(new Universo("Marvel Zombies"));
     
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
                    int y=0;
                    for(Universo U: universo){
                        y++;
                        System.out.println(y+" "+U);
                    }
                    int pos=lea.nextInt();
                    System.out.println("Ingrese un nuevo nombre:  ");
                    Universo =lea.next();
                    universo.get(pos).setNombre(Universo);
                    break;
                case 3:  
                    System.out.println("Que universo deseas eliminar el dia de hoy?");
                    int x=0;
                    for(Universo U: universo){
                        x++;
                        System.out.println(x+" "+U);
                    }
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
        int opc1;
        do{
            System.out.println("OPCIONES ESCUADRON");
            System.out.println("0...Salir");
            System.out.println("1...Crear Escuadron");
            System.out.println("2...Modificar Escuadron");
            System.out.println("3...Eliminar Escuadron");
            System.out.println("4...Listar Escuadrones");
            System.out.println("5...Simular Batalla");
            opc1=lea.nextInt();
            switch(opc1){
                case 1:
                    System.out.println("***Creando Escuadron***");
                    System.out.println("como llamaras a este nuevo escuadron: ");
                    String Escuadron=lea.next();
                    System.out.println("En que lugar se ubica su base: ");
                    String lugar=lea.next();
                    System.out.println("1...Heroes");
                    System.out.println("2...Villanos");
                    System.out.println("Que tipo de base sera: ");
                    int tipo=lea.nextInt();
                    boolean HV = true;
                    switch(tipo){
                        case 1:{
                            HV=true;
                            escuadron.add(new Escuadron(Escuadron,lugar,HV));
                        }
                        break;
                        case 2:{
                            HV=false;
                            escuadron.add(new Escuadron(Escuadron,lugar,HV));
                        }
                        break;
                    }
                    break;
                    
                case 2:
                    System.out.println("Ingrese posicion del Escuadron que desean modificar: ");
                    int y=0;
                    for(Escuadron U: escuadron){
                        y++;
                        System.out.println(y+" "+U);
                    }
                    int pos=lea.nextInt();
                    System.out.println("Ingrese nuevo nombre del escuadron");
                    String Esc=lea.next();
                    System.out.println("Ingrese nueva base");
                    String base=lea.next();
                    System.out.println("1...Heroes");
                    
                    break;
                case 3:
                    System.out.println("Que escuadron deseas eliminar");
                    int x=0;
                    for(Escuadron U: escuadron){
                        x++;
                        System.out.println(x+" "+U);
                    }
                    int delete=lea.nextInt();
                    escuadron.remove(delete);
                    
                    break;
                case 4:
                    System.out.println("Lista de escuadrones");
                     int i=0;
                    for(Escuadron U: escuadron){
                        i++;
                        System.out.println(i+" "+U);
                    }
                    break;
            }
            
        }while(opc1!=0);
        
        
    }
    
    public static void menuPersona(){
        
    }
    
}
