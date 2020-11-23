package com.main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        Stack wStack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            wStack.push(ch);
        }
        System.out.println();
        System.out.print("Reverse String: ");
        while (!wStack.isEmpty()){
            char ch = (char) wStack.pop();
            System.out.print(ch);
        }
    }
}
