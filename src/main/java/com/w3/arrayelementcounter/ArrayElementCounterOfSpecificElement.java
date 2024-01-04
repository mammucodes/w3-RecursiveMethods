package com.w3.arrayelementcounter;

public class ArrayElementCounterOfSpecificElement {
    public int ArrayElementCounter(int[] array, int target){
        int n = array.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(array[i]==target){
               count++;
            }
        }
        return count;
    }

    public int ArrayElementCounterRecursive(int[] array, int target){

        return arrayElementCounterRecursiveHelp(array, 0, target);
    }

    public int arrayElementCounterRecursiveHelp(int[] arr, int pos, int target) {

        int n = arr.length;
        if(pos == n) //base case

            return 0;
        int count =0;
        if(arr[pos] == target){
            count++;
        }
        count = count + arrayElementCounterRecursiveHelp(arr, pos+1, target);
        return count;
    }
}
