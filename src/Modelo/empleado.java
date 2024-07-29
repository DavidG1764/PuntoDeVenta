/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author salom
 */
public class empleado {
    String nombre;
    String fecha;
    String curp;
    String id;
    String numero;
    public empleado(){
    
    }
    public empleado(String nombre , String fecha , String curp , String id , String numero){
    this.nombre=nombre;
    this.fecha=fecha;
    this.curp=curp;
    this.id=id;
    this.numero=numero;
    }
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
     this.nombre=nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
