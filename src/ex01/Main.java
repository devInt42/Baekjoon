package ex01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        int[][] square = new int[100][100];
        int cnt = 0;

        for(int i=0; i<N; i++){
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            for(int j=x1; j<=y1; j++){
                for(int k=x2; k<=y2; k++){
                    if(i>M-1){
                        square[j][k] += 1;
                    }
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(square[i][j] == 1) cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
