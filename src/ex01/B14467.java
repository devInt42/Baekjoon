package ex01;
import java.util.Scanner;
public class B14467 {
    static int cnt;
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int[][] arr = new int[N][2];    //소 위치

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        for (int i = 0; i < N; i++) {   //입력값 받고 배열에 넣기
            for (int j = 0; j <= 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= 10; i++) {
            cnt += Test(i);
        }
        System.out.println(cnt);
    }

    public static int Test(int cowNo) {
        int res = 0;
        int start = 0;
        int tmp = 3;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] == cowNo) {
                start = i;
                tmp = arr[i][1];
                break;
            }
        }

        for (int i = start + 1; i < N; i++) {
            if (arr[i][0] == cowNo) {
                if (arr[i][1] != tmp) {
                    res++;
                    tmp = arr[i][1];
                }
            }
        }

        return res;
    }
}


