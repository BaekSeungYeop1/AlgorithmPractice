package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printBinary {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        printInBinary(a);
    }

    private static void printInBinary(int a) {
        if (a<2){
            System.out.print(a);
        }
        else {
            printInBinary(a/2);
            System.out.print(a%2);
        }
    }
}
