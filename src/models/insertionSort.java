package models;

public class insertionSort {
    public static void sort(int[] arr, PerformanceTracker tracker){
        int n = arr.length;
        tracker.startTimer();

        for(int i=1; i<n; i++){
            int temp = arr[i];
            tracker.incrementArrayAccesses();

            tracker.incrementComparisons();
            if(arr[i-1]<=temp){
                continue;
            }

            int pos=binarySearch(arr, temp, 0, i-1, tracker);

            int j = i-1;
            while(j>=pos){
                arr[j+1] = arr[j];
                tracker.incrementArrayAccesses();
                tracker.incrementSwaps();

                j--;
            }

            arr[j+1]=temp;
            tracker.incrementArrayAccesses();
        }
        tracker.endTimer();

    }

    private static int binarySearch(int[] arr, int temp, int left, int right, PerformanceTracker tracker){
        while(left <= right){
            int mid = (left + right)/2;
            tracker.incrementArrayAccesses();


            tracker.incrementComparisons();
            if(arr[mid]==temp){
                return mid+1;
            }
            tracker.incrementComparisons();
            if(arr[mid]<temp){
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        return left;
    }

}
