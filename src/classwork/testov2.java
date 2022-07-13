package classwork;

public class testov2 {
    public static int makeSomething(int i, int j) {
        return i + j;
    }


    public static String makeSomething(String name) {
        return "Hello" + name;
    }

    public static double makeSomething() {
        return 3.14;
    }

    public static void main(String[] args) {
        System.out.println("" + makeSomething());
    }
}

