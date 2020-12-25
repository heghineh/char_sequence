package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your text: ");
        MyString text = new MyString(scanner.nextLine());

        System.out.println("Reversed text: " + text.reverseTheString());
        System.out.println("Length of text: "+ text.length());
        System.out.println("Char at 0: " + text.charAt(0));
        System.out.println("Check if text is empty: " + text.isEmpty());
    }
}