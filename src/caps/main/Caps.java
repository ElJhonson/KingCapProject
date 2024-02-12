/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caps.main;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Caps implements Serializable{
    String silueta;
    String talla;
    String modelo;
    int precio;

    public Caps() {
    }

    public Caps(String silueta, String talla, String modelo, int precio) {
        this.silueta = silueta;
        this.talla = talla;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getSilueta() {
        return silueta;
    }

    public void setSilueta(String silueta) {
        this.silueta = silueta;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SILUETA: " + silueta + ",   TALLA: " + talla + ",   MODELO:  " + modelo + ",   PRECIO:  " + precio+"\n";
    }

    
    
    public Object[] toArray(){
        return new Object[]{silueta, talla, modelo, precio};
    }
}
