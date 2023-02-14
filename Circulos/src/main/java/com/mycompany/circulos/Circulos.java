package com.mycompany.circulos;

import java.util.Scanner;

public class Circulos {

    public static void main(String[] args) {
        Circulos execute = new Circulos();
        execute.iniciar();
    }
    
    public void iniciar() {
        
        boolean acabar = false;
        while (acabar == false) {

        double radio = menu();
        
        Scanner x = new Scanner(System.in);
        System.out.println("");
        System.out.println("Elige que quieres hacer:");
        int elegir = x.nextInt();
            
            if (elegir == 1) {
                
                circunferencia(radio);
                
            }
            
            if (elegir == 2) {
                
                area(radio);
                
            }
            
            if (elegir == 3) {
                
                volumen(radio);
                
            }
            
            if (elegir == 4) {
             
                todoloanterior(radio);
                
            }
            
            if (elegir <= 0 || elegir >= 5) {
            
                acabar = true;
        
            }
        }
        
    }
    
    public void todoloanterior(double radio) {
        
        circunferencia(radio);
        
        area(radio);
    
        volumen(radio);
        
    }
    
    public void volumen(double radio) {
        
        System.out.println("Volumen:");
        double A = radio*radio*Math.PI;
        
        Scanner z = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Inserta la altura");
        
        double altura = z.nextDouble();
        
        System.out.println(A*altura);
        System.out.println("");
        
    }
    
    public void area (double radio) {
        
        System.out.println("Area:");
        System.out.println(radio*radio*Math.PI);
        System.out.println("");

        
    }
    
    public void circunferencia(double radio) {
        
        System.out.println("Circunferencia:");
        System.out.println(Math.PI*2*radio);
        System.out.println("");

        
    }
    
    public double menu() {
        
        System.out.println("1 - Circunferencia");
        System.out.println("2 - Area");
        System.out.println("3 - Volumen");
        System.out.println("4 - Todo lo anterior");
        System.out.println("Cualquier otro numero acaba el programa");
        
        Scanner y = new Scanner(System.in);
        System.out.println("");
        System.out.println("Inserta el radio:");
        double radio = y.nextDouble();
        
        return(radio);
        
    }
    
    
}
