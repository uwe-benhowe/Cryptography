package practicals.RainbowTable;

import java.io.*;

public class FileOperations {

    public FileOperations() {}

    /**File Available
     * Checks if the file RainbowTable.ser doesn't exist
     * if it doesn't exist then it saves the Rainbow Table to
     * the file.
     * @param s the name of the file ("RainbowTable.ser")
     */
    public static void fileAvailable(String s) {
        java.io.File p = new java.io.File(s);
        if (!p.exists()) {
            RainbowTable rainbowTable = new RainbowTable();
            saveHashMapToFile(rainbowTable, s);
        }
    }

    /**Save HashMap to File
     * Saves the generated HashMap (rainbow Table) to the file specified
     * @param r The rainbow table.
     * @param file The file to write to.
     */
    public static void saveHashMapToFile(RainbowTable r, String file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(r);
            }

        } catch (FileNotFoundException e) {
            e.toString();
        } catch (IOException e) {
            e.toString();
        }
    }

    /** Load Rainbow Table
     * Takes a file and returns the rainbow table object stored inside it.
     * @param file File which stores the Rainbow Table.
     * @return Returns a RainbowTable object.
     */
    public RainbowTable loadRainbowTable(String file) {
        RainbowTable rainbowTable;
        try {
            FileInputStream fis = new FileInputStream(file);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                rainbowTable = (RainbowTable) ois.readObject();
            }

            return rainbowTable;

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }
}