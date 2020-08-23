
package Ejercicio10POO;

import java.util.*;
import java.util.Date;
import java.util.Calendar;


public class FechaService {
    //Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) 
    //y el año (1900 a 2050).
    
    // POR QUÉ ESTE NO ES VOID Y EL RESTO SÍ? A DÓNDE ES QUE
    // DEVUELVE LA INFORMACIÓN Y EL RESTO NO?
    public Fecha leer(Fecha g1){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresá el día, mes y año");
            g1.setDia(in.nextInt());
            g1.setMes(in.nextInt());
            g1.setAnio(in.nextInt());
            return g1;
    }

//Método bisiesto() para indicar si el año es bisiesto o no    
        
    public void bisiesto(Fecha g1){
        if ((g1.getAnio() % 4 == 0) && ((g1.getAnio() % 100 != 0) ||
                (g1.getAnio() % 400 == 0))){
            System.out.println("Es bisiesto");
        }
        else{
            System.out.println("No es bisiesto");
        }
    }
    
//Método diasMes(int) para devolver el número de días del mes indicado (para el
//año de la fecha).    
        
    public void diasMes(Fecha g1){
        switch(g1.getMes()){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
        System.out.println("El mes " + g1.getMes() + " tiene 31 días");
        break;
            case 4:
            case 6:
            case 9:
            case 11:
        System.out.println("El mes " + g1.getMes() + " tiene 30 días");
        break;
            case 2:
                if((g1.getAnio() % 4 == 0) && ((g1.getAnio() % 100 != 0) ||
                (g1.getAnio() % 400 == 0))){
                    System.out.println("El mes de " + g1.getMes() + " tiene 29 "
                            + "días.");
                }
                else {
                    System.out.println("El mes de " + g1.getMes() + " tiene " +
                            "28 días");
                }
        }

    }
    
 //Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-
//12-2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se
//pondrá en 1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará
//mediante los métodos setters de cada atributo. Los setters también se llamarán en
//el constructor parametrizado y en el método leer().

    
    public void validar(Fecha g1, int dd1, int mm1, int aa1){
        if((g1.getMes() == 2) && (g1.getDia() == 29) && (g1.getAnio() % 4 != 0) 
                && ((g1.getAnio() % 100 == 0) || (g1.getAnio() % 400 != 0))) {
                    g1.setDia(1);
                    System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                            g1.getAnio());
        }
        else if((g1.getMes() == 2) && (g1.getDia() > 29)) {
                    g1.setDia(1);
                    System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                            g1.getAnio());
        }
        else if ((g1.getDia() < 1 || g1.getDia() > 31) && (g1.getMes() < 1 || 
                g1.getMes() > 12) && (g1.getAnio() < 1900 || g1.getAnio() 
                > 2050)){
                    g1.setDia(1);
                    g1.setMes(1);
                    g1.setAnio(1900);
                    System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                            g1.getAnio());
        }
        else if((g1.getDia() < 1 || g1.getDia() > 30) && (g1.getMes() != 1 && 
                g1.getMes() != 3 && g1.getMes() != 5 && g1.getMes() != 7 &&
                g1.getMes() != 8 && g1.getMes() != 10 && g1.getMes() != 12)){
            g1.setDia(1);
            g1.setMes(1);
            System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                    g1.getAnio());
                }
        else if((g1.getDia() < 1 || g1.getDia() > 31) && (g1.getMes() == 1 || 
                g1.getMes() == 3 || g1.getMes() == 5 || g1.getMes() == 7 ||
                g1.getMes() == 8 || g1.getMes() == 10 || g1.getMes() == 12)){
            g1.setDia(1);
            g1.setMes(1);
            System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                    g1.getAnio());
        }
        else if(g1.getMes() < 1 || g1.getMes() > 12){
            g1.setMes(1);
            System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                    g1.getAnio());
        }
        else if(g1.getAnio() < 1900 || g1.getAnio() > 2050){
            g1.setAnio(1);
            System.out.println(g1.getDia() + "/" + g1.getMes() + "/" + 
                    g1.getAnio());
        }
        else{
            System.out.println("La fecha es correcta");
        }
 
    }
    
