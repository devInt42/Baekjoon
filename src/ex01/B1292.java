package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class B1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[B];
        int cnt=0;
        int sum=0;
        int tot=1;
        while(tot<=B){

            for(int i=1;i<=tot ;i++){
                arr[cnt] = tot;
                cnt++;
            }
            tot++;
        }


        for(int i=A-1;i<B;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
