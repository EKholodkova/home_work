public class Comparison {

    public static void main(String[] args) {
        posOrNeg(5);
        posOrNeg(0);
        posOrNeg(-10);
    }

    static void posOrNeg(int a) {
        if (a >= 0) {
            System.out.println(a + " - положительное число");
        } else {
            System.out.println(a + " - отрицательное число");
        }
    }
}
