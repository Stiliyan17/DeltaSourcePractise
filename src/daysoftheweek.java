

import java.util.Scanner;

public class daysoftheweek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number is out of the 1-7 range.");
        }
    }
}