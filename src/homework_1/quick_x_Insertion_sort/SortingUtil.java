package homework_1.quick_x_Insertion_sort;

import java.util.Collections;
import java.util.List;

class SortingUtil {

    private SortingUtil() {
    }

    //Quick Sorting Movies List by ratings
    static void quickSort(List<Movie> movies){
        int[] array = new int[movies.size()];

        for (int i = 0; i < movies.size() - 1; i++) {
            array[i] = (int) (movies.get(i).getRating() * 10);
        }

        quickSort(array,0,array.length - 1, movies);

    }

    //Quick Sorting Movies List by ratings with rating Array, from and to
    private static void quickSort(int[] arr, int from, int to, List<Movie> movies) {


        if (from < to) {

            int divideIndex = partition(arr, from, to, movies);

            quickSort(arr, from, divideIndex - 1, movies);

            quickSort(arr, divideIndex, to, movies);
        }
    }

    //Method partition for quickSort(int[] arr, int from, int to, List<Movie> movies)
    private static int partition(int[] arr, int from, int to, List<Movie> movies) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                Collections.swap(movies, rightIndex,leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    //Just Quick Sorting int[] array (started int from to int to)
    private static void quickSort(int[] arr, int from, int to) {


        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    //Method partition for quickSort(int[] arr, int from, int to)
    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    //Method swap for quickSort Methods
    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    //Insertion Sorting Movies List by ratings
    static void insertionSort(List<Movie> movies){
        int[] array = new int[movies.size()];

        for (int i = 0; i < movies.size() - 1; i++) {
            array[i] = (int) (movies.get(i).getRating() * 10);
        }
        insertionSort(array,movies);
    }

    //Insertion Sorting Movies List by ratings with rating Array
    private static void insertionSort(int[] array, List<Movie> movies) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                Collections.swap(movies, j, j-1);
                j--;
            }
            array[j] = current;
        }
    }

    //Just Insertion Sorting Array
    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }




}
