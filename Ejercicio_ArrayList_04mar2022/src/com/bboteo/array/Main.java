package com.bboteo.array;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*EJERCICIO:
Elaborar 2 arraylist de tipo String con 10 datos ingresados al arreglo y mostrar:
- El size
- Los datos en la posicion 3,5 y 7
- La comprobacion del elemento de la ultima posicion
- Eliminar un elemento
- Agregar uno en la posicion donde fue eliminado el elemento anterior
- Luego mostrar todo el arreglo
- NOTA: esto lo debe de realizar para ambos arreglos
 */

        ArrayList<String> computadora = new ArrayList<>();

        System.out.println("ARREGLO No.1 - Computadora");
        computadora.add("Tarjeta Madre");
        computadora.add("Procesador");
        computadora.add("Memoria ROM");
        computadora.add("Mouse");
        computadora.add("Teclado");
        computadora.add("Memoria RAM");
        computadora.add("BIOS");
        computadora.add("Sistema Operativo");
        computadora.add("Puerto USB");
        computadora.add("Teclado");

        System.out.println("Tamano del Array computadora: "
                + computadora.size());
        System.out.println("Item #3 Array Computadora: "
                +computadora.get(3));
        System.out.println("Item #5 Array Computadora: "
                +computadora.get(5));
        System.out.println("Item #7 Array Computadora: "
                +computadora.get(7));
        System.out.println("Ultimo item Array Computadora: "
                +computadora.get(computadora.size()-1));

        System.out.println("***Removiendo Idex 5:"+computadora.get(5));
        computadora.remove(5);

        System.out.println("***Agregando Index 5: Impresora");
        computadora.add(5,"Impresora");

        System.out.println("Arreglo Completo Computadora:");
        for(int i=0; i < computadora.size();i++){
            System.out.println("Computadora["
                    +i+"]" +computadora.get(i));
        }
//*********************************************************
        ArrayList<String> casa = new ArrayList<>();
        System.out.println("ARREGLO No.2 - Casa");
        casa.add("Puerta");
        casa.add("Ventana");
        casa.add("Mesa");
        casa.add("Cama");
        casa.add("Ropero");
        casa.add("Silla");
        casa.add("TV");
        casa.add("Refrigeradora");
        casa.add("Lavadora");
        casa.add("Bano");

        System.out.println("Tamano del Array casa: "
                + casa.size());
        System.out.println("Item #3 Array Casa: "
                +casa.get(3));
        System.out.println("Item #5 Array Casa: "
                +casa.get(5));
        System.out.println("Item #7 Array Casa: "
                +casa.get(7));
        System.out.println("Ultimo item Array Casa: "
                +casa.get(casa.size()-1));

        System.out.println("***Removiendo Idex 5:"+casa.get(5));
        casa.remove(5);

        System.out.println("***Agregando Index 5: Licuadora");
        casa.add(5,"Licuadora");

        System.out.println("Arreglo Completo Casa:");
        for(int i=0; i < casa.size();i++){
            System.out.println("Casa["
                    +i+"]" +casa.get(i));
        }

    }
}
