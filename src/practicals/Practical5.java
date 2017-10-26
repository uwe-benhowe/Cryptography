/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicals;

/**
 *
 * @author Ben
 */
public class Practical5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};

        System.out.println(array.length);

        for (String item : array) {
            System.out.println(item);
        }

        for (String item : array) {
            for (String item1 : array) {
                System.out.println(item + "" + item1);
            }
        }

        for (String item : array) {
            for (String item1 : array) {
                for (String item2 : array) {
                    System.out.println(item + "" + item1 + "" + item2);
                }
            }
        }

        for (String item : array) {
            for (String item1 : array) {
                for (String item2 : array) {
                    for (String item3 : array) {
                        System.out.println(item + "" + item1 + "" + item2 + "" + item3);
                    }
                }
            }
        }

        for (String item : array) {
            for (String item1 : array) {
                for (String item2 : array) {
                    for (String item3 : array) {
                        for (String item4 : array) {
                            System.out.println(item + "" + item1 + "" + item2 + "" + item3 + "" + item4);
                        }
                    }
                }
            }
        }

        for (String item : array) {
            for (String item1 : array) {
                for (String item2 : array) {
                    for (String item3 : array) {
                        for (String item4 : array) {
                            for (String item5 : array) {
                                System.out.println(item + "" + item1 + "" + item2 + "" + item3 + "" + item4 + "" + item5);
                            }
                        }
                    }
                }
            }
        }

    }

}
