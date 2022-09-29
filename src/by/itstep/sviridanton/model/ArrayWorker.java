package by.itstep.sviridanton.model;

// операторы разрыва break, return, throw

public class ArrayWorker {
    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        int max = array[0];
        //    int max = Integer.MIN_VALUE;        // универсальный способ задать мин по int

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
