package estructuradedatos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class PruebaListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.insertarFinal("1");
        lista.insertarFinal("2");
        lista.insertarFinal("8");
        lista.insertarFinal("3");
        lista.insertarFinal("9");
        lista.insertarFinal("6");
        
        lista.imprimirLista();
        
        System.out.println(lista.borrar("8"));
        System.out.println(lista.borrar("7"));
        System.out.println(lista.borrar("1"));
        lista.imprimirLista();
    }
    
}
