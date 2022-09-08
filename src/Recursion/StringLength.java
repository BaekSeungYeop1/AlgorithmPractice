package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(length(str));
        printChars(str);

    }
    private static int length(String str){
        if (str.equals("")){
            return 0;
        }
        else {
            return 1 + length(str.substring(1));
        }
    }
    private static void printChars(String str){
        if (str.length()==0){
            return;
        }
        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }
}
