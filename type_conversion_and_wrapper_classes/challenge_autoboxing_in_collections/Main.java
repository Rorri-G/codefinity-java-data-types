/*
Implementar un método que calcule y devuelva el valor promedio de todos los elementos en la ArrayList proporcionadacomo doble.

Complete el método para que utilice un bucle para sumar todos los valores en la lista de entrada.
Calcula el promedio como el doble y devuélvelo desde el método.
En el método principal, llame a su método e imprima el resultado utilizando esta plantilla: Average value: {average}.*/
package com.example;

import java.util.ArrayList;

public class Main {
    // Implement this method to calculate and return the average
    public static double calculateAverage(ArrayList<Integer> numbers) {
       int sum = 0;
        for (int num : numbers) {
            sum += num;
    }
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        double average = calculateAverage(numbers);
        System.out.println("Average value: " + average);
    }
}
