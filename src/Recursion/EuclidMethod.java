package Recursion;

public class EuclidMethod {
    public static void main(String args[]){

        System.out.println(gcd(10,6));
    }

    private static int gcd(int a, int b) {
        if (b==0){
            return a;
        }
        else {
            return gcd(a, a%b);
        }
    }
}
