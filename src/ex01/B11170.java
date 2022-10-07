package ex01;

import java.util.Scanner;

public class B11170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt=0;
        int time=0;
        while (time<num) {
            cnt=0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            for (int i = N; i <= M; i++) {
                cnt += Zero(i);
            }
            System.out.println(cnt);
            time++;
        }
    }
    static int Zero(int num){
        int res=0;
        while(true){
            if(num%10==0){
                res++;
            }
            num=num/10;
            if(num<=0){
                break;
            }
        }
        return res;
    }
}

