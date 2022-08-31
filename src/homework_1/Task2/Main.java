package homework_1.Task2;

import java.util.Arrays;

public class Main {
        public static int [] array = {5, 6, 3, 2, 5, 1, 4, 9};
        public static void main(String[] args) {
            bubbleSort(array);
            System.out.println("Отсортированный массив: " + Arrays.toString(array));
        }

        public  static int [] bubbleSort(int [] array){ //Test added
            assert array.length > 0;
            int [] perfectArray = Arrays.copyOf(array, array.length);
            Arrays.sort(perfectArray);
            for (int i = array.length-1; i >= 1 ; i--) {
                for (int j = 0; j < i; j++) {
                    if(array[j] > array[j+1]) changeElements(j, j+1);
                }
            }
            assert Arrays.equals(perfectArray, array);
            return array;
        }

        public static void changeElements(int firstElement, int secondElement){
            int elem = array[firstElement];
            array[firstElement] = array[secondElement];
            array[secondElement] = elem;
        }
    }
