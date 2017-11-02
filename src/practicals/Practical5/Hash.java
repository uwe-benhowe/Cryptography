/*Links used
https://stackoverflow.com/questions/27894586/how-to-multi-thread-a-brute-force-java-password-program
https://codereview.stackexchange.com/questions/41510/calculate-all-possible-combinations-of-given-characters
https://azure.microsoft.com/en-us/pricing/calculator/#virtual-machines1
https://ubuntuforums.org/showthread.php?t=1703661
 */
package practicals.Practical5;

import java.io.*;
import java.security.*;

public class Hash {

    public static String[] hashes = {
        "c2543fff3bfa6f144c2f06a7de6cd10c0b650cae",
        "b47f363e2b430c0647f14deea3eced9b0ef300ce",
        "e74295bfc2ed0b52d40073e8ebad555100df1380",
        "0f7d0d088b6ea936fb25b477722d734706fe8b40",
        "77cfc481d3e76b543daf39e7f9bf86be2e664959",
        "5cc48a1da13ad8cef1f5fad70ead8362aabc68a1",
        "4bcc3a95bdd9a11b28883290b03086e82af90212",
        "7302ba343c5ef19004df7489794a0adaee68d285",
        "21e7133508c40bbdf2be8a7bdc35b7de0b618ae4",
        "6ef80072f39071d4118a6e7890e209d4dd07e504",
        "02285af8f969dc5c7b12be72fbce858997afe80a",
        "57864da96344366865dd7cade69467d811a7961b"};
    
    
    public static void main(String[] args) {

        char[] charset = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();

        final long startTime = System.currentTimeMillis();

        System.out.println("hh:mm:ss:ms");
        possibleStrings(1, charset, "", startTime);
        possibleStrings(2, charset, "", startTime);
        Runnable r1 = new Threader(3, charset, "", startTime);
        Runnable r2 = new Threader(4, charset, "", startTime);
        Runnable r3 = new Threader(5, charset, "", startTime);
        Runnable r4 = new Threader(6, charset, "", startTime);

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        new Thread(r4).start();

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
        String SHA1hash = SHA1(input);
        for (String hash : hashes) {
            if (SHA1hash.equals(hash)) {
                final long endTime = System.currentTimeMillis();
                System.out.println("Found '" + input + "' in " + formatTime(startTime, endTime));
            }
        }
    }

    public static String formatTime(long start, long end ){
        
        long milis = end - start;
        long second = (milis / 1000) % 60;
        long minute = (milis / (1000 * 60)) % 60;
        long hour = (milis / (1000 * 60 * 60)) % 24;
        long newMilis = (milis % 1000);
        String time = String.format("%02d:%02d:%02d:%d", hour, minute, second, newMilis);
         
        return time;
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