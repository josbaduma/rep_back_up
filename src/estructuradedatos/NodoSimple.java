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
public class NodoSimple {
    
    /**
     * Declaracion de parametros
     */
    private String _dato;
    
    private NodoSimple _siguiente;
    
    /**
     * Constructor de la clase
     * @param pDato 
     */
    public NodoSimple(String pDato)
    {
        this._dato = pDato;
        this._siguiente = null;
    }
    
    /**
     * Se obtiene el dato almacenado
     * @return 
     */
    public String getDato() {
        return _dato;
    }

    /**
     * Se modifica el dato del nodo
     * @param pDato 
     */
    public void setDato(String pDato) {
        this._dato = pDato;
    }

    /**
     * Se obtiene el nodo siguiente de la lista
     * @return 
     */
    public NodoSimple getSiguiente() {
        return _siguiente;
    }

    /**
     * Se modifica el nodo siguiente en la lista
     * @param pSiguiente 
     */
    public void setSiguiente(NodoSimple pSiguiente) {
        this._siguiente = pSiguiente;
    }

    
}
