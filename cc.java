package com.company;
import java.util.*;
public class cc {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum;
        int max = 0;
        int[] A = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();

        }
        for (int i = 0; i < N; i++) {
            sum = A[i] + A[i + 1] + A[i + 2] + A[i + 3];
            for (int j = 0; j < N; j++) {
                C[j] = sum;
            }
                for (int k = 0; k < N; k++) {
                    if (C[k] > max) {
                        max = sum;
                    }
                }
            }
        }
    }

