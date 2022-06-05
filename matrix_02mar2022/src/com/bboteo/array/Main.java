package com.bboteo.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] frutas = new String[3][2];
        frutas[0][0] = "Uva";
        frutas[0][1] = "Naranja";
        frutas[1][0] = "Limon";
        frutas[1][1] = "Pina";
        frutas[2][0] = "Manzana";
        frutas[2][1] = "Fresa";

        System.out.println(frutas[0][0]);

    /*Ejercicio 1
    Realice una matriz de 4x4 tipo string y mostrar
    3 posiciones
     */
        String[][] a = new String[4][4];
        a[0][0] = "cero-cero";
        a[0][1] = "cero-uno";
        a[0][2] = "cero-dos";
        a[0][3] = "cero-tres";
        a[1][0] = "uno-cero";
        a[1][1] = "uno-uno";
        a[1][2] = "uno-dos";
        a[1][3] = "uno-tres";
        a[2][0] = "dos-cero";
        a[2][1] = "dos-uno";
        a[2][2] = "dos-dos";
        a[2][3] = "dos-tres";
        a[3][0] = "tres-cero";
        a[3][1] = "tres-uno";
        a[3][2] = "tres-dos";
        a[3][3] = "tres-tres";

        System.out.println(a[0][3]);
        System.out.println(a[3][3]);
        System.out.println(a[2][2]);

        for (int i =0; i<4 ; i++){
            for (int j =0; j<4 ; j++){
                System.out.print(a[i][j]+"||");
            }
            System.out.println("");
        }
        System.out.println("************************");

    /*Ejercicio 2
    Realice una matriz de 5x3 tipo Char y mostrar
    3 posiciones
     */
        char[][] b = new char[5][3];
        b[0][0] = 75;
        b[0][1] = 76;
        b[0][2] = 77;

        b[1][0] = 78;
        b[1][1] = 79;
        b[1][2] = 80;

        b[2][0] = 81;
        b[2][1] = 82;
        b[2][2] = 83;

        b[3][0] = 69;
        b[3][1] = 70;
        b[3][2] = 71;

        b[4][0] = 72;
        b[4][1] = 73;
        b[4][2] = 74;

        System.out.println(b[2][2]);
        System.out.println(b[4][2]);
        System.out.println(b[3][0]);

        for (int i =0; i<5 ; i++){
            for (int j =0; j<3 ; j++){
                System.out.print(b[i][j]+"||");
            }
            System.out.println("");
        }
        System.out.println("************************");


    /*Ejercicio 3
    Realice una matriz de 3x7 tipo int y mostrar
    3 posiciones
     */
        int[][] c = new int[3][7];
        c[0][0] = 0;
        c[0][1] = 1;
        c[0][2] = 2;
        c[0][3] = 3;
        c[0][4] = 4;
        c[0][5] = 5;
        c[0][6] = 6;

        c[1][0] = 7;
        c[1][1] = 8;
        c[1][2] = 9;
        c[1][3] = 10;
        c[1][4] = 11;
        c[1][5] = 12;
        c[1][6] = 13;

        c[2][0] = 14;
        c[2][1] = 15;
        c[2][2] = 16;
        c[2][3] = 17;
        c[2][4] = 18;
        c[2][5] = 19;
        c[2][6] = 20;

        System.out.println(c[2][2]);
        System.out.println(c[2][6]);
        System.out.println(c[0][6]);

        for (int i =0; i < c.length ; i++){
            for (int j =0; j < c[i].length ; j++){
                System.out.print(c[i][j]+"||");
            }
            System.out.println("");
        }
        System.out.println("************************");

    /*Ejercicio:
    Dimension de 6x6, llenar una matriz por el teclado
    hacer el recorrido y mostrar los datos de la matriz
     */

        int[][] d = new int[6][6];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < d.length; i++){
            for (int j=0; j < d[i].length; j++){
                System.out.println("Ingrese digito en: "+i+","+j);
                d[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<d.length; i++){
            for (int j=0; j < d[i].length; j++){
                System.out.print("||"+d[i][j]);
                System.out.println("");
            }
        }

    }
}
