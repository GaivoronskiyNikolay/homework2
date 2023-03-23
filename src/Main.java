public class Main {
    static double myCount = 1000.0;
    static double price = 14000.0;
    static double income = 2500.0;
    static double percentages = 5.0 / 12.0;
    static int month = 0;

    public static void main(String[] args) {

        while (myCount < price) {
            month++;
            myCount += myCount * percentages / 100;

            myCount += income;
        }
        System.out.println("Чтобы накопить на покупку потратили, " + month + " месяцев.");

        System.out.println("На счету имеется " + myCount + " монет.");
    }
}