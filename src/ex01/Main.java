package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num - 1];
        int dasom = sc.nextInt();   //다솜이값
        if (num == 1) {
            System.out.println("0");
            System.exit(0);
        }
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) { // 값 저장
            arr[i] = sc.nextInt();
        }

        while (true) {
            Arrays.sort(arr);   //오름차순 정렬
            max = arr[num - 2];   //max값 저장

            if (dasom > max) {
                System.out.println(cnt);
                break;
            }
            dasom++;
            arr[num - 2]--;
            cnt++;

        } // end while
    }
}