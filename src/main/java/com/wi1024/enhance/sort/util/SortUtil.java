package com.wi1024.enhance.sort.util;

import java.util.Scanner;

public class SortUtil {


    public static int[] loadConsoleIntArray(){
        System.out.println("Please enter the array number :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        return arr;
    }

    public static void printArray(int[] array){
        StringBuilder stringBuilder = new StringBuilder("");
        for(int vl : array){
            stringBuilder.append(vl + " ");
        }
        System.out.println("result : " + stringBuilder.toString());
    }

}
