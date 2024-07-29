/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.stock;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author salom
 */
public class PrStock {
    String rute="DOCUMENTOS\\BD_STOCK.txt";
    
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    
    stock e;
    
    public ArrayList<stock> array =new ArrayList<>();
    
    public void insertar(stock e)throws IOException{
        fw=new FileWriter(rute,true);
        String cad=e.getDisco()+"-"+e.getCantidad();
        fw.write(cad);
        fw.write(10);
        fw.close();
    }
    public void leer() throws IOException{
        array.clear();
        fr=new FileReader(rute);
        br=new BufferedReader(fr);
        
        String cad=br.readLine();
        String vec[];
        while(cad !=null){
            vec=cad.split("-");
            e=new stock(vec[0],vec[1]);
            array.add(e);
            cad=br.readLine();
        }
        br.close();
        fr.close();
    }
    
    
}
