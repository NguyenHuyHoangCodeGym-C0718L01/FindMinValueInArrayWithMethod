package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        System.out.print("Input the size of array: ");
        int size = scanner.nextInt();
        array = inputSizeOfArray(size, array);

        System.out.println("Input the element");
        inputElement(array);

        System.out.println("Display the array");
        displayArray(array);

        System.out.println("Find Min Value in Array");
        System.out.println("Min value: "+array[minValue(array)]+" at: "+minValue(array));
    }

    public static int[] inputSizeOfArray(int size, int[] array){
        return array = new int[size];
    }

    public static void inputElement(int[] array){
        for(int i = 0; i < array.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input the element "+i+" : ");
            array[i] = scanner.nextInt();
        }
    }

    public static void displayArray(int[] array){
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
