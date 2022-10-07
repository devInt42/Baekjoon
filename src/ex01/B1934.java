package ex01;

import java.util.Scanner;

public class B1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int res = 1;
            if(A==1 || B==1){
                res = 1;
            }
            else{
                for (int j = 2; j <= Math.min(A, B); j++) {
                    if (A % j == 0 && B % j == 0) {
                        res *= j;
                        A /= j;
                        B /= j;
                        j--;
                    }
                }
            }
            System.out.println(res*A*B);

        }
    }
}

