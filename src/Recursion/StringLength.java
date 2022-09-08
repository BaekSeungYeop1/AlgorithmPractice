package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(length(str));

    }
    private static int length(String str){
        if (str.equals("")){
            return 0;
        }
        else {
            return 1 + length(str.substring(1));
        }
    }
}
