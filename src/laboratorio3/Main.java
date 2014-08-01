/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja3au;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo a = new Archivo();
        a.Archivo();
        a.escribir();
        String numeros = a.leerTxt("C:\\Users\\Augusto\\Desktop\\archivos\\archivo.txt");
        System.out.println(a.ordenarNum(numeros));
   }
}

