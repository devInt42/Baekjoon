package ex01;

import java.util.Scanner;
import java.util.Arrays;

//22년 08월 03일
//더존비즈온 3기 류정수
//백준 11650번
public class B11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt(); // 첫째 줄 점의 개수
        int[][] arr = new int[N][2]; // 행 x좌표 열 y좌표

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();        //배열에 좌표값 입력
            }//j end
        }// i end

        Arrays.sort(arr, (arr1, arr2) -> {  //람다식 이용
            if (arr1[0] == arr2[0]) {   //첫번째 입력값이 같을경우
                return arr1[1] - arr2[1];
            } else {
                return arr1[0] - arr2[0];
            }
        });

        for(int i=0; i<N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }

}

