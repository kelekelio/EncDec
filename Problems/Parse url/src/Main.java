class Main {

    public static void main(String[] args) {


        char a = 0b01100001;
        char b = 0b01100010 + 1;
        char c = (char) (b + 1);
        char d = 'd';
        char e = (char) (d + 1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        for (int i = 0; i < 200; i++) {
            System.out.println((char) (a + i));
        }

    }


}