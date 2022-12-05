package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N + 2][N + 2];
        char[][] resArr = new char[N + 2][N + 2];

        for (int i = 1; i < N + 1; i++) {
            String str = br.readLine();
            for (int j = 1; j < N + 1; j++) {
                if (j < N + 1) {
                    arr[i][j] = str.charAt(j - 1);
                }
                if (arr[i][j] != '.') {
                    resArr[i][j] = '*';
                } else {
                    resArr[i][j] = '0';
                }
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (arr[i][j] != '.') {
                    for (int a = i - 1; a < i + 2; a++) {
                        for (int b = j - 1; b < j + 2; b++) {
                            if (a == i && b == j) {
                                continue;
                            }

                            if (resArr[a][b] == '*') {
                                continue;
                            }

                            resArr[a][b] += arr[i][j] - '0';
                            if (resArr[a][b] > '9') {
                                resArr[a][b] = 'M';

                            }
                        }
                    }
                }

            }
        }


        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(resArr[i][j]);
            }
            System.out.println();
        }
    }
}
