/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class Deber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int tarifa = 3;
    int i = 40;
    int tarifatotal = 0;
    double iva;
    
    System.out.println("¿Cuantos mensajes envio este mes?");
    int mensaje = entrada.nextInt();
    
    if (mensaje <= 40){
        tarifatotal = 0;
    }else{
        if ((mensaje > 40) && (mensaje <= 200)){
            do{
                tarifatotal = tarifatotal+5;
                i+=1;
            }while(i < mensaje);
        }else{
            if (mensaje>200){
                do{
                tarifatotal = tarifatotal+5;
                i+=1;
                }while(i < 200);
                
                do{
                tarifatotal = tarifatotal+10;
                i+=1;
                }while(i < mensaje);
            }
        }
    }
    tarifatotal = tarifa + tarifatotal;
    iva = tarifatotal + (tarifatotal * 12)/100;
    System.out.printf("El total a pagar es: %f$\n", iva);
    }
    
}
