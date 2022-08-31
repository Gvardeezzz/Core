package homework_1.Task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int [][]array = new int[10][10];
        LehmerRnd randomizer = new LehmerRnd(LocalDateTime.now().getNano());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (randomizer.makeRandom() * 100);
            }
        }

        System.out.println("Минимальный элемент в массиве: " + findMin(array));
        System.out.println("Максимальный элемент в массиве: " + findMax(array));
        System.out.println("Среднее арифметическое элементов массива: " + findMedium(array));
    }

    public static int findMax(int [][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) max = array [i][j];
            }
        }
        return max;
    }

    public static int findMin(int [][] array){
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) min = array [i][j];
            }
        }
        return min;
    }

    public static double findMedium(int [][] array){
        int count = 0;
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
                sum += array[i][j];
            }
        }
        return sum / count;
    }
    public static class LehmerRnd {
        private final int a = 48271;
        private final int m = Integer.MAX_VALUE;
        private  final int q = 127773;
        private final int r = 2836;
        private int seed;

        public LehmerRnd(int seed) {
            this.seed = seed;
        }

        public double makeRandom() {
            int hi = seed / q;
            int lo = seed % q;

            seed = (a * lo) - (r * hi);
            if (seed <= 0) seed = seed + m;
            double x = seed * 1.0 / m;
            return x;
        }
    }
}
