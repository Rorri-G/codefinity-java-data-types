/*
Convierta de forma segura un doublevalor a un inty detecte la posible pérdida de datos durante la conversión utilizando un método independiente.

Implemente un método estático llamado safeDoubleToInt(double value)así:
Toma a doublecomo parámetro.
Convierte el parámetro en un inty lo asigna a una variable.
Imprime el doublevalor original con la plantilla:"Original double value: {inputValue}"
Imprime el intvalor convertido con la plantilla:"Converted int value: {intValue}"
Si la conversión genera pérdida de datos (el doublevalor no coincide exactamente con el intvalor después de la conversión), imprime el mensaje de advertencia:"Warning: Data loss occurred during conversion."
Llamada safeDoubleToIntdesde el mainmétodo con un valor doble de ejemplo.
    */
package com.example;

public class Main {
    // Implement this method
    public static void safeDoubleToInt(double value) {
        // Your code here
                int intValue = (int) value;
        System.out.println("Original double value: " + value);
        System.out.println("Converted int value: " + intValue);
        if (value != intValue) {
            System.out.println("Warning: Data loss occurred during conversion.");
    }
    }
    public static void main(String[] args) {
        safeDoubleToInt(42.7);
    }
}
