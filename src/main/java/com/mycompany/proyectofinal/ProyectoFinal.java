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
        
        Stack pila = null;
        BufferedReader bufer =  new BufferedReader(new InputStreamReader(System.in));    
        String entrada;
        
        int t;
        Data<Double> dato;
        int opcion;
        char respuesta;
        
    
        System.out.println("Este es un Pograma que Creaar un Archivo mediande una Pila... :) ");
        System.out.println("😢😢😢😢😢😢😢😢😢😢😢😢😢😢😢");
        System.out.println("Por favor dime que quieres hacer: ");
        System.out.println("Ingresa la opción deseada...");
        System.out.println("=======================================");
        System.out.println();
        
        
        do{
            System.out.println("1. Crear un Nuevo Baul de Objetos....");
            System.out.println("2. Ver el estado del Baul...");
            System.out.println("3. Meter un Objeto al Baul...");
            System.out.println("4. Ver si el Baul esta lleno o Vacío...");
            System.out.println("5. Sacar items del Baul...");
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
                    //nombre = entrada;
                    System.out.println();
                    //Para contruir la pila, se pide el tamaño de la pila (Cuantos elementos guardará)
                    System.out.println("Escribe el tamaño del Baul: ");
                    entrada = bufer.readLine();
                    t = Integer.parseInt(entrada);
                    pila = new Stack(t);
                    
                    break;
                    
                    //Probamos el estado de la pila si está vacia
                case 2:
                    System.out.println("El estado actual del Baul: ");
                    if(pila.isEmpty()){
                        System.out.println("El Baul esta vacio \n");
                    }else{
                        System.out.println("la pila tiene items \n");
                    }
                    break;
                    
                    //Introducimos información en la pila
                case 3:
                    System.out.println("=================================");
                    do{
                        System.out.println("Escribe el dato ( double ) a introducir ");
                        entrada = bufer.readLine();
                        dato = new Data<>(Double.parseDouble(entrada));
                        if(pila.push(dato)){
                            System.out.println("Objeto introducido con exito!");
                            System.out.println("Quieres introducir más datos? Escriba n para parar: ");
                            entrada = bufer.readLine();
                            respuesta = entrada.charAt(0);
                        }
                        else{
                            System.out.println("Lo siento este Baul está lleno");
                            respuesta = 'n';
                        }
                    }while(respuesta != 'n');
                    
                    break;
                    
                    //Probar el estado de la pila está vacia 
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("Estado actual del Baul: ");
                    if(pila.isFull()){
                        System.out.println("El baul está lleno");
                    }else{
                        System.out.println("El baul aun no está lleno");
                    }
                    break;
                    
                    //Sacar todos los elementos de la pila e imprimirlos
                case 5:
                    while(!pila.isEmpty()){
                        dato = pila.pop();
                        System.out.println("Retirando valores del Baul: " + dato.getValue());
                    }
                    break;
                    
                case 6:
                    System.out.println("Proyecto chafa finalizado...");
                    System.out.println("Una disculpa me fallaron las dependencias :( 😢😢😢");
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
