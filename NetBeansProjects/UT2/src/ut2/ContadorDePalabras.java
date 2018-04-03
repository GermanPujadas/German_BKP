/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author germanpujadas
 */
public class ContadorDePalabras {
    
    private String archivo;
    private int cantidadDeLineas;
    public ContadorDePalabras (String ruta){
        this.archivo = ruta;
        this.cantidadDeLineas = ContadorDeLineas.contarLineas(ruta);
    }

    public String[] leerArchivo(){
        String[] lineas = new String [this.cantidadDeLineas]; 
        int i = 0;
        FileReader fr;
        try {
            fr = new FileReader(this.archivo); 
            BufferedReader br = new BufferedReader(fr); 
            String lineaActual = br.readLine();
            while (lineaActual != null){
                lineas[i] = lineaActual;
                i++;
                lineaActual = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
        System.out.println("Error al leer el archivo "+this.archivo); e.printStackTrace();
        } catch (IOException e)
            {
        System.out.println("Error al leer el archivo "+this.archivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
        return lineas;
    }
    
    public Integer contarPalabras (String[] documento){
    
        int contador = 0;
        boolean hayLetra = false;
        
        for (int i = 0; i< documento.length; i++){
        
            int contador_aux = 0;
            if (documento[i].equals(""))
            return 0;
                    else{
            for (int j = 0; j< documento[i].length(); j++){
                if (!hayLetra && Character.isLetter(documento[i].charAt(j)))
                    hayLetra = true;
            
                if ( hayLetra && (documento[i].charAt(j) == ' ' || i == documento[i].length()-1)) {
                    contador_aux += 1;
                    hayLetra = false;
                }
            }
        }   
           contador += contador_aux;
        }
        
        return contador;
    }
    
}
