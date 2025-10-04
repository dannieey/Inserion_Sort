package models;

public class PerformanceTracker {
    private long startTime;
    private long endTime;
    private long comparisons=0;
    private long swaps=0;
    private long arrayAccesses=0;

    /// ////////----time----///////////////////
    public  void startTimer(){
        startTime = System.nanoTime();
    }
    public void endTimer(){
        endTime = System.nanoTime();
    }
    public long getTime(){
        return endTime - startTime;
    }
    /// /////--comparison--///////////
    public void incrementComparisons(){
        comparisons++;
    }
    public long getComparisons(){
        return comparisons;
    }
    /// ///--Swaps--///////
    public void incrementSwaps(){
        swaps++;
    }
    public long getSwaps(){
        return swaps;
    }

    /// ////---access--////////////
    public void incrementArrayAccesses(){
        arrayAccesses++;
    }
    public void incrementArrayAccesses(int cnt){
        arrayAccesses += cnt;
    }
    public long getArrayAccesses(){
        return arrayAccesses;
    }
    /// ////----reset+output-----//////////////

    public void reset(){
        startTime = 0;
        endTime = 0;
        comparisons = 0;
        swaps = 0;
        arrayAccesses = 0;
    }

    public void printMetrics(){
        System.out.println("Executed Time(ns): "+getTime()+" ns");
        System.out.println("Comparisons: "+getComparisons());
        System.out.println("Swaps: "+getSwaps());
        System.out.println("ArrayAccesses: "+getArrayAccesses());
    }

}
