public class third {
    public static void main(String[] args) {
        int floor = 1;
        int ourfloor = 6;

        if (ourfloor > floor && ourfloor <= 9) {
            if (ourfloor == 2) {
                System.out.println("Піднімаємось на 3-й поверх.");
                ourfloor = 3;
            }
            System.out.println("Ви піднялись на " + (ourfloor - floor) + " поверх.");
        } else if (ourfloor < floor && ourfloor >= 1) {
            if (ourfloor == 2) {
                System.out.println("Спускаємось на 1-й поверх.");
                ourfloor = 1;
            }
            System.out.println("Ви спустились на " + (floor - ourfloor) + " поверх.");
        } else {
            System.out.println("Такого поверху немає.");
        }
    }
}
