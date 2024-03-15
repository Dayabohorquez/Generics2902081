package com.generics2902081;

import java.util.List;

import com.generics2902081.entities.Canario;
import com.generics2902081.entities.Gato;
import com.generics2902081.entities.Jaula;
import com.generics2902081.entities.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Canario canary1 = new Canario(null);
        canary1.setType("Ave");
        Canario canary2 = new Canario(null);
        Perro dog1 = new Perro(null);
        dog1.setType("Canino");
        Jaula <?> j1 = new Jaula <> (canary1, dog1);

        System.out.println(j1.getPet1().getType());
        System.out.println(j1.getPet2().getType());


        Perro dog3 = new Perro(null);
        Perro dog2 = new Perro(null);

        Jaula <Perro> j2 = new Jaula <Perro> (dog1, dog2);

        j2.setPet1(dog1);
        j2.setPet2(dog2);

        Gato cat1 = new Gato(null);
        Gato cat2 = new Gato(null);

        Jaula <Gato> j3 = new Jaula <Gato> (cat1, cat2);

        j3.setPet1(cat1);
        j3.setPet2(cat2);
    }
}