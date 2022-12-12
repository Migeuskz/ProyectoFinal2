/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author MigueSkz
 */
public class Stack {
    private Data[] stack;
    private int top;
    private int length;
    
    //Crea una pila con espacio para t Data
    
    public Stack(int t){
        stack = new Data[t];
        top = t;
        this.length =t;
        System.out.println("El valor de Top es: " + this.top);
        System.out.println("El Tamaño de la pila: " + stack.length);
    }
    
    //Regresa true si la pila está vacia 
    public boolean isEmpty(){
        if(top==stack.length)
            return true;
        else
            return false;
    }
    
    //Regresa True si la pila ya está llena
    public boolean isFull(){
        if(top == 0)
            return true;
        else
            return false;
    }
    
    //Inserta un elemento de la pila
    public boolean push(Data d){
        if(this.isFull())//La pila está llena y no se puede insertar más datos
            return false;
        this.top--;
        stack[top] = d;
        System.out.println("El valor de top: " + this.top);
        return true;
    }
    
    //Saca un elemento de la pila 
    public Data pop(){
        Data unDato = null;
        //Si la pila NO está vacía, se pueden retirar elementos 
        if(!this.isEmpty()){
            System.out.println("Retirando elemento [ " + top + " ]");
            unDato = stack[top];
            this.top++;
        }
        return unDato;
    }
    
    //Regresa el número de elementos que están en la pila
    public int getSize(){
        return this.stack.length;
    }
}
