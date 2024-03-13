public class second {
    public static void main(String[] args) {

        int a = 657;

        int b = a%10;
        a /= 10;

        int c = a %10;
        a /= 10;

        int d = a;

        int f = Math.max(d,  Math.max(c, b));
        System.out.println("Найбільша цифра" + f);


    }
}
