package com.bboteo.array;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Double> arrayList2; //Solo esta declarado pero no inicializado

        System.out.println(arrayList.size());

        arrayList.add("Perro");
        arrayList.add("Gato");
        arrayList.add("Hamster");
        arrayList.add("Tortuga");
        System.out.println(arrayList.size());
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(300);
        System.out.println(arrayList1.size());

        //Se inicializa el Array hasta el momento en que se utilice
        arrayList2 = new ArrayList<>();
        arrayList2.add(1.5);
        arrayList2.add(1.7);
        arrayList2.add(1.9);
        System.out.println(arrayList2.size());

        //Agregar en posiciones
        arrayList.add(0,"Loro");
        arrayList.add(4,"Conejo");
        arrayList.add(5,"Canario");

        //Elimina un elemento
        arrayList.remove(0);

        //Mostrar en la posicion indicada
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        //System.out.println(arrayList.isEmpty());




    }
}
