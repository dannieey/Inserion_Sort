package models;

import java.util.Arrays;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int [] sizes ={100, 1000, 10000};
        Random random = new Random();

        for(int n:sizes){
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = random.nextInt(10000);
            }
            PerformanceTracker tracker = new PerformanceTracker();
            int[] testArr = Arrays.copyOf(arr, arr.length);
            System.out.println("\n---Benchmark for n=" + n+"===");
            insertionSort.sort(testArr, tracker);
            tracker.printMetrics();
        }
    }

}
