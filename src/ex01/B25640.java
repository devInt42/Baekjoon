package ex01;

import java.util.Scanner;

public class B25640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        int cnt=0;
        String mbti;
        for(int i=0;i<num;i++){
            mbti = sc.next();
            if(str.equals(mbti)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
