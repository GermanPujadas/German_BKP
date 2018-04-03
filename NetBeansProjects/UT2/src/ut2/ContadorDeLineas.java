/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2;
import java.io.*;
/**
 *
 * @author germanpujadas
 */
public class ContadorDeLineas {
    
    public static int contarLineas(String nombreCompletoArchivo){ 
        
        int cantidadDeLineas = 0;
        FileReader fr;
        try {
            fr = new FileReader(nombreCompletoArchivo); 
            BufferedReader br = new BufferedReader(fr); 
            String lineaActual = br.readLine();
            while (lineaActual != null){
                cantidadDeLineas ++;
                lineaActual = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
        System.out.println("Error al leer el archivo "+nombreCompletoArchivo); e.printStackTrace();
        } catch (IOException e)
            {
        System.out.println("Error al leer el archivo "+nombreCompletoArchivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente"); 
        return cantidadDeLineas;
    }

}
