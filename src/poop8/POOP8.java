/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop8;

/**
 *
 * @author Jennifer MVM
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono = new Poligono();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Triangulo triangulo = new Triangulo();
        
        System.out.println(poligono);
        System.out.println(cuadrilatero);
        System.out.println(triangulo);
        
        Poligono pol;
        pol = new Poligono();
        System.out.println(pol);
        
        Object objeto;
        objeto = pol;
        System.out.println(objeto);
        
        pol = triangulo;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(pol);
        System.out.println(objeto);
        
        System.out.println("#################2###############");
        getPoligono(cuadrilatero);
        getPoligono(triangulo);
        getPoligono(poligono);
        
    }
    public static void getPoligono(Poligono p){
        if(p instanceof Triangulo){
            System.out.println("Esto es un Triangulo");
        }else if(p instanceof Cuadrilatero){
            System.out.println("Esto es un cuadrilatero");
        }else{
            System.out.println("Es un poligono");
        }
    }
}
