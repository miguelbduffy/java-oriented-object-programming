package Ejercicio10POO;

import java.util.Scanner;

public class MainFecha {
  
    public static void main(String[] args) {
        
       FechaService fechaservice = new FechaService();
       
       Fecha cuent = new Fecha();   
         
       fechaservice.leer(cuent);
              
       System.out.println("La fecha es " + cuent.getDia() + "/" + 
                cuent.getMes() + "/" + cuent.getAnio());
       
       System.out.println("Ingresá otro día, mes y año");
         Scanner in = new Scanner(System.in);
            int d3 = in.nextInt();
            int m3 = in.nextInt();
            int a3 = in.nextInt();
            
            System.out.println("El otro día mes y año es: " + d3 + "/" + m3 +
                    "/" + a3);
        
        fechaservice.bisiesto(cuent);
        
        
        
        fechaservice.diasTranscurridos(cuent);
        
 //       fechaservice.validar(cuent);
        
       
        
        fechaservice.validar(cuent, cuent.getDia(), cuent.getMes(), 
                cuent.getAnio());
        
        fechaservice.diasMes(cuent);
        
        fechaservice.diasEntre(cuent, a3, m3, d3);
        fechaservice.siguiente(cuent);
        fechaservice.anterior(cuent);
    }
    
}
