package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Month(st.nextToken());
        int date = Integer.parseInt(st.nextToken().replaceAll("[^0-9]", ""));
        int year = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(st.nextToken(), ":");
        int hour = Integer.parseInt(String.valueOf(st2.nextToken()));
        int minute = Integer.parseInt(String.valueOf(st2.nextToken()));
        int tot = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 366 : 365;

        double res = tot * 24 * 60;
        double now = (Progress(month, tot) + date-1) * 1440 + hour * 60 + minute;
        System.out.println((now/res) * 100);
    }

    static int Progress(int month, int tot) {
        int res = 0;
        switch (month) {
            case 12: {
                res += 30;
            }
            case 11: {
                res += 31;
            }
            case 10: {
                res += 30;
            }
            case 9: {
                res += 31;
            }
            case 8: {
                res += 31;
            }
            case 7: {
                res += 30;
            }
            case 6: {
                res += 31;
            }
            case 5: {
                res += 30;
            }
            case 4: {
                res += 31;
            }
            case 3: {
                res += 28;
                if (tot == 366) {
                    res++;
                }
            }
            case 2: {
                res += 31;
                break;
            }
        }
        return res;
    }

    static int Month(String mon) {
        int month = 0;
        switch (mon) {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
        }
        return month;
    }

}
