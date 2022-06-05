package com.bboteo.array;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Escritura y lectura de un archivo txt
        //Escritura
        FileWriter fw; //Crea un archivo en una ruta indica
        PrintWriter pw; //Permite agregar informacion a un archivo

        try{
            fw = new FileWriter("C:\\Users\\bboteo\\Desktop\\test.txt");
            pw = new PrintWriter(fw);

            pw.println("Esta es una cadena desde Inteligent");
            for (int i=0; i < 100; i++){
                pw.println("Esta es la linea: "+i);
            }
            pw.close();
        }catch (Exception e){
            System.err.println("Upsss... Ocurrio un Error"+e);
        }

    }
}
