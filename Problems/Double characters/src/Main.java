import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();

        String newstring = "";
        for (int i = 0; i < chars.length; i++) {
            newstring = newstring + chars[i] + chars[i];
        }
        System.out.println(newstring);

    }
}