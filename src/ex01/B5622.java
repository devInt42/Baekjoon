package ex01;

import java.util.ArrayList;
import java.util.*;

public class B5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        int cnt = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            switch (arr[i]) {
                case 'Z': case 'Y': case 'X':  case 'W':
                    sum += 1;
                case 'V': case 'U': case 'T':
                    sum += 1;
                case 'S': case 'R': case 'Q':  case 'P':
                    sum += 1;
                case 'M': case 'N': case 'O':
                    sum += 1;
                case 'J': case 'K': case 'L':
                    sum += 1;
                case 'G': case 'H': case 'I':
                    sum += 1;
                case 'D': case 'E': case 'F':
                    sum += 1;
                case 'A': case 'B': case 'C':
                    sum += 1;

                default : sum+=2;
            }
        }


        System.out.println(sum);
    }
}

