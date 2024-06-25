package com.day2;

import java.util.Arrays;

public class Insertion_Sort
{
    public static void main(String[] args) {
        int arr[]={3,1,4,5,2};
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j] > key)
            {
              arr[j+1]=arr[j];
              j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
