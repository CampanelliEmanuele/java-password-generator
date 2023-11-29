package org.lessons.java.security;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in
        // giorno, mese e anno (in numero).
        // Generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno,
        // mese e anno di nascita, separate dal carattere

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = userInput.nextLine();

        System.out.println("Enter your surname: ");
        String surname = userInput.nextLine();

        System.out.println("Enter your favourite color: ");
        String color = userInput.nextLine();

        System.out.println("Enter your day of birth: ");
        byte birthDay = userInput.nextByte();

        System.out.println("Enter your month of birth: ");
        byte monthDay = userInput.nextByte();

        System.out.println("Enter your year of birth: ");
        short yearDay = userInput.nextShort();

        String password = createPass(name, surname, color, birthDay, monthDay, yearDay);

        System.out.println("Your password is: " + password);

    }

    public static String createPass(String name, String surname, String color, byte birthDay, byte monthDay, short yearDay) {
        String pass = name + '-' + surname + '-' + color + '-' + (birthDay + monthDay + yearDay);
        return pass;
    }
}