import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int pos = -1;

        for (int i = 0; i < chars.length-2; i++) {
            if (Character.toLowerCase(chars[i]) == 't' && Character.toLowerCase(chars[i+1]) == 'h' && Character.toLowerCase(chars[i+2]) == 'e') {
                pos = i;
                break;
            }
        }

            System.out.println(pos);

    }
}