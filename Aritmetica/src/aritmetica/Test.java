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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Aritmetica aritl = new Aritmetica();
        aritl.a=5;
        aritl.b=1;
        aritl.suma();
        var res = aritl.suma2();
        System.out.println("El resultado de la suma es : "+  res);
        
        Aritmetica arit2 = new Aritmetica (5,6);
        res= arit2.sumaArgs(5, 6);
        System.out.println("La suma de argumentos es: "+ res);
    
    
        // nuevoMetodo();
    
         System.out.println("\n\tProyecto Cubo");
         Aritmetica cubo1 = new Aritmetica (3,2,6);
         System.out.println("El volumen de la caja es : "+ cubo1.calcularVolumen());
        var a = 10;
         //cambioValor(a);
         conversionDeTipos();
           operadorUnario();
    }
    
    //-------------------------------------------------------
    public static void nuevoMetodo(){
        System.out.println("En el nuevo metodo");
    }
    
    //-------------------------------------------------------------
    public static void cambioValor(int arg1){
        System.out.println("arg1"+ arg1);
        arg1=15;
        System.out.println("arg1 = "+ arg1);
    }
    
   //---------------------------------------------------------
    public static void conversionDeTipos(){
        
         String numCadena = "1";      
    byte numEntero = Byte.parseByte(numCadena);
        System.out.println(numCadena);
    }
    // -------------------------------------------------------
    public static void operadorUnario(){
        
        var x =5;//operador de cambio de signo
        var y =-x;
        System.out.println("x = : "+ x);
        System.out.println("y = : "+ y );
        
        //operador de negacion
        boolean z = true;
        boolean w = false;
        
        System.out.println("z = : "+ z);
        System.out.println("w = : "+ w);
        
        //operador preincremento 
        var a = 3;
        System.out.println("a = "+ a);
        var b = ++a; //primero se preincrementa y luego se asigna
        System.out.println("b = "+ b);
        
        //operador de post-incremento. 
        var c = 3;
        var d = c++;//primero se asigna y luego se incrementa
        System.out.println("c = "+ c);
        System.out.println("d = "+d);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
