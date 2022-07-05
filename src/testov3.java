import java.text.DecimalFormat;
import java.util.Scanner;

public class testov3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = USD * 1.64549 ;

        System.out.println(df.format(BGN) + " BGN");
    }
}



