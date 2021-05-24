public class test {
    public static void main(String[] args) throws Exception {
        System.out.println(BLEP(1));
        System.out.println(BLEP(2));
        System.out.println(BLEP(3));
        System.out.println(BLEP(4));
        System.out.println(BLEP(5));
        System.out.println(BLEP(6));
        System.out.println(BLEP(7));
        System.out.println(BLEP(8));
        System.out.println(BLEP(9));
        System.out.println(BLEP(10));
        System.out.println(BLEP(11));
        System.out.println(BLEP(12));
        System.out.println(BLEP(13));
        System.out.println(BLEP(14));
        System.out.println(BLEP(15));
        System.out.println(BLEP(16));
        System.out.println(BLEP(17));
        System.out.println(BLEP(18));
        System.out.println(BLEP(19));
        System.out.println(BLEP(20));
    }

    private static int BLEP(int CON) {
        int out = 0;
        if (CON <= 1){ out = -5; }
        else if (CON >= 2 && CON <= 3){ out = -4; }
        else if (CON >= 4 && CON <= 5){ out = -3; }
        else if (CON >= 6 && CON <= 7){ out = -2; }
        else if (CON >= 8 && CON <= 9){ out = -1; }
        else if (CON >= 10 && CON <= 11){ out = 0; }
        else if (CON >= 12 && CON <= 13){ out = 1; }
        else if (CON >= 14 && CON <= 15){ out = 2; }
        else if (CON >= 16 && CON <= 17){ out = 3; }
        else if (CON >= 18 && CON <= 19){ out = 4; }
        else if (CON >= 20 && CON <= 21){ out = 5; }
        else if (CON >= 22 && CON <= 23){ out = 6; }
        else if (CON >= 24 && CON <= 25){ out = 7; }
        else if (CON >= 26 && CON <= 27){ out = 8; }
        else if (CON >= 28 && CON <= 29){ out = 9; }
        else if (CON >= 30){ out = 10; }
        return out;
    }
}
