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
    private String _nombre;
    
    private int _linea, _valor;
    
    private NodoSimple _siguiente;
    
    /**
     * Constructor de la clase
     * @param pNombre 
     */
    public NodoSimple(String pNombre, int pLinea, int  pValor)
    {
        this._nombre = pNombre;
        this._linea = pLinea;
        this._valor = pValor;
        this._siguiente = null;
    }
    
    /**
     * Se obtiene el nombre almacenado
     * @return 
     */
    public String getNombre() {
        return _nombre;
    }

    /**
     * Se modifica el nombre del nodo
     * @param pNombre 
     */
    public void setNombre(String pNombre) {
        this._nombre = pNombre;
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

    public int getLinea() {
        return _linea;
    }

    public void setLinea(int pLinea) {
        this._linea = pLinea;
    }

    public int getValor() {
        return _valor;
    }

    public void setValor(int pValor) {
        this._valor = pValor;
    }
}
