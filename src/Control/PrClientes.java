/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.clientes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author salom
 */
public class PrClientes {
    String ruta="DOCUMENTOS\\BD_CLIENTES.txt"; //RUA de la bd
    //LEctura de los datos
    FileReader fr;
    BufferedReader br;
    //Escritura de la base de datos
    FileWriter fw;
    //Objeto de uso
    clientes e;
    public ArrayList<clientes> array =new ArrayList<>();
    
    //Metodo insertar
    public void insertar(clientes e) throws IOException{
        fw=new FileWriter(ruta,true);
        String cad=e.getCorreo()+"-"+e.getContraseña()+"-"+e.getNombre();
        fw.write(cad);//Graba datos en la bd
        fw.write(10);//Salto de inea
        fw.close();//cierra para evitar fugas de memoria
    }
    public void leer()throws IOException{
    array.clear();
    fr=new FileReader(ruta);
    br=new BufferedReader(fr);//Guarda en memoria lo que tiene fr en lectura
    String cad=br.readLine();
    String vec[];
    while (cad!=null){
        vec=cad.split("-");
        e= new clientes (vec[0],vec[1],vec[2]);
        array.add(e);
        cad=br.readLine();
    }
    br.close();
    fr.close();
    }
}
