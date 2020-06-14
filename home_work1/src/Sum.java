public class Sum {

    public static void main(String[] args){

        System.out.println(sum(15, 6));
        System.out.println(sum(15, 3));
        System.out.println(sum(1, 6));
        System.out.println(sum(1, 9));
        System.out.println(sum(1, 19));
    }

    static boolean sum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
