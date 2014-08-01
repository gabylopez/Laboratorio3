/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja3au;

import java.io.*;
import java.util.Random;
/**
 *
 * @author Augusto
 */
public class Archivo {
    private int cantNum;
     File archivo;
     private String num;

    public void Archivo(){
        

    }
    public void crear(){
        archivo=new File ("C:\\Users\\Augusto\\Desktop\\archivos\\archivo.txt");
        try{
        if(archivo.createNewFile()){
            System.out.println("se ha creado el archivo");

        }
       }catch(IOException e){
            System.err.println("No se ha podido crear el archivo");
    }
        }
    public void escribir(){
      archivo=new File ("C:\\Users\\Augusto\\Desktop\\archivos\\archivo.txt");
      Random rnd = new Random();
      for(int contador=1; contador <=2000; contador++){
      cantNum = rnd.nextInt(10000);
      String myString;
      myString = Integer.toString(cantNum);

    try{
        FileWriter fw = new FileWriter(archivo, true);
        fw.append(myString+ " ");
        fw.close();
    }catch(IOException e){
            System.err.println("No se ha podido crear el archivo");
        }
       }
    }
    public String leerTxt(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){//repetir el ciclo, mientras bfREad tenga datos
                temp = temp + bfRead; //guardar texto archivo
            }
            texto= temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }

        return texto;
    }
    public String ordenarNum(String numeros){
        int conteo=0;
        char caracter= ' ';
        String a = numeros.substring(0,1);

        if(a != null){
        caracter = numeros.charAt(conteo);
        num= caracter+ num;
        conteo=conteo+1;
       }
       return num;
}
}
