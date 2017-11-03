package practicals.Practical5;

import static practicals.Practical5.BruteForce.possibleStrings;


public class Threader implements Runnable {
    
    private final int maxLength;
    private final char[] alphabet;
    private final String current;
    private final long startTime;
    
    
    public Threader(int ml, char[] a, String c, long st){
        maxLength = ml;
        alphabet = a;
        current = c;
        startTime = st;
    }
    
    @Override
    public void run(){
        possibleStrings(maxLength, alphabet, current, startTime);
    }
}