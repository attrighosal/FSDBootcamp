package Sorting;

import java.util.Arrays;

public class StringInsertionSort {

    public static String[] stringInsertionSort(String[] array) {
        for (int i=1; i<array.length; i++) {

            // int <  string .compareTo() < 0
            if (array[i].toLowerCase().compareTo(array[i-1].toLowerCase())<0) {

                String currentElement = array[i];

                // 1. Find the right place for array[i]
                int rightPosition = i-1;
                while(rightPosition>0 && array[rightPosition-1].toLowerCase().compareTo(currentElement.toLowerCase())>0) {
                    rightPosition--;
                }

                // 2. Right shift all the elements from the right position
                for (int j=i-1; j>=rightPosition; j--) {
                    array[j+1] = array[j];
                }

                // 3. Add the array[i] to the right position
                array[rightPosition] = currentElement;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = new String[] {"Tom", "John", "Clara", "Sam", "Shaun"};
        array = stringInsertionSort(array);
        System.out.println("Insertion Sorted String Array : "+ Arrays.toString(array));
    }
}
