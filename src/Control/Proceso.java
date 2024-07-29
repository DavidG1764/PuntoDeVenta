/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.empleado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author salom
 */

import java.util.ArrayList;

public class Proceso {
    String ruta = "DOCUMENTOS\\BD_EMPLEADO.txt";
    // Lectura de datos
    FileReader fr;
    BufferedReader br;
    // Escritura de datos
    FileWriter fw;
    // Objeto
    empleado e;
    

    public ArrayList<empleado> array = new ArrayList<>();

    // Método insertar
    public void insertar(empleado e) throws IOException {
        fw = new FileWriter(ruta, true);
        String cad = e.getNombre() + "-" + e.getFecha() + "-" + e.getCurp() + "-" + e.getId() + "-" + e.getNumero();
        fw.write(cad); // Graba en el bd
        fw.write(10); // Enter
        fw.close();
    }

    // Método leer
    public void leer() throws IOException {
        array.clear(); // Limpia el array
        fr = new FileReader(ruta);
        br = new BufferedReader(fr); // Copiar la información a la memoria
        // Leer la primera línea del archivo
        String cad = br.readLine();
        String vec[]; // División de la cadena
        while (cad != null) {
            vec = cad.split("-");

            // Validar que el vector tiene exactamente 5 elementos y que los campos no están vacíos
            if (vec.length == 5 && !vec[0].isEmpty() && !vec[1].isEmpty() && !vec[2].isEmpty() && !vec[3].isEmpty() && !vec[4].isEmpty()) {
                e = new empleado(vec[0], vec[1], vec[2], vec[3], vec[4]);
                array.add(e);
            } else {
                // Manejar el error según sea necesario, por ejemplo, imprimir un mensaje
                System.err.println("Formato inválido o datos incompletos en la línea: " + cad);
            }

            cad = br.readLine(); // Se vuelve a repetir todos los registros y se guardan en el array
        }
        br.close();
        fr.close();
    }
    
}


