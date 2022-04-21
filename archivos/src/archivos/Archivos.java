/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author SALA H
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{ 
            File file = new File("C:\\Users\\SALA A\\Documents\\estudiantes.txt");
            if (file.createNewFile()){
                System.out.println("Archivo Creado: " + file.getName()); 
            }else{
                System.out.println("El archivo ya existe");
            }
            
        }
        catch (IOException e){
            System.out.println("ERROR.");
        }
        
        //Escribir en un archivo
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\SALA A\\Documents\\estudiantes.txt");
            myWriter.write("Ejemplo de escritura en archivo usando Write");
            myWriter.close();
            System.out.println("El archivo ha sido escrito.");
        }catch(IOException e){
            System.out.println("ERROR de esciruta.");
            e.printStackTrace();
        }
        
        //Leer el Archivo
        System.out.println("Leemos el archivo: ");
        try(FileReader myReader = new FileReader("C:\\Users\\SALA A\\Documents\\estudiantes.txt")){
            int i;
            while((i=myReader.read())!= -1){
            System.out.print((char)i);
            }
        }catch (IOException e){
            System.out.println("ERROR de lectura.");
            e.printStackTrace();
        }
    }
}
