package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        for (int i=0; i<array.length; i++) {
            System.out.println((i+1)+" element of the array is "+array[i]);
        }
        System.out.println("\r");
        reverse(array);
    }

    public static void reverse(int[] array) {
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i] = temp;
        }
        for (int i=0; i<array.length; i++) {
            System.out.println((i+1)+" element of the reversed array is "+array[i]);
        }
    }
}
