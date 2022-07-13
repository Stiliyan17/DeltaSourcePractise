package classwork;

import java.util.Scanner;

public class ternaryOperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        String result = (number>20) ? (number<30)? "Bob" : "Paul": "Michael";
        System.out.println(result);

    }
}
