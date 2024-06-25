package com.day2;

import java.util.Arrays;

public class BubbleSort_Algorithm
{
    public static void main(String[] args) {
        int arr[]={3,1,4,5,2};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
