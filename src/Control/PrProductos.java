/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.productos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author salom
 */
public class PrProductos {
    String ruta="DOCUMENTOS\\BD_PRODUCTOS.txt";
    
    FileReader fr;
    BufferedReader br;
    
    FileWriter fw;
    
    productos e;
    
    public ArrayList<productos> array=new ArrayList<>();
    
    
    public void insertar(productos e) throws IOException{
        fw=new FileWriter(ruta,true);
        String cad=e.getNombre()+"-"+e.getCompra()+"-"+e.getPrecio();
        fw.write(cad);
        fw.write(10);
        fw.close();
    }
    public void leer()throws IOException{   
    array.clear();
    fr=new FileReader(ruta);
    br=new BufferedReader(fr);
    String cad=br.readLine();
    String vec[];
    while (cad!=null){
        vec=cad.split("-");
        e=new productos(vec[0],vec[1],vec[2]);
        array.add(e);
        cad=br.readLine();
    }
    br.close();
    fr.close();
    }
}
