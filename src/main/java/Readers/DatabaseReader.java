package Readers;

import Elements.RSI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DatabaseReader {

    public static final ArrayList<RSI> listOfDatabaseItems = new ArrayList<>();

    public DatabaseReader(String csvFile) {
        if(Files.exists(Paths.get(csvFile))) {
            BufferedReader reader;
            String line;
            try {
                reader = new BufferedReader(new FileReader(csvFile));
                while ((line = reader.readLine()) != null) {
                    String[] column = line.split(",");
                    //System.out.println("Name = " + column[0] + " ,ID = " + column[1]);
                    listOfDatabaseItems.add(new RSI(
                            column[6],
                            column[7]));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public ArrayList<RSI> getRSIModel() {
        return listOfDatabaseItems;
    }
}
