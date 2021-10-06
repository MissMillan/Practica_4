/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author milla
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    int a,b;
   public void suma(){
       System.out.println("La suma de "+ a + "+" + b + "=" + (a+b));
       
   } 
    
   int suma2() {
       
       return a+ b;
   }
    
   public int sumaArgs(int a, int b){
       this.a = a;
       this.b=b;
       return this.a + this.b;
   }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Aritmetica() {
    }
   
    //atributos del proyecto    cubo
    
    private int ancho;
    private int alto;
    private int profundo;

    public Aritmetica(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

 
    
    //metodo para calular el volumen del cubo
    public int  calcularVolumen(){
        
        return this.ancho*this.alto*this.profundo;
    }
    
    
}
