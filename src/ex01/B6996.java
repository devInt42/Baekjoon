package ex01;
import java.util.Arrays;
import java.util.Scanner;
public class B6996 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Anagrams(sc.next(), sc.next());
        }

    }

    static void Anagrams(String a, String b) {
        String res = "";
        char[] arr1 = new char[a.length()];
        char[] arr2 = new char[b.length()];
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = a.charAt(i);
                arr2[i] = b.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
               if(arr1[i]!=arr2[i]){
                   res = "NOT";
                   break;
               }
            }
        } else res = "NOT";
        System.out.println(a + " & " + b + " are " + res + " anagrams.");
    }
}
