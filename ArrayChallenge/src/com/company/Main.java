package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        System.out.println("after after sorting in descending order :");
        printArray(sortIntegers(myInteger));
    }
    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + " integer value.\r");
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){
        //to copy one array to another
        //int[] sortedArray = Arrays.copyOf(array, array.length);
        //my solution
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // lecture solution
//        boolean flag = true;
//        while (flag) {
//            flag = false;
//            for (int i=0; i<sortedArray.length-1; i++){
//                if (sortedArray[i] < sortedArray[i+1]){
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
