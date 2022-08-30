package homework_1.Task2;

import java.util.Arrays;

public class Main {
        public static int [] array = {5, 6, 3, 2, 5, 1, 4, 9};
        public static void main(String[] args) {
            bubbleSort(array);
            System.out.println("Отсортированный массив: " + Arrays.toString(array));
        }

        public  static int [] bubbleSort(int [] array){
            for (int i = array.length-1; i >= 1 ; i--) {
                for (int j = 0; j < i; j++) {
                    if(array[j] > array[j+1]) changeElements(j, j+1);
                }
            }
            return array;
        }

        public static void changeElements(int firstElement, int secondElement){
            int elem = array[firstElement];
            array[firstElement] = array[secondElement];
            array[secondElement] = elem;
        }
    }
