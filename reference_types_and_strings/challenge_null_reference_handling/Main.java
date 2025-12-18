/*
Escriba un método para verificar de forma segura si una cadena es nula o está vacía y devolver un mensaje adecuado para cada caso.

Si la cadena es null, devuelve:Input is null.
Si la cadena está vacía, devuelve:Input is empty.
Si la cadena contiene texto, devuelve: Input is: <value>(reemplaza <value>con el valor de la cadena real).
Llame a este método desde el mainmétodo con al menos un ejemplo de cada caso e imprima el resultado devuelto.
    */
package com.example;

public class Main {
    public static String checkString(String input) {
        if (input == null) {
            return "Input is null.";
        } else if (input.isEmpty()) {
            return "Input is empty.";
        } else {
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkString(null));
        System.out.println(checkString(""));
        System.out.println(checkString("Hello world"));
        System.out.println(checkString("test123"));
    }
}
