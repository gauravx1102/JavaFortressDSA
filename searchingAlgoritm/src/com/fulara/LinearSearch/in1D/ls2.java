package com.fulara.LinearSearch.in1D;

public class ls2 {
    public static void main(String[] args) {
        int[] a = { 12,3,4,65,87,98 };
        int target = 87;
        System.out.println(target+" is at index number "+linearSearch(a,target));
    }
    public static int linearSearch(int[] arr,int target){
        for (int i = 0;i<arr.length;i++){
        if (arr[i] == target){
            return i;
            }
        }
        return -1;
    }
}
