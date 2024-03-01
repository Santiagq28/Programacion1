package com.mycompany.programacion2;
import character.Character;
public class Programacion2 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de Seguridad", 33, "Pequeño Demonio");
        homero.greeting();
        System.out.println(homero.getAge());
        Character bart = new Character();
        bart.setPhrase("Ayy caramba!!");
        bart.greeting();
    }
    
            
}