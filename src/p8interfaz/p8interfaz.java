/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8interfaz;

/**
 *
 * @author Jennifer MVM
 */
public class p8interfaz {
    public static void main(String[] args) {
        InstrumentoMusical instrumento;
        instrumento = new InstrumentoViento();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        instrumento = new Flauta();
        System.out.println(instrumento.tipoInstrumento());
    }
}
