import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final double pi = Math.PI;
        double rad = scanner.nextDouble();

        System.out.println(pi * Math.pow(rad, 2));
    }
}