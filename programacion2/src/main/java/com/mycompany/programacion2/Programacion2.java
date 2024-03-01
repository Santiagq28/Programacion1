package com.mycompany.programacion2;

public class Programacion2 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de Seguridad", 33, "Pequeño Demonio");
        homero.greeting();
        
        Character bart = new Character("Bartolomeo", "Vago", 10, "Ay Caramba!");
        bart.greeting();
    }
    static class Character{
        String name;
        String ocupation;
        int age;
        String phrase;

        public Character(String name, String ocupation, int age, String phrase) {
            this.name = name;
            this.ocupation = ocupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        
        void greeting(){
            System.out.println(this.phrase);
        }
    }
            
}