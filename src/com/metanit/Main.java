package com.metanit;
/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, 
и числа меньшие 6 умножить на 2;*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Insert number of elements in array");
	int size = input.nextInt();
	int arr[] = new int [size];

	System.out.println("Insert array elements:");
	for (int i = 0; i < size; i++) {
        arr[i] = input.nextInt();
    }
    System.out.println("Initial array:");
    for (int i = 0; i < size; i++) {
        System.out.print(" " + arr[i]);
    }
    for (int i = 0; i < size; i++) {
        if (arr[i] < 6){
            arr[i] *= 2;
        }
    }
        System.out.println();
        System.out.println("Transformed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
