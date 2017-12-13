package practicals.RainbowTable;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

public class Reduction {

    String alphabet;
    int maxLength;
    BigInteger passwordSpace;
    BigInteger prime;
    int chainLength;

    Reduction() {}

    public Reduction(String alphabet, int maxLength, int chainLength) {
        this.alphabet = alphabet;
        this.maxLength = maxLength;
        this.chainLength = chainLength;
        this.passwordSpace = TableGenerator.passwordSpace(this.alphabet.length(), this.maxLength);
        this.prime = passwordSpace.nextProbablePrime();
    }

    public String reduce(String hashed, int pos) {
        BigInteger n = processHash(hashed);
        
        n = n.shiftLeft(pos + 1);
        
        n = n.mod(prime);
        return intToString(n.intValue(), alphabet);
    }

    public String chainReduce(String hash, int pos, int chainLength) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String pwd = reduce(hash, pos);
        while (pos != chainLength - 1) {
            pos++;
            pwd = reduce(Sha1.SHA1(pwd), pos);
        }
        return pwd;
    }

    public static BigInteger processHash(String hashed) {
        String c = "";
        for (int i = 0; i < hashed.length(); i++) {
            c = c + (int) hashed.charAt(i);
        }
        return new BigInteger(c);
    }

    public static String intToString(int n, String alphabet) {
        int base = alphabet.length();
        int r;
        String s = "";

        while (n > 0) {
            r = n % base;
            n = n / base;
            s = alphabet.charAt(r) + s;
            n = n - 1;
        }
        return s;
    }

}
