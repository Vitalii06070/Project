package com.suprun.vitaliy;
import java.util.*;

public class Main {
    public static void main(String[] args) {

 //random number array

        Integer[] arr = new Integer[10];
        System.out.println("An array:");
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 100);
           System.out.print(arr[i] + "  ");
        }
        System.out.println();

 //sorting
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array:");
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}