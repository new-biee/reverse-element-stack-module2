package com.main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num = Integer.parseInt(scanner.nextLine());
        int[] myArray = new int[num];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Element " + i + ": ");
            myArray[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int a : myArray) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Reverse element in array: ");

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < myArray.length; i++) {
            stack.push(myArray[i]);
        }
        int[] reverseArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
