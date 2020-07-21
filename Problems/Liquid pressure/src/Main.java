import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final double grav = 9.8;
        double den = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println(den * height * grav);
    }
}
