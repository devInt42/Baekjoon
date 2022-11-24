package ex01;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    static int AnswerN;
    static int N = 10;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   //테스트 케이스

        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            AnswerN = 0;

            int[] arr = new int[N];
            int[] tSum = new int[N];
            int max = -10001;
            int min = 10001;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if(N==1){
                AnswerN = arr[0];
                System.out.println("#" + test_case + " " + AnswerN);
                continue;
            }
            Arrays.sort(arr);
            min = arr[0];
            max = arr[N - 1];
            if (min > 0) {
                for (int i = 0; i < arr.length; i++) {
                    AnswerN += arr[i];
                }
                AnswerN *= N;
                System.out.println("#" + test_case + " " + AnswerN);
                continue;
            }
            if (max < 0) {
                for (int i = 0; i < arr.length; i++) {
                    AnswerN += arr[i];
                }
                AnswerN *= N * (-1);
                System.out.println("#" + test_case + " " + AnswerN);
                continue;
            }
            if (max == 0 && min == 0) {
                AnswerN = 0;
                System.out.println("#" + test_case + " " + AnswerN);
                continue;
            }

            int a = sum - arr[N - 1];
            int b = sum - arr[0];
            int c1 = sum - arr[N - 1];
            int c2 = sum - arr[1];
            int d1 = sum - arr[0];
            int d2 = sum - arr[N - 2];

            if (c1 < 0) {
                c1 *= -1;
            }
            if (c2 < 0) {
                c2 *= -1;
            }
            if (d1 < 0) {
                d1 *= -1;
            }
            if (d2 < 0) {
                d2 *= -1;
            }


            tSum[0] = Math.max(c1,c2);
            tSum[N - 1] = Math.max(d1,d2);
            if (tSum[0] < 0) {
                tSum[0] *= -1;
            }
            if (tSum[N - 1] < 0) {
                tSum[N - 1] *= -1;
            }
            if (a < 0) {
                a *= -1;
            }
            if (b < 0) {
                b *= -1;
            }
            for (int i = 1; i < arr.length - 1; i++) {
                tSum[i] = Math.max(a, b);
                if (tSum[i] < 0) {
                    tSum[i] *= -1;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                AnswerN += tSum[i];
            }


            System.out.println("#" + test_case + " " + AnswerN);
        }
    }
}