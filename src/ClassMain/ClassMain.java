/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMain;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class ClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        double radio;
        Circunferencia circuns= new Circunferencia();
        
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
        
        String resultadoCircun = circuns.crearCircunferencia(radio);
        
        System.out.println(resultadoCircun);
        
        
        
        
        
        
        
    }
    
}
