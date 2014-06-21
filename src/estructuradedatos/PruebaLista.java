/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuradedatos;

/**
 *
 * @author jose
 */
public class PruebaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.insertarFinal("nom", 1, 10);
        lista.insertarFinal("noma", 1, 10);
        lista.insertarFinal("nomb", 1, 10);
        lista.insertarFinal("nomc", 1, 10);
        lista.insertarFinal("nomd", 1, 10);
        
        System.out.println(lista.buscar("nom").getValor());
    }
    
}
