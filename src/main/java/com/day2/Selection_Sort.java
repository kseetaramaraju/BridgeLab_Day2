package com.day2;

import java.util.Arrays;

public class Selection_Sort
{
    public static void main(String[] args) {
        int arr[]={3,1,4,5,2};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i;j<arr.length;j++)
            {
              if(arr[j]<arr[min])
              {
                 min=j;
              }
            }
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
