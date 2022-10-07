package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class B2596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        String[] arr = new String[num];
        int cnt = 1;
        ArrayList list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            arr[i] = str.substring(i + (i * 5), (i + 6) + (i * 5));    //6자리씩 끊어서 배열에 저장
        }

        char ch = 'X';
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "000000":
                case "100000":
                case "010000":
                case "001000":
                case "000100":
                case "000010":
                case "000001":
                    ch = 'A';
                    break;
                case "001111":
                case "101111":
                case "011111":
                case "000111":
                case "001011":
                case "001101":
                case "001110":
                    ch = 'B';
                    break;
                case "010011":
                case "110011":
                case "011011":
                case "010111":
                case "000011":
                case "010001":
                case "010010":

                    ch = 'C';
                    break;
                case "011100":
                case "111100":
                case "011110":
                case "011101":
                case "001100":
                case "010100":
                case "011000":
                    ch = 'D';
                    break;
                case "100110":
                case "110110":
                case "101110":
                case "100111":
                case "000110":
                case "100100":
                case "100010":

                    ch = 'E';
                    break;
                case "101001":
                case "111001":
                case "101101":
                case "101011":
                case "001001":
                case "100001":
                case "101000":
                    ch = 'F';
                    break;
                case "110101":
                case "111101":
                case "110111":
                case "010101":
                case "100101":
                case "110001":
                case "110100":
                    ch = 'G';
                    break;
                case "111010":
                case "111110":
                case "111011":
                case "011010":
                case "101010":
                case "110010":
                case "111000":
                    ch = 'H';
                    break;
                default:
                    ch = 'X';
                    break;
            }
            if (ch == 'X') {
                System.out.println(i + 1);
                break;
            } else {
                list.add(ch);
            }
        }// end for
        if (ch != 'X') {
            for (int k = 0; k < num; k++) {
                System.out.print(list.get(k));
            }
        }
    }
}