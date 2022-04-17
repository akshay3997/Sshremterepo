package com.company;
import java.util.*;
public class rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Students");
        int N = sc.nextInt();
        int temp;
        System.out.println("Enter Students Marks");
        int[] arr = new int[N];
//        int[] newarr = new int[N];
//        for (int i = 1; i <= N; i++) {
//            newarr[i] = i;
//        }
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    }
            }
        }
//        for (int k= 1; k <= N; k++) {
//            newarr[k] = arr[k];
//            System.out.println(newarr[k]);
        for (int i = 0; i < N; i++) {

        System.out.println(arr[i]);
    }
    }
}
