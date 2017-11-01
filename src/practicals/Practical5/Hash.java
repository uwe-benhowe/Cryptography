/*Links used
https://stackoverflow.com/questions/27894586/how-to-multi-thread-a-brute-force-java-password-program
https://codereview.stackexchange.com/questions/41510/calculate-all-possible-combinations-of-given-characters
https://azure.microsoft.com/en-us/pricing/calculator/#virtual-machines1
https://ubuntuforums.org/showthread.php?t=1703661
 */
package practicals.Practical5;

import java.io.*;
import java.security.*;
import java.util.*;

public class Hash {

    public static String path1 = "\\Users\\Ben\\Desktop\\Third Year Netbeans Projects\\cryptography\\src\\practicals\\Practical5\\data\\hashes.txt";
    public static String path2 = "\\Users\\Ben\\Desktop\\Third Year Netbeans Projects\\cryptography\\src\\practicals\\Practical5\\data\\myhashes.txt";

    public static void main(String[] args) {

        char[] charset = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();

        final long startTime = System.currentTimeMillis();

        possibleStrings(1, charset, "", startTime);
        possibleStrings(2, charset, "", startTime);
        Runnable r1 = new Threader(3, charset, "", startTime);
        Runnable r2 = new Threader(4, charset, "", startTime);
        Runnable r3 = new Threader(5, charset, "", startTime);
        //Runnable r4 = new Threader(6, charset, "", startTime);

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        //new Thread(r4).start();

    }

    //Main method to brute crack the hashes.
    public static void possibleStrings(int maxLength, char[] alphabet, String currentString, long startTime) {
        if (currentString.length() == maxLength) {
            checkForMatch(currentString, startTime);
        } else {
            for (char c : alphabet) {
                String oldCurr = currentString;
                currentString += c;
                possibleStrings(maxLength, alphabet, currentString, startTime);
                currentString = oldCurr;
            }
        }
    }

    /*
    Checks for a match on the sha1 input file.
    Takes param startTime so the program can output how long it took
     */
    public static void checkForMatch(String input, long startTime) {

        try {
            //Hashes the input to compare
            String SHA1hash = SHA1(input);

            //Reads in the file with the hashes we want to compare. 
            File file = new File(path2);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.next();

                //Checking for a match.
                if (SHA1hash.equals(line)) {
                    final long endTime = System.currentTimeMillis();
                    System.out.println("Found '" + input + "' in " + (endTime - startTime) + " miliseconds");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }

    //Comverts array of bytes to hex. Used to calculate hash.
    private static String convertToHex(byte[] data) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    //Takes in plain text, returns sha1 hash.
    public static String SHA1(String text) {

        byte[] sha1hash = new byte[40];

        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-1");
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            sha1hash = md.digest();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            System.out.println(ex);
        }

        return convertToHex(sha1hash);
    }

}
