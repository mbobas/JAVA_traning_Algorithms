package com.company;

import java.util.Arrays;

class Solution
{
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

    public int solution(int[] A) {
        int[] A_plus = new int[100000];
        int plusCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                A_plus[plusCounter] = A[i];
                //System.out.println(A[i]);
                plusCounter++;
            }
        }
        Arrays.sort(A_plus);
        int n = A_plus.length;
        n=removeduplicates(A_plus, n);
        int wynik =1;
        for (int i = 0; i < n; i++)
        {
            System.out.print(A_plus[i] + " ");
            if(A_plus[i] == i) {
                wynik = i+1;
            }else {
                wynik =i;
                i=n;
            }
        }

        return wynik;
    }
}