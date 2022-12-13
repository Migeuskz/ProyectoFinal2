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
    public static void escribirArchivo(String dato) throws IOException {
        String archivo = "E:\\artistas.txt";
        FileWriter fw = new FileWriter(archivo, true);
        /*FileWriter construye un objeto FileWriter
        dado un objeto File. Si este es verdadero este lo escribe al final.
         */
        try {
            fw.write("\n"+dato);//Agrego la información al archivo
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo");
            e.printStackTrace();
        } finally {
            //Cierra el archivo si es que se pudo abrir para escritura
            try {
                //si se logró abrir el archivo, debemos cerrarlo
                if (null != archivo) {
                    fw.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
    }
//Album/Cancion

    public static void escribirArchivo(String dato, String name) throws IOException {
        File archivoE = new File("E:\\" + name + ".txt");
        if (!archivoE.exists()) {
            FileWriter arc = null;
            PrintWriter pw = null;
            try {
                arc = new FileWriter("E:\\" + name + ".txt");//Crea el archivo
                pw = new PrintWriter(arc);
                pw.println(dato);
            } catch (Exception e) {
                System.out.println("Error al escribir en archivo: " + name);
                e.printStackTrace();
            } finally {
                try {
                    //Cerrrar el archivo si es que se pudo abrir para escritura
                    if (null != arc) {
                        arc.close();
                    }
                } catch (Exception e2) {
                    System.out.println("Error al cerrar el archivo " + name);
                    e2.printStackTrace();
                }
            }
        }else{
        String archivo = "E:\\" + name + ".txt";
        FileWriter fw = new FileWriter(archivo, true);
        /*FileWriter lo mismo lo que que hace es crear el objeto y si es verdadero envia los datos al final.
         */
        try {
            fw.write("\n" + dato);//Añade la información al archivo
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo");
            e.printStackTrace();
        } finally {
            //Cierra el archivo si es que se pudo abrir para escritura
            try {
                //si se logró abrir el archivo, debemos cerrarlo
                if (null != archivo) {
                    fw.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
        }
    }
    
    public static void leerArchivos(String name){
        File archivo = null;//apunta a un archivo físico del dd
        FileReader fr=null;//para leer el archivo
        BufferedReader bufer=null;
        //creamos un apuntador al archivo físico
        archivo = new File ("E:\\"+name+".txt");
        if(!archivo.exists()){
            System.out.println("Error: No se ha inicializado");
        }else{
        try{
            //abrimos el archivo para lectura
            fr = new FileReader(archivo);
            //configurar bufer para hacer la lectura
            bufer = new BufferedReader(fr);
            //lectura del contenido del archivo
            String linea;
            //mientras haya información en el arhivo
            while((linea = bufer.readLine()) != null)
                System.out.println(linea);
        }catch(Exception e){
            System.out.println("Error: No se encuentra el archivo");
            e.printStackTrace();
        }finally{
            //Esta cláusula se ejecuta siempre 
            //Se cierra el archivo 
            try{
                //si se logró abrir el archivo, debemos cerrarlo
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
          }
        }
    } 
        
        
        
}
