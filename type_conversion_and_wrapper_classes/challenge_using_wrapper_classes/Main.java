/*
Implemente un método que convierta un array de Stringnúmeros en Integerobjetos mediante clases contenedoras y calcule la suma. El método principal debe llamar a este método e imprimir el resultado.

Define un método estático llamado sumStringNumbersque acepte un String[]parámetro.
Dentro del método, itere a través de la matriz y convierta cada cadena en un Integerusando un método de clase contenedora.
Acumula la suma de los valores convertidos y la devuelve.
En el mainmétodo, llame sumStringNumbersa la numbersmatriz y almacene el resultado.
Imprima el resultado utilizando la plantilla: The sum is: <sum>.
    */
package com.example;

public class Main {
    public static int sumStringNumbers(String[] numbers) {
        // Implement this method
           int sum = 0;
        for (String numStr : numbers) {
            Integer num = Integer.valueOf(numStr);
            sum += num;
    }
        return sum;
    }

    public static void main(String[] args) {
        String[] numbers = {"10", "20", "30", "40"};
        int sum = sumStringNumbers(numbers);
        System.out.println("The sum is: " + sum);
    }
}
