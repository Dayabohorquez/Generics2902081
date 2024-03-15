package com.generics2902081;

import java.util.HashMap;
import java.util.Map;
import com.generics2902081.entities.Canario;
import com.generics2902081.entities.Gato;
import com.generics2902081.entities.Jaula;
import com.generics2902081.entities.Perro;

public class PetStore {


    public static void main(String[] args) {
        
        Map<String, Jaula<?>> PetStore = 
                    new HashMap<String, Jaula<?>>();

        PetStore.put("J1", new Jaula<>(new Perro("Canino"), new Gato("Felino")  ));

        PetStore.put("J2", new Jaula<>(new Canario("Ave"), new Canario("Ave")  ));

        PetStore.put("J3", new Jaula<>(new Perro("Canino"), new Perro("Canino")  ));

        PetStore.put("J4", new Jaula<>(new Gato("Felino"), new Gato("Felino")  ));

        //Evidencia final
        //Recorrer el mapa
        //para alimentar cada mascota
        for( Map.Entry<String, Jaula<?>> m: PetStore.entrySet()){
            System.out.println("IDENTIFICADOR: " + m.getKey());
            System.out.println("JAULA");
            System.out.println("tipo mascota 1: " +
                                m.getValue().
                                getPet1().
                                getType());
            System.out.println("---------------------");
            
            System.out.println("IDENTIFICADOR: " + m.getKey());
            System.out.println("JAULA");
            System.out.println("tipo mascota 2: " +
                                m.getValue().
                                getPet2().
                                getType());
            System.out.println("---------------------");
        }
    }
}

