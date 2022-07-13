package homework;
import java.util.Scanner;
public class project11 {



    public class Numbers {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int number = scan.nextInt();

            if (number > 0 && number <= 100) {

                System.out.println("Your number is: " + number);



            } else {

                System.out.println("Invalid Number!");

            }

        }

    }

    public static class project9 {
        public static void main(String[] args) {
            int[] arr = new int[]{14, 23, 45, 67, 66, 78, 31, 43, 68, 40};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[1] / 10;
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] > max)
                        max = arr[k];

                    System.out.println("The sum of all elements is : " + sum);

                }
            }
        }
    }
}
