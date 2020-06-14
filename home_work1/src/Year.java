public class Year {

    public static void main(String[] args) {

        leap_year(1904);
        leap_year(100);
        leap_year(800);
        leap_year(5);
        leap_year(2020);


    }

    static void leap_year(int y) {
//        if (y % 400 == 0) {
//            System.out.println(y + " - високосный год");
//            return;
//        }
//        if(y % 100 != 0 && y % 4 == 0) {
//                System.out.println(y + " - високосный год");
//            } else {
//                System.out.println(y + " - не високосный год");
//            }

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println(y + " - високосный год");
        } else {
            System.out.println(y + " - не високосный год");
        }
    }

}
