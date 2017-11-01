package practicals.Practical5;

import static practicals.Practical5.Hash.possibleStrings;

public class Threader implements Runnable {

    private final int maxLength;
    private final char[] alphabet;
    private final String curr;
    private final long startTime;
    
    public Threader(int ml, char[] a, String c, long st){
        maxLength = ml;
        alphabet = a;
        curr = c;
        startTime = st;
    }
    
    @Override
    public void run(){
        possibleStrings(maxLength, alphabet, curr, startTime);
    }
}