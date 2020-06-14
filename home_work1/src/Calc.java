public class Calc {

    public static void main(String[] args) {

        System.out.println(calculation(10,18,5,9));

    }

    static double calculation(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
}
