package com.company;

import java.util.*;

public class Main {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] x = getIntegers(5);
//        float[] y = {0.44f, 0.12f, 0.99f, 0.18f, 0.32f};
//        printArray(x);
//        selectionSort(x);
//        bubbleSort(x);
        insertionSort(x);
//        shellSort(x);
//        mergeSort(x);
//        quickSort(x, 0, 4);
//        heapSort(x);
//        countSort(x);
//        radixSort(x);
//        bucketSort(y);
//        for (int i = 0; i < y.length; i++){
//            System.out.println(y[i]);
//        }
        printArray(x);
    }

    // function to print array
    public static void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    //function to create an array by getting input from the user
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " values: ");
        int[] array = new int[number];
        for (int i = 0; i<number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //function to swap two elements in ayyay.... for quick implementation
    private static void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    //selection sort
    public static void selectionSort(int[] array){
        for(int i = 0; i<array.length-1; i++){
            int iMin = i;
            for (int j = i+1; j<array.length; j++){
                if (array[j] < array[iMin]){
                    iMin = j;
                }
                swap(array, i, iMin);
//                int temp = array[i];
//                array[i] = array[iMin];
//                array[iMin] = temp;
            }
        }
    }

    //bubble sort
    public static void bubbleSort(int[] array){
        for (int i = 0; i<array.length-1; i++){
            boolean flag = false;
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    flag = true;
                    swap(array, j, j+1);
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
                }
                if (!flag){
                    System.out.println("no swaps done");
                    return;
                }
            }
        }
    }

    //insertion sort
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int value = array[i];
            int position = i;
            while (position > 0 && array[position-1] > value){
                array[position] = array[position-1];
                position -= 1;
            }
            array[position] = value;
        }
    }

    //shell short...
    public static void shellSort(int[] array){
        int n = array.length;
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i++){
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap){
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    // merge function of merge sort to perform merging of sorted sub arrays
    public static void merge(int[] left, int[] right, int[] array){
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        //comparing the elements if both the indices are valid i.e in lift and right sub lists.
        while (i < leftLength && j  < rightLength){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i += 1;
            }
            else {
                array[k] = right[j];
                j += 1;
            }
            k += 1;
        }
        while (i < leftLength){
            array[k] = left[i];
            i += 1;
            k += 1;
        }
        while(j < rightLength){
            array[k] = right[j];
            j += 1;
            k += 1;
        }
    }
    // merge sort...
    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
        merge(left,right,array);
    }


    // partition function to implement quick sort
    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int partitionIndex = start;
        for (int i = start; i< end; i++){
            if (array[i] <= pivot){
                swap(array, i, partitionIndex);
//                int temp = array[i];
//                array[i] = array[partitionIndex];
//                array[partitionIndex] = temp;
                partitionIndex ++;
            }
        }
        int temp = array[partitionIndex];
        array[partitionIndex] = array[end];
        array[end] = temp;
        return partitionIndex;
    }

    //random function not working unfortunately::
//    public static int randomizePartition(int[] array, int start, int end){
////        int pivot = array[end];
//        int pivot = random.nextInt(end - start) + start;
//        int partitionIndex = start;
//        for (int i = start; i< end; i++){
//            if (array[i] <= pivot){
//                int temp = array[i];
//                array[i] = array[partitionIndex];
//                array[partitionIndex] = temp;
//                partitionIndex ++;
//            }
//        }
//        int temp = array[partitionIndex];
//        array[partitionIndex] = array[end];
//        array[end] = temp;
//        return partitionIndex;
//    }

    //quick sort...
    public static void quickSort(int[] array, int start, int end){
        if (start < end){
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }

    // heapify function to create heap in heap sort
    public static void heapify(int[] array, int n, int i){
        int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if (l < n && array[l] > array[largest]){
            largest = l;
        }
        if (r < n && array[r] > array[largest]){
            largest = r;
        }
        if (largest != i){
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }
    //heap sort...
    public static void heapSort(int[] array){
        int n = array.length;
        for (int i = n/2 - 1; i > 0; i--){
            heapify(array, n, i);
        }
        for (int i = n-1; i > 0; i--){
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    //counting sort...
    public static void countSort(int[] array){
        int size = array.length;
        int[] output = new int[size + 1];

        int max = array[0];
        for (int i = 1; i < size - 1; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; i++){
            count[i] = 0;
        }

        for(int i = 0; i < size; i++){
            count[array[i]]++;
        }

        for (int i = 1; i <= max; i++){
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--){
            output[--count[array[i]]] = array[i];
        }

        for(int i = 0; i < size; i++){
            array[i] = output[i];
        }
    }

    //radix sort
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static void countingSort(int[] array, int place){
        int size = array.length;
        int max = getMax(array); //array[0];
//        for (int i = 1; i < size; i++){
//            if (array[i] > max){
//                max = array[i];
//            }
//        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; i++){
            count[i] = 0;
        }
        for (int i = 0; i < size; i++){
            count[(array[i] / place) % 10]++;
        }
        for (int i = 1; i <= max; i++){
            count[i] += count[i - 1];
        }

        int[] output = new int[size + 1];
        for(int i = size - 1; i >= 0; i--){
            output[--count[(array[i] / place) % 10]] = array[i];
        }

        for (int i = 0; i < size; i++){
            array[i] = output[i];
        }
    }

    public static void radixSort(int[] array){
        int max = getMax(array);
        for (int place = 1; max / place > 0; place *= 10){
            countingSort(array, place);
        }
    }


    // bucket sort..
    // using collection framework to sort sort each bucket.. i.e worst case complexity will be O(n^2)
    // we can apply this by using radix sort for sorting contents of each bucket.

    public static void bucketSort(float[] array){
        int n = array.length;
        if (n <= 0){
            return;
        }
        ArrayList<Float>[] bucket = new ArrayList[n];

        //creating empty bucket...
        for (int i = 0; i < n; i++){
            bucket[i] = new ArrayList<>();
        }

        //adding elements to the bucket...
        for (int i = 0; i < n; i++){
            int bucketIndex = (int)array[i] * n;
            bucket[bucketIndex].add(array[i]);
        }

        //sorting elements of each bucket
        for(int i = 0; i < n; i++){
            Collections.sort(bucket[i]);
        }

        //inserting sorted elements in initial array
        int index = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0, size = bucket[i].size(); j < size; j++){
                array[index++] = bucket[i].get(j);
            }
        }
    }

//    //bucket sort.... my solution
//    Not working properly...!!!!!!!!!!!!!!!
//
//    public static void countingBucketSort(int[] array, int place){
//        int n = array.length;
//        int max = getMax(array);
//        int[] bucket = new int[10];
//        for (int i = 0; i < 10; i++){
//            bucket[i] = 0;
//        }
//        for(int i = 0; i < 10; i++){
//            bucket[(array[i] / place) % 10] = array[i];
//        }
//        for (int i = 0; i < n; i++){
//            array[i] = bucket[i];
//        }
//    }
//    public static void bucketSortN(int[] array){
//        int max = getMax(array);
//        for (int place = 1; max / place > 0; place *= 10){
//            countingBucketSort(array, place);
//        }
//    }
}
