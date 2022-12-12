/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MigueSkz
 */
public class ProyectoFinal {

    public static void main(String[] args) throws IOException {
        
        System.out.println("😢😢😢😢😢😢😢😢😢😢😢😢😢😢😢");
        BufferedReader bufer =  new BufferedReader(new InputStreamReader(System.in));    
        
        System.out.println("Este es un Pograma que Crea un Archivo mediante una Pila... :) ");
        String entrada;
        String nombre;
        int opcion;
        char respuesta;
        
        System.out.println("Este es un Pograma que Creaar un Archivo mediande una Pila... :) ");
        System.out.println("Por favor dime que quieres hacer: ");
        System.out.println("Ingresa la opción deseada...");
        System.out.println("=======================================");
        System.out.println();
        
        
        do{
            System.out.println("1. Crear un Nuevo Baul de Objetos....");
            System.out.println("2. Mostrar el Baul...");
            System.out.println("3. Meter un Objeto al Baul...");
            System.out.println("4. Sacar ub Objeto...");
            System.out.println("5. Eliminar baul...");
            System.out.println("6. Terminar Programa...");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();
            entrada =bufer.readLine();
            opcion = Integer.parseInt(entrada);
            
            switch(opcion){
                case 1:
                    System.out.println("=================================");
                    System.out.println("Escribe el nombre del Baul...");
                    System.out.println();
                    entrada = bufer.readLine();
                    nombre = entrada;
                    System.out.println();
                    
                    break;
                    
                case 2:
                    System.out.println("=================================");
                    System.out.println("Estas son tus cosas...");
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("=================================");
                    System.out.println("Escribe que quieres meter...");
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("=================================");
                    System.out.println("Sacando cosas del Baul...");
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("=================================");
                    System.out.println("Eliminando Baul...");
                    System.out.println();
                    break;
                    
                case 6:
                    System.out.println("=================================");
                    System.out.println("Programa chafa Finalizado...");
                    System.out.println("Espero y consigamos el 8...lo siento :(😢😢");
                    break;
                    
                default:
                    System.out.println("=================================");
                    System.out.println("Lo siento esta opción no existe :(...");
                    System.out.println("Por favor escriba otra cosa...");
                    System.out.println();
                    break;
            }
        }while(opcion!=6);
    }
}
