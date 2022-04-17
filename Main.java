package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
   int count=0;
    int[] arr=new int[N];
    for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
          if((arr[i]+arr[j])%2!=0){
             count++;
          }
        }
    }
   if(count==M){
       System.out.println("Yes");
   }
    else{
       System.out.println("No");
   }
    }
}
