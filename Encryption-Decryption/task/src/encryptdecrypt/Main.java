package encryptdecrypt;

import java.util.Scanner;

public class Main {

    public static int getPos (char letter, int off) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = alphabet.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == letter) {
                return i + off;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String string = scanner.nextLine();
        int offset = scanner.nextInt();



        int position = 0;
        String encDec = "";
        char[] c = string.toCharArray();



        if (type.equalsIgnoreCase("enc")) {
            for (int i = 0; i < c.length; i++) {

                encDec = encDec + (char) (c[i] + offset);

            }
        }else {
            for (int i = 0; i < c.length; i++) {

                encDec = encDec + (char) (c[i] + ( offset * -1) );

            }
        }


        System.out.println(encDec);




    }
}
