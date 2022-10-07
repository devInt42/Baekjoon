package ex01;

import java.util.Scanner;

public class B2028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            if(N == Math.pow(N,2)%Math.pow(10,(int)Math.log10(N)+1)){
                //Math.pow(N,2) : N^2값
                //Math.pow(10,(int)Math.log10(N)+1)) : N의 자릿수만큼 10의 제곱을 해주어 나눈수의 나머지를 구함
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}