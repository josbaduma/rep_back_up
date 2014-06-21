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
public class ListaSimple {

    /**
     * Declaracion de las variables
     */
    private NodoSimple _inicio;

    private NodoSimple _final;

    private int _contador;

    public ListaSimple() {
        this._contador = 0;
        this._inicio = this._final = null;
    }

    /**
     * Se pueden insertar los datos al final de la lista
     *
     * @param pDato
     * @param pLinea
     * @param pValor
     */
    public void insertarFinal(String pDato, int pLinea, int pValor) {
        //Se crea un nuevo nodo con todos sus atributos.
        NodoSimple _nuevo, _temp;
        _nuevo = new NodoSimple(pDato, pLinea, pValor);

        if (this._inicio == null) {
            this._inicio = this._final = _nuevo;
            this._contador++;
        } else {
        //Se declara una variable temporal para recorrer la lista hasta el final
            // y lograr la inserción.
            _temp = _inicio;
            //Se inicia un ciclo de recorrido
            while (_temp.getSiguiente() != null) {
                //Se mueve la referencia de la variable temporal
                _temp = _temp.getSiguiente();
            }
            //Se asigna el nuevo nodo al final de la lista
            _temp.setSiguiente(_nuevo);
            _temp = _nuevo;
            _temp.setSiguiente(null);
            this._contador++;
        }
    }

    /**
     * Se declara el método para poder insertar datos al inicio de la lista
     *
     * @param pDato
     * @param pLinea
     * @param pValor
     */
    public void insertarInicio(String pDato, int pLinea, int pValor) {
        //Se instancia un nuevo nodo con todos los valores
        NodoSimple _nuevo;
        _nuevo = new NodoSimple(pDato, pLinea, pValor);
        //Se verifica si la lista esta nula
        if (_inicio == null) {
            //Se asigna el primer elemento
            _inicio = _nuevo;
            _inicio.setSiguiente(null);
            this._contador++;
        } else {
            //Se asigna el nuevo nodo al inicio de la lista
            _nuevo.setSiguiente(_inicio);
            _inicio = _nuevo;
            this._contador++;
        }
    }

    /**
     * Metodo para elimnar datos de la lista y del cual se obtendra un valor
     * booleano si se elimino.
     *
     * @param pDato
     * @return
     */
    public boolean borrar(String pDato) {
        //Se inicializa una variable temporal
        NodoSimple temp, prev;
        //Asignacion de la variable temporal
        prev = temp = _inicio;
        //Se inicia un ciclo de busqueda
        while (temp != null) {
            //Se verifica si el dato fue encontrado
            if (temp.getNombre().compareTo(pDato) == 0) {
                //Se verifica el caso de que el dato sea el nodo inicial
                if (temp == _inicio) {
                    //Se libera la memoria
                    _inicio = temp.getSiguiente();
                    this._contador--;
                    return true;
                } else {
                    //Se elimina el dato siguiente
                    prev.setSiguiente(temp.getSiguiente());
                    this._contador--;
                    return true;
                }
            } else {
                //Se realiza un cambio de asignaciones
                prev = temp;
                temp = temp.getSiguiente();
            }
        }
        return false;
    }

    /**
     * Método implementado para mostrar la lista en consola
     */
    public void imprimirLista() {
        //Variable temporal.
        NodoSimple temp = _inicio;
        //Se verifica si esta vacia la lista
        if (temp == null) {
            return;
        }
        //Entra en un ciclo de recorrido
        while (temp != null) {
            //Se imprime el dato
            System.out.print(temp.getNombre() + " -> ");
            //Se mueve la referencia de la variable temporal
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    public NodoSimple buscar(String pDato) {
        NodoSimple _temp;
        //Se verifica si el dato esta en el inicio de la lista
        if (_inicio.getNombre().compareTo(pDato) == 0) {
            return this._inicio;
        } else {
            _temp = _inicio;
            //Se entra en un ciclo de busqueda y recorrido
            while (_temp.getSiguiente() != null) {
                //Se verifica si es el dato
                if (_temp.getNombre().compareTo(pDato) == 0) {
                    return _temp;
                }
                //Se meuve la referencia
                _temp = _temp.getSiguiente();
            }
            //Se verifica si el dato esta en la variable temporal
            if (_temp.getNombre().compareTo(pDato) == 0) {
                return _temp;
            }
            return null;
        }
    }
}
