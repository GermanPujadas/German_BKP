/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2;

/**
 *
 * @author germanpujadas
 */
public class UT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        
        //HOLA SOY YO PROBANDO EL GIT :D
        ContadorDePalabras contador = new ContadorDePalabras("");
        System.out.println("Cantidad de palabras del documento: "+ contador.contarPalabras(contador.leerArchivo()));
        
    }
    
}
