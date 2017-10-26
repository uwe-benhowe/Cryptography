package practicals;

import java.util.Arrays;


public class Practical3 {
    public static void main(String[] args) {
        
        //Input String
        String input = "3745195840";
        int[] digits = new int[10];
        
        //Validation checking
        if (input.length() == 10) {
            if (input.matches("[0-9]+")) {
                //Storeing input string in an array
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
            }
        }
        
        System.out.println("input: " + input);

        //Performing the BCH(10, 6) on the string
        int[] s = bch10(digits);
        String syndromes = s[0] + "" + s[1] + "" + s[2] + "" + s[3];
        System.out.println("Syndromes:" + syndromes);

        //Loop through array to check if any values are 0
        boolean error = false;
        for (int i : s) {if (i != 0) {error = true;}}

        //If there is an error...
        if (error) {      
            //Work out p, q and r
            int p = mod((s[1] * s[1]) - (s[0] * s[2]));
            int q = mod((s[0] * s[3]) - (s[1] * s[2]));
            int r = mod((s[2] * s[2]) - (s[1] * s[3]));

            //If p, q, r are all 0 then one error exists
            if (p == 0 && q == 0 && r == 0) {
                //One Error
                int errorPos = s[1] / s[0]; //Error position
                int magnitude = s[0]; //Magnitude
                
                digits[errorPos] = digits[errorPos] - magnitude;
                System.out.println("Single Error:" + Arrays.toString(digits));
                
            } else {
                //Two Errors
                //Positions
                int i = quadratic(p, q, r, "plus");
                int j = quadratic(p, q, r, "minus");
                
                //Magnitudes
                int b = modFraction((i * s[0] - s[1]) , (i - j));
                int a = mod(s[0] - b);
                
                //Replacing digits. (-1 as array starts from 0)
                digits[i - 1] = digits[i - 1] + (mod(-a));
                digits[j - 1] = digits[j - 1] + (mod(-b));
                
                System.out.println("Double Error: " + Arrays.toString(digits));
            }
        } else {
            //No errors, so just print out origonal message
            System.out.println("No Error");
        }
    }

    public static int[] bch10(int[] d) {
        //Calculating the syndromes
        int s1 = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]) % 11;
        int s2 = (d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11;
        int s3 = (d[0] + 4 * d[1] + 9 * d[2] + 5 * d[3] + 3 * d[4] + 3 * d[5] + 5 * d[6] + 9 * d[7] + 4 * d[8] + d[9]) % 11;
        int s4 = (d[0] + 8 * d[1] + 5 * d[2] + 9 * d[3] + 4 * d[4] + 7 * d[5] + 2 * d[6] + 6 * d[7] + 3 * d[8] + 10 * d[9]) % 11;
        int[] out = {s1, s2, s3, s4};
        return out;
    }

    public static int quadratic(int p, int q, int r, String flag) {
        int root = mod((q * q) - (4 * p * r));
        int rooty = (int) Math.sqrt(root);

        int numerator = 0;   
        switch(flag){
            case "plus":    numerator = mod(-q + rooty); break;
            case "minus":   numerator = mod(-q - rooty); break; 
        }
       
        int denominator = mod(2 * p);
        return modFraction(numerator, denominator);
    }
    
    
    public static int modFraction(int n, int d){  
        return mod(mod(n) * inverseMod(d));
    }

    public static int mod(int num) {
        while (num < 0) { num += 11; }

        if (num > 11) {
            return mod(num % 11);
        }
        return num;
    }

    public static int inverseMod(int x) {
        int q = x;
        while (q % 11 != 1) {
            q += x;
        }
        return q / x;
    }
}
