package practicals;

import java.util.Arrays;


public class Practical3 {
    public static void main(String[] args) {

        String input = "8899880747";
        int[] digits = new int[10];

        if (input.length() == 10) {
            if (input.matches("[0-9]+")) {
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
            }
        }

        int[] s = bch10(digits);
        System.out.println(Arrays.toString(s));

        boolean error = false;
        for (int i : s) {if (i != 0) {error = true;}}

        if (error) {
            int p = mod(s[1] * s[1]) - (s[0] * s[2]);
            int q = mod(s[0] * s[3]) - (s[1] * s[2]);
            int r = mod(s[2] * s[2]) - (s[1] * s[3]);

            if (p + q + r == 0) {
                //One Error
                double i = s[1] / s[0];
                double a = s[0];

            } else {
                //Two Error
                System.out.println(stupidFuckingAlgorithm(p, q, r));
            }
        } else {
            //No errors
        }
    }

    public static int[] bch10(int[] d) {
        int s1 = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]) % 11;
        int s2 = (d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11;
        int s3 = (d[0] + 4 * d[1] + 9 * d[2] + 5 * d[3] + 3 * d[4] + 3 * d[5] + 5 * d[6] + 9 * d[7] + 4 * d[8] + d[9]) % 11;
        int s4 = (d[0] + 8 * d[1] + 5 * d[2] + 9 * d[3] + 4 * d[4] + 7 * d[5] + 2 * d[6] + 6 * d[7] + 3 * d[8] + 10 * d[9]) % 11;
        int[] out = {s1, s2, s3, s4};
        return out;
    }

    public static int stupidFuckingAlgorithm(int p, int q, int r) {

        //TODO. make this readable and add comments
        
        int a = mod((q * q) - (4 * p * r));
        
        int d = (int) Math.sqrt(a);

        int nom = mod(-q + d); //add flag for positive and negative.
        int dom = mod(2 * p);

        int p1 = nom;
        int p2 = blackMagic(dom);

        int p3 = p1 * p2;
        int p4 = p3 % 11;

        return (int) p4;
    }

    public static int mod(int num) {
        while (num < 0) {
            num += 11;
        }

        if (num > 11) {
            return mod(num % 11);
        }
        return num;
    }

    public static int blackMagic(int x) {
        int a = x;
        while (a % 11 != 1) {
            a = a + x;
        }
        return a / x;
    }
}
