/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.compras;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author salom
 */
public class PrCompras {
    String ruta="DOCUMENTOS\\BD_COMPRAS.txt";
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    compras e;
    public ArrayList<compras> array=new ArrayList<>();
    
    public void insertar(compras e) throws IOException{
    fw=new FileWriter(ruta,true);
    String cad=e.getNombre()+"-"+e.getCantidad()+"-"+e.getAlbum()+"-"+e.getFecha();
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
        e=new compras(vec[0],vec[1],vec[2],vec[3]);
        array.add(e);
        cad=br.readLine();
    }
    br.close();
    fr.close();
    }
    
}
