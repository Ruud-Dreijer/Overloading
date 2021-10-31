package javatraining;

public class Main {
    public static void main(String[] args) {
        int getal = 5;
        System.out.println("Som = " + Som(getal, getal));
    }

    public static int Som(int getal1, int getal2) {
        System.out.println("int Som");
        return getal1 + getal2;
    }

    public static long Som(long getal1, long getal2) {
        System.out.println("long Som");
        return getal1 + getal2;
    }

    public static Integer Som(Integer getal1, Integer getal2) {
        System.out.println("Integer Som");
        return getal1 + getal2;
    }

    public static Object Som(Object getal1, Object getal2) {
        System.out.println("Object Som");
        return (Integer)getal1 + (Integer)getal2;
    }

    public static int Som(int... getallen) {
        System.out.println("int vararg Som");
        int som = 0;

        for (int getal : getallen) {
            som += getal;
        }

        return som;
    }

}
