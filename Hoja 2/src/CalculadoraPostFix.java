/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego_000
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CalculadoraPostFix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calcu = new MiCalcu();
        try{
            BufferedReader datos=new BufferedReader(new FileReader(new File("datos.txt")));
            System.out.println("Archivo se abrio correctamente \n");
            calcu.setString(datos.readLine());
            calcu.meterVector();
            System.out.println(calcu.getResultado());
            
            datos.close();
        }
        catch(IOException e){
            System.out.println("Error al abrir el archivo");
        }
        
        
    }
    
}
