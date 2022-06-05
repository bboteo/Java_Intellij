package com.bboteo.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Hola Mundo");

        System.out.println("Ingrese una cadena");
        //a = sc.next();
        a = sc.nextLine();

        //PRIMERA SOLUCION
        for (int i = 0; i < a.length();i++){
            System.out.print(a.charAt(i) + "-");
        }
        System.out.println("");
        System.out.println(a);

        //OTRA SOLUCION
        String[] p = new String[a.length()];
        for (int i=0; i < a.length(); i ++){
            p[i] = a.substring(i,(i+1));
        }
        for (int i = 0; i<a.length();i++){
            System.out.print(p[i]+"-");
        }

    }
}
