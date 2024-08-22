//Elynor Sykes

import java.util.Random;

public class SmallestLargest{
    

    public static void main(String[] args){
        int[] coke = new int[10];
        Random rand = new Random();
        for(int i=0; i<10;i++){
            coke[i] = rand.nextInt(101)+1;
        }

        System.out.println("smallest value = " + smallestValue(coke));
        System.out.println("highest value = " + largestValue(coke));
    }
    public static int smallestValue(int[] coke){
        int smallestValue = coke[0];
        for(int i=0; i<10; i++){
            if(coke[i]<smallestValue){
                smallestValue=coke[i];
            }
        }
        return smallestValue;
    }
    public static int largestValue(int[] coke){
        int highestValue = coke[0];
        for(int i=0; i<10; i++){
            if(coke[i]>highestValue){
                highestValue=coke[i];
            }
        }
        return highestValue;
    }
}