//    Método diasTranscurridos() para devolver la cantidad de días transcurridos desde
//    el 1-1-1900 hasta la fecha ingresada por el usuario.
            
     public void diasTranscurridos(Fecha g1){
      Calendar cal1 = new GregorianCalendar();
      Calendar cal2 = new GregorianCalendar();

        cal1.set(1900, 1, 1);
        cal2.set(g1.getAnio(), g1.getMes(), g1.getDia());
        System.out.println("Días transcurridos= " + daysBetween(cal1.getTime(),
                cal2.getTime()));
     }
     public static int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        }
     
//Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
//por el usuario y la proporcionada como parámetro.
     
     public void diasEntre(Fecha g1, int a3, int m3, int d3){
         Calendar cal0 = new GregorianCalendar();
         Calendar cal3 = new GregorianCalendar();
         
        cal0.set(a3, m3, d3);
        cal3.set(g1.getAnio(), g1.getMes(), g1.getDia());
        System.out.println("Días transcurridos bis= " + daysEntre(cal0.getTime(),
                cal3.getTime()));
         
     }
     public static int daysEntre(Date d2, Date d1) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        }
    //Método siguiente() para devolver el día siguiente del día de la fecha 
     //ingresada.

     public void siguiente(Fecha g1){
        if((g1.getMes() == 12) && g1.getDia() == 31){
           g1.setAnio(g1.getAnio() + 1);
           g1.setMes(1);
           g1.setDia(1);
        }
        else if((g1.getMes() == 1 || g1.getMes() == 3 || g1.getMes() == 5 ||
                g1.getMes() == 7 || g1.getMes() == 8 || g1.getMes() == 10) &&
                g1.getDia() == 31){
            g1.setMes(g1.getMes() + 1);
            g1.setDia(1);
        }
        else if((g1.getMes() == 4 || g1.getMes() == 6 || g1.getMes() == 9) &&
                g1.getDia() == 30){
            g1.setMes(g1.getMes() + 1);
            g1.setDia(1);
        }
        else if((g1.getMes() == 2) && (g1.getDia() == 28) && 
                (g1.getAnio() % 4 == 0) && ((g1.getAnio() % 100 != 0) 
                || (g1.getAnio() % 400 == 0))){
            g1.setDia(29);
        }
        else if((g1.getMes() == 2) && (g1.getDia() == 28 || g1.getDia() == 29)){
            g1.setMes(3);
            g1.setDia(1);
        }
        else{
            g1.setDia(g1.getDia() + 1);
        }
   
         System.out.println("La fecha siguiente es " + g1.getDia() + "/" + 
                 g1.getMes() + "/" + g1.getAnio());
         
         }
    //Método anterior() para devolver el día siguiente del día de la fecha 
     //ingresada.
     public void anterior(Fecha g1){
        if((g1.getMes() == 1) && (g1.getDia() == 2)){
           g1.setAnio(g1.getAnio() - 1);
           g1.setMes(12);
           g1.setDia(31);
        }
        else if((g1.getMes() == 2 || g1.getMes() == 4 || g1.getMes() == 6 ||
                g1.getMes() == 8 || g1.getMes() == 9 || g1.getMes() == 11) &&
                (g1.getDia() == 2)){
            g1.setMes(g1.getMes() - 1);
            g1.setDia(31);
        }
        else if((g1.getMes() == 5 || g1.getMes() == 7 || g1.getMes() == 10 ||
                g1.getMes() == 12) && g1.getDia() == 2){
            g1.setMes(g1.getMes() - 1);
            g1.setDia(30);
        }
        else if((g1.getMes() == 3) && (g1.getDia() == 2) && 
                (g1.getAnio() % 4 == 0) && ((g1.getAnio() % 100 != 0) 
                || (g1.getAnio() % 400 == 0))){
            g1.setDia(29);
            g1.setMes(2);
        }
        else if(g1.getMes() == 3){
            g1.setDia(28);
            g1.setMes(2);
        }
        else{
            g1.setDia(g1.getDia() - 2);
        }
   
         System.out.println("La fecha anterior es " + g1.getDia() + "/" + 
                 g1.getMes() + "/" + g1.getAnio());
         
         }     
     
     
     
     }

     
     


