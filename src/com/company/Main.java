//*
//This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
//        Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
package com.company;

public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();
        int [] A = {-3,-1,-2,1,2,3, 4, 5, 8};
        System.out.println("Wynik: " + sol.solution(A));

        NameTwoString name1 = new NameTwoString();
        System.out.println(name1.abbrevName("michal gulczynski"));
    }
    }


