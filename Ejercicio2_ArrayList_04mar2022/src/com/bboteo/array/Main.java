package com.bboteo.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*EJERCICIO
-Manipular los datos de un ArrayList
-Debe de crear un ArrayList de tipo numerico o el que desee
-Por medio de un menu (repetitivo) debe hacer lo que siguiente
con ese ArrayList (aplicar las condiciones que sean necesarias):
    - Agregar un elmento
    - Buscar un elemento
    - Modificar un elemento
    - Eliminar un elemento por posicion
    - Insertar en una posicion un elemento
    - Mostrar todos los elementos del ArrayList
    -Salir
    NOTA: En las opciones que lo amerite debe de mostrar el arreglo
    actual, esto para que los cambios a aplicar no sean
    al azar.
 */
        int w0, posicion;
        String item;

        ArrayList<String> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("**************************");
            System.out.println("Bienvenido al ArrayList\n"+
                    "1.Agregar un elemento\n"+
                    "2.Buscar un elemento\n"+
                    "3.Modificar un elemento\n"+
                    "4.Eliminar un elemento por posicion\n"+
                    "5.Insertar en una posicion un elemento\n"+
                    "6.Mostrar todos los elementos del Array\n"+
                    "0.Salir");
            w0 = sc.nextInt();

            switch (w0){
                case 0://Salir
                    break;
                case 1: //Agregar un elemento
                    System.out.println("**************************");
                    System.out.println("Ingrese el String: ");
                    item = sc.next();
                    a1.add(item);
                    break;
                case 2: //Buscar un item
                    System.out.println("**************************");
                    if (a1.size()==0){
                        System.out.println("El array esta vacio");
                    }
                    else {
                        System.out.println("Que busca?");
                        item = sc.next();
                        if (a1.contains(item)){
                            System.out.println("El String esta en el array\n"+
                                    "En la posicion: "+
                                    a1.indexOf(item));
                        }
                        else {
                            System.out.println("El String no esta en el array");
                        }
                    }
                    break;
                case 3://Modificar item
                    System.out.println("**************************");
                    if (a1.size()==0){
                        System.out.println("El array esta vacio");
                    }
                    else {
                        System.out.println("Array Actual");
                        for (int i=0; i < a1.size(); i++){
                            System.out.println("Posicion["+
                                    i+"]: "+
                                    a1.get(i));
                        }
                        System.out.println("ingrese la posicion a modificar ?");
                        posicion = sc.nextInt();

                        if (posicion < a1.size()){
                            System.out.println("Ingrese el nuevo String");
                            item = sc.next();
                            a1.set(posicion,item);

                            System.out.println("Array Actual");
                            for (int i=0; i < a1.size(); i++){
                                System.out.println("Posicion["+
                                        i+"]: "+
                                        a1.get(i));
                            }
                        }
                        else {
                            System.out.println("Posicion fuera de rango");
                        }
                    }
                    break;
                case 4://Eliminar un elemento
                    System.out.println("**************************");
                    if (a1.size()==0){
                        System.out.println("El array esta vacio");
                    }
                    else {
                        System.out.println("Array Actual");
                        for (int i=0; i < a1.size(); i++){
                            System.out.println("Posicion["+
                                    i+"]: "+
                                    a1.get(i));
                        }
                        System.out.println("ingrese la posicion a eliminar");
                        posicion = sc.nextInt();

                        if (posicion < a1.size()){
                            a1.remove(posicion);

                            System.out.println("Array Actual");
                            for (int i=0; i < a1.size(); i++){
                                System.out.println("Posicion["+
                                        i+"]: "+
                                        a1.get(i));
                            }
                        }
                        else {
                            System.out.println("Posicion fuera de rango");
                        }
                    }
                    break;
                case 5://Insertar en una posicion
                    System.out.println("**************************");
                    if (a1.size()==0){
                        System.out.println("El array esta vacio");
                    }
                    else {
                        System.out.println("Array Actual");
                        for (int i=0; i < a1.size(); i++){
                            System.out.println("Posicion["+
                                    i+"]: "+
                                    a1.get(i));
                        }


                        System.out.println("ingrese la posicion a insertar");
                        posicion = sc.nextInt();
                        System.out.println("Ingrese el String a insertar");
                        item = sc.next();

                        if (posicion < a1.size()){
                            a1.add(posicion,item);

                            System.out.println("Array Actual");
                            for (int i=0; i < a1.size(); i++){
                                System.out.println("Posicion["+
                                        i+"]: "+
                                        a1.get(i));
                            }
                        }
                        else {
                            System.out.println("Posicion fuera de rango");
                        }
                    }
                    break;
                case 6: //Ver el array completo
                    System.out.println("**************************");
                    if (a1.size()==0){
                        System.out.println("El array esta vacio");
                    }
                    else {
                        System.out.println("Array Actual");
                        for (int i=0; i < a1.size(); i++){
                            System.out.println("Posicion["+
                                    i+"]: "+
                                    a1.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion equivocada");
            }
        }while (w0 != 0);

        System.out.println("***********  BYE  ***************");
    }
}
