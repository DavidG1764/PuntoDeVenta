/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author salom
 */
public class productos {
    String Compra;
    String Precio;
    String Nombre;
    public productos(){
    
    }
    public productos(String Nombre,String Compra,String Precio){
        this.Nombre=Nombre;
        this.Compra=Compra;
        this.Precio=Precio;
    }

    public String getCompra() {
        return Compra;
    }

    public void setCompra(String Compra) {
        this.Compra = Compra;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
