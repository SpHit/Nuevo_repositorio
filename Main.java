package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long ini = System.currentTimeMillis();
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
        ArrayList<Integer> milista = new ArrayList<>();
        int num = 5;

        for (int i = 0; i < 500000; i++){
            milista.add(aleatorio.nextInt(100000));
        }
        long fi = System.currentTimeMillis();
        System.out.println(milista.contains(num));
        System.out.println("Y ha tardado " + (fi-ini) + " milisegundos");
    }
}
