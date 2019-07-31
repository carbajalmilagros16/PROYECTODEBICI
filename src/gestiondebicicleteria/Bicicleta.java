/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondebicicleteria;

/**
 *
 * @author Usuario
 */
public class Bicicleta {
    
    String nroDeSerie;
    String modelo;
    int año;
    double precio;

    public Bicicleta(String nroDeSerie, String modelo, int año, double precio) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }
    
}
