/*
Escriba un método que extraiga las iniciales de una cadena de nombre completo y las devuelva como una cadena en mayúsculas. El método principal debe llamar a este método e imprimir las iniciales devueltas usando la plantilla: "Iniciales: AB", donde "AB" son las iniciales.

Implementa un método que toma un Stringparámetro que representa el nombre completo y devuelve una cadena que contiene las iniciales en mayúsculas.
En el método principal, llame a este método con la fullNamevariable e imprima las iniciales usando la plantilla: "Initials: AB"donde "AB" son las iniciales.*/
package com.example;

public class Main {
    public static String getInitials(String fullName) {
        String[] parts = fullName.split(" ");
        char firstInitial = Character.toUpperCase(parts[0].charAt(0));
        char lastInitial  = Character.toUpperCase(parts[1].charAt(0));
        return "" + firstInitial + lastInitial;

    }

    public static void main(String[] args) {
        String fullName = "John Doe";
        String initials = getInitials(fullName);
        System.out.println("Initials: " + initials);
    }
}
