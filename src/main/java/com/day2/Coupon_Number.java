package com.day2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Coupon_Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter How Many Digits Of Distinct Coupon Number Should be Generated ");
        int num=sc.nextInt();

        Create_Distinct_CouponNumber(num);

    }

    private static void Create_Distinct_CouponNumber(int num)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        String coupon="";
        Random r=new Random();
        int count=0;
        while(hs.size()<num)
        {
            count++;
            int n=r.nextInt(10);
            if(!hs.contains(n))
            {
              hs.add(n);
              coupon=coupon+n;
            }
        }

        System.out.println(" Random Numbers needed to Create Distinct Coupon Number "+count);
        System.out.println(" the Distinct Coupon Number is "+coupon);

    }
}
