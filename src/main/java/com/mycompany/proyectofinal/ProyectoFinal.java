/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofinal;

import static com.mycompany.proyectofinal.Acciones.leerArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author MigueSkz
 */
public class ProyectoFinal {
    
    public static void leerArchivo(String name){
        File archivo = null;//apunta a un archivo físico del dd
        FileReader fr = null;//para leer el archivo
        BufferedReader bufer = null;
        
        try{
            //creamos un apuntador a un archivo en físico
            archivo = new File("E:\\" + name + ".txt" );
            //abremos el archivo para lectura
            fr = new FileReader(archivo);
            //configurar bufer para hacer la lectura
            bufer = new BufferedReader(fr);
            
            //Lectura del contenido del archivo 
            String linea;
             //mientras haya información en el archivo 
            while((linea = bufer.readLine()) != null)
                System.out.println("Linea del archivo: " + linea);
            
        }catch(Exception e){
            System.out.println("Error: No se encuentra el archivo");
            e.printStackTrace();
        }finally{
            //Esta cláusula se ejecuta siempre
            //Se cierra el archivo
            try{
                if(null != fr){
                    //Si se logró abrir el archivo, debemos cerrarlo.
                    fr.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
    }
    
    public static void escribirArchivo(String name){
        FileWriter archivo = null; 
        PrintWriter pw = null;
        BufferedReader bufer2 = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        try{
            archivo = new FileWriter("E:\\" + name + ".txt");
            pw = new PrintWriter(archivo);
            do{
                System.out.println("Escribe la información a guardar en el archivo: ");
                entrada = bufer2.readLine();
                //Agrega lo leído en teclado al archivo en disco
                pw.println(entrada);
                System.out.println("Escribe s para continuar, n para parar: ");
                entrada = bufer2.readLine();
                respuesta = entrada.charAt(0);
            }while(respuesta != 'n');
            
        }catch(Exception e){
            System.out.println("Error al escribir el archivo: " + name);
            e.printStackTrace();
        }finally{
            try{
                //Cerrar el archivo si es que se pudo abrir para escritura
                if(null != archivo){
                    archivo.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo " + name);
                e2.printStackTrace();
            }
        }
    }
    

    public static void main(String[] args) throws IOException {
        
        Stack pila = null;
        BufferedReader buferT =  new BufferedReader(new InputStreamReader(System.in));    
        String entrada;
        String fileName;
        int t;
        Data<Double> dato;
        int opcion;
        char respuesta;
        Acciones acciones = new Acciones();
    
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
            entrada =buferT.readLine();
            opcion = Integer.parseInt(entrada);
            
            switch(opcion){
                case 1:
                    System.out.println("=================================");
                    System.out.println("Escribe el nombre del Baul...");
                    System.out.println();
                    entrada = buferT.readLine();
                    fileName = entrada;
                    escribirArchivo(fileName);
                    System.out.println();
                    //Para contruir la pila, se pide el tamaño de la pila (Cuantos elementos guardará)
                    System.out.println("Escribe el tamaño del Baul: ");
                    entrada = buferT.readLine();
                    t = Integer.parseInt(entrada);
                    pila = new Stack(t);
                    
                    
                    break;
                    
                    //Probamos el estado de la pila si está vacia
                case 2:
                    System.out.println("Contenido del archivo");
                    leerArchivo(entrada);
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
                        entrada = buferT.readLine();
                        dato = new Data<>(Double.parseDouble(entrada));
                        if(pila.push(dato)){
                            System.out.println("Objeto introducido con exito!");
                            System.out.println("Quieres introducir más datos? Escriba n para parar: ");
                            entrada = buferT.readLine();
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
