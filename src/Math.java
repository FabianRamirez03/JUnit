import java.util.Random;

public class Math {

    static int addition(int a, int b){
        return a+b;
    }

    static String stringAddition(String a, String b){

        int result = Integer.parseInt(a)+Integer.parseInt(b);
        return Integer.toString(result);

    }


    static double division(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("divisor cannot be zero");
        }
        return a/b;
    }

    public static Random random = new Random();

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    public static int clamp(int num, int min, int max) {
        if (num > max) {
            return max;
        }
        if (num < min) {
            return min;
        } else {
            return num;
        }
    }

}