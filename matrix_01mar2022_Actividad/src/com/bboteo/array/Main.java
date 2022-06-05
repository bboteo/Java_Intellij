package com.bboteo.array;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int w0;
        Scanner sc0 = new Scanner(System.in);

        do {
            System.out.println("***********************************");
            System.out.println("SELECCIONE UN EJERCICIO");
            System.out.println("1.Suma filas y Colunmas en Matriz"+"\n2.Suma de Matriz"+"\n0.Terminar");
            w0 = sc0.nextInt();
            switch (w0){
                case 1:
                    /* Elaborar una matriz, donde tanto filas como columnas sean
                        ingresadas por el usuario:
                        - Llenar la matriz por el teclado
                        - Hacer el recorrido y mostrar los datos de la matriz
                        - Adicional debe mostrar el resultado de la suma de la filas
                            y la suma de las comunas en un JOptionPane.ShowMessageDialog
                    */
                    int n11,n12,n15,tf,tc;
                    Scanner sc = new Scanner(System.in);

                    //Crear Matriz m11
                    System.out.println("Ingrese la cantidad de filas");
                    n11 = sc.nextInt();
                    System.out.println("Ingrese la cantidad de columnas");
                    n12 = sc.nextInt();

                    int[][] m11 = new int[n11][n12];//Matriz del usuario
                    int[][] m12 = new int[(n11+1)][(n12+1)];//Matriz extendida

                    //Lllenar matriz m11
                    System.out.println("Ingrese los datos de la matriz");
                    for (int i=0; i < m11.length ; i ++){
                        for (int j=0; j < m11[i].length; j++){
                            System.out.println("Ingrese digito en posicion: "+i+","+j);
                            m11[i][j] = sc.nextInt();
                            m12[i][j] = m11 [i][j];
                        }
                    }

                    //m11.length --> # de filas
                    //m11[0].length --> # de columnas

                    //Sumar matriz - Columnas
                    n15 = 0;
                    tc=0;
                    for (int i=0; i< m11.length;i++){
                        for (int j=0; j < m11[0].length; j++){
                            n15 = n15 + m11[i][j];
                        }
                        m12[i][(m12[0].length-1)]=n15;
                        tc = tc + n15;
                        n15=0;
                    }

                    //Sumar matriz - Filas
                    n15=0;
                    tf=0;
                    for (int i=0; i< m11[0].length;i++){
                        for (int j=0; j < m11.length; j++){
                            n15 = n15 + m11[j][i];
                        }
                        m12[(m12.length-1)][i]=n15;
                        tf = tf + n15;
                        n15=0;
                    }

                    //Mostrar la matriz extendida
                    System.out.println("*********M1("+n11+"x"+n12+")********");
                    for (int i =0; i < m12.length; i++){
                        for (int j=0; j < m12[0].length; j++){
                            System.out.print(m12[i][j]+"|");
                        }
                        System.out.println("");
                    }

                    //Mostrar las sumas finales
                    JOptionPane.showMessageDialog(null,"TOTAL FILAS= "+tf+"\nTOTAL COLUMNAS= "+tc,"Resultado",JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 2:
                    /* Elaborar 2 matrices:
                        - La dimension de estas sera ingresada por el usuario (esta
                            solo debe de permitir matrices cuadradas)
                        - Los datos seran ingresados por el usuario
                        - Debe mostrar los datos ingresados en las dos matrices
                        - Debe de agregar una matriz adicional la cual se llenara con el
                            resultado de la suma de los datos de las dos matrices anteriores
                            luego mostrar esta matriz.
                    */
                    int n21,n22;
                    boolean n25;
                    Scanner sc2 = new Scanner(System.in);

                    //DIMENSIONES PARA MATRIZ (M1)
                    do{
                        System.out.println("***************************");
                        System.out.println("Cantidad de filas...");
                        n21 = sc2.nextInt();
                        System.out.println("Cantidad de columnas...");
                        n22 = sc2.nextInt();

                        if (n21 == n22){
                            System.out.println("Matriz - ACEPTADA");
                            n25 = false;
                        }
                        else{
                            System.out.println("Matriz - RECHAZADA\nIntente de nuevo");
                            n25 = true;
                        }
                    }while (n25);

                    //Datos a matriz1 y 2
                    int[][] m21 = new int[n21][n22];
                    int[][] m22 = new int[n21][n22];
                    int[][] m23 = new int[n21][n22];

                    System.out.println("XXXXXXXXXX  M1("+n21+"x"+n22+")XXXXXXXXXXXXXX");
                    for (int i=0; i < m21.length; i++){
                        for (int j=0; j < m21[0].length; j++){
                            System.out.println("M1("+i+","+j+"): ");
                            m21[i][j] = sc2.nextInt();
                        }
                    }

                    System.out.println("XXXXXXXXXX  M2("+n21+"x"+n22+")XXXXXXXXXXXXXX");
                    for (int i=0; i < m22.length; i++){
                        for (int j=0; j < m22[0].length; j++){
                            System.out.println("M2("+i+","+j+"): ");
                            m22[i][j] = sc2.nextInt();
                        }
                    }

                    //Mostrar matrices
                    System.out.println("******* M1("+n21+"x"+n22+")  &  M2("+n21+"x"+n22+"*******");
                    for (int i=0; i < m21.length; i++){
                        System.out.print("|");
                        for (int j=0; j < m21[i].length; j++){
                            System.out.print(m21[i][j]+"|");
                        }
                        System.out.print("     |");
                        for (int j=0; j < m22[i].length; j++){
                            System.out.print(m22[i][j]+"|");
                        }
                        System.out.println(" ");
                    }

                    //Sumar matrices
                    System.out.println("****** M3("+n21+"x"+n22+")***********");
                    for (int i=0; i < m21.length; i++){
                        System.out.print("|");
                        for (int j=0; j < m21[i].length; j++){
                            m23[i][j] = m21[i][j] + m22[i][j];
                            System.out.print(m23[i][j]+"|");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("********** BYE **********");
                    break;
                default:
                    System.out.println("***********************************");
                    System.out.println("Opcion incorrecta, intente de nuevo");
                    break;
            }
        } while (w0 != 0);
    }
}
