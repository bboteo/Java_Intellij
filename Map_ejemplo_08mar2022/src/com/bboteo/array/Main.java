package com.bboteo.array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<Integer,String> mapH = new HashMap<>();
        mapH.put(101,"Motor");
        mapH.put(104, "Llantas");
        mapH.put(101,"Bateria");

        System.out.println(mapH.values());

        //********Recorrer el arreglo
        for (Map.Entry<Integer, String> mapHR: mapH.entrySet()){
            Integer key = mapHR.getKey();
            String value = mapHR.getValue();
            System.out.println(key + ">>>"+value);

        }
//EJERCICIO
    /*Utilizanod HashMap y TreeMap elaborar un Map con 12
    paises y utilizar sus respectivos prefijos telefonicos
    como claves, ejemplo 502 Guatemala
    -Mostrar el tamanano de cada Map
    -Mostrar el valor de 3 de paises que en desee de cada Map
    Luego mostrar sus claves y sus elementos completos
     */

        Map<Integer,String> mapPais = new HashMap<>();

        mapPais.put(502,"Guatemala");//1
        mapPais.put(221,"Bolivia");//2
        mapPais.put(129,"Cabo Verde");//3
        mapPais.put(309,"Irak");//4
        mapPais.put(328, "Indonesia");//5
        mapPais.put(503,"El Salvador");//6
        mapPais.put(506,"Costa Rica");//7
        mapPais.put(125,"Libia");//8
        mapPais.put(505,"Francia");//9
        mapPais.put(406,"Australia");//10
        mapPais.put(212,"Nicaragua");//11
        mapPais.put(216,"Mexico");//12

        System.out.println("*******HashMap*********");
        System.out.println(mapPais.size());
        System.out.println(mapPais.get(502));
        System.out.println(mapPais.get(216));
        System.out.println(mapPais.get(100));

        for (Map.Entry<Integer,String> mapPR : mapPais.entrySet()){
            Integer codigo = mapPR.getKey();
            String pais = mapPR.getValue();
            System.out.println(codigo+">>"+pais);
        }

    //TreeMap

        Map<Integer,String> mapPais2 = new TreeMap<>();
        mapPais2.put(502,"Guatemala");//1
        mapPais2.put(221,"Bolivia");//2
        mapPais2.put(129,"Cabo Verde");//3
        mapPais2.put(309,"Irak");//4
        mapPais2.put(328, "Indonesia");//5
        mapPais2.put(503,"El Salvador");//6
        mapPais2.put(506,"Costa Rica");//7
        mapPais2.put(125,"Libia");//8
        mapPais2.put(505,"Francia");//9
        mapPais2.put(406,"Australia");//10
        mapPais2.put(212,"Nicaragua");//11
        mapPais2.put(216,"Mexico");//12

        System.out.println("*******TreeMap*********");
        System.out.println(mapPais2.size());
        System.out.println(mapPais2.get(502));
        System.out.println(mapPais2.get(216));
        System.out.println(mapPais2.get(100));

        for (Map.Entry<Integer,String> mapPR : mapPais2.entrySet()){
            Integer codigo = mapPR.getKey();
            String pais = mapPR.getValue();
            System.out.println(codigo+">>"+pais);
        }

    }
}
