/*
 * Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
menos los siguientes métodos:
• Constructor predeterminado con el 1-1-1900 como fecha por defecto
• Constructor parametrizado con día, mes y año ingresados por el usuario.
• Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a
2050).
• Método bisiesto() para indicar si el año es bisiesto o no.
• Método diasMes(int) para devolver el número de días del mes indicado (para el
año de la fecha).
• Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-
12-2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se
pondrá en 1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará
mediante los métodos setters de cada atributo. Los setters también se llamarán en
el constructor parametrizado y en el método leer().
• Método diasTranscurridos() para devolver la cantidad de días transcurridos desde
el 1-1-1900 hasta la fecha ingresada por el usuario.
• Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
• Método anterior() para devolver el día anterior del día de la fecha ingresada.
 */
package Ejercicio10POO;

public class Fecha {
    //atributos
    private int dia, mes, anio;
    //Constructor predeterminado con el 1-1-1900 como fecha por defecto
    public Fecha(){
        dia = 1;
        mes = 1;
        anio = 1900;
    }
    //Constructor parametrizado con día, mes y año ingresados por el usuario.
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
