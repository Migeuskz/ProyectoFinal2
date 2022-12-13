/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

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
public class Acciones {
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
           
        
        
}
