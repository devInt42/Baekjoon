package ex01;
import java.io.IOException;
import java.util.Scanner;

public class B1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = new char[str.length()];
        int[] arr = new int[str.length()];
        int cnt = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            ch[i] = str.charAt(i);
            arr[i] = ch[i] - '0';
        }

        while (cnt < str.length()) {
            int res1 = 1;   //초기화
            int res2 = 1;   //초기화
            if (arr.length == 1 && arr[0] == 1) {   //res1,2가 1로 초기화 되어있기때문에 숫자 1일경우 유진수조건에 맞기때문에 false 조건 설정
                flag = false;
                break;
            } else {
                for (int i = 0; i <= cnt; i++) {
                    res1 *= (arr[i]);

                }
                for (int j = cnt + 1; j < arr.length; j++) {
                    res2 *= (arr[j]);
                }

                if (res1 == res2) { //유진수일경우
                    flag = true;
                    break;
                }
                cnt++;
            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}