package practicals.RainbowTable;

import static java.lang.Math.random;
import java.util.Random;
import static practicals.BruteForce.BruteForce.SHA1;

public class CreateTable { 
    
    public static String strCharset;
    public static char[] charset;
    public static int minPwLength;
    public static int maxPwLength;
    public static int numChains;
    public static int chainLength;
    public static Random rando;

    
    
    
    
    
    public static void main(String[] args) {
        
        strCharset = "1234560";
        charset = strCharset.toCharArray();   
        minPwLength = 5;
        maxPwLength = 5;
        numChains = 10;
        chainLength = 10;
        rando = new Random(System.currentTimeMillis());
        
        String hash = "8cb2237d0679ca88db6464eac60da96345513964"; //12345
        byte[] byteHash = hash.getBytes();
        
        //Key increasing from the minpassword length until it reaches the max password
        //length, this is so every length is coverd in the tables, not just length
        //3 for example.
        int key = 0;

        for (int i = 0; i < numChains; i++) {
            
            int pwLength = minPwLength + key;
            
            
            
            //Start is a cleartext password
            String startPassword = startingPoint(rando, pwLength);   
            String endingHash = calculateChain(startPassword, pwLength);
            
            System.out.println("stop");
        }
    }
    
    public static String startingPoint(Random rando, int pwLength){
        StringBuilder salt = new StringBuilder();
        while (salt.length() < pwLength) { // length of the random string.
            int index = (int) (rando.nextFloat() * strCharset.length());
            salt.append(strCharset.charAt(index));
        }
        
        String saltStr = salt.toString();
        
        return saltStr;
    }  
    
    
    private static String calculateChain(String currentEndpoint, int pwLength) {
        
        String hash;
        for (int j = 0; j < chainLength; j++) {
            
            
            hash = SHA1(currentEndpoint);
            currentEndpoint = reduce(hash, j, pwLength);
            System.out.println("test");
        }
        return currentEndpoint;
    }
    
    
    public static String reduce(String hash, int functionNr, int pwLength) {

        
        for (int i = 0; i < pwLength; i++) {
            
        }
        
        

        return out;
    }
    
    
  }
