package sample.Read;

import java.io.*;
import java.util.Map;

/**
 * Created by andriusbaltrunas on 3/3/2017.
 */
public class ReadData {
    private static final String FILE_NAME = "data.txt";

    public static void readFile(Map<String, String> ltMap, Map<String, String> enMap) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(FILE_NAME)));
            String line = null;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split("-");
                if (items.length == 2) {
                    ltMap.put(items[1], items[0]);
                    enMap.put(items[0], items[1]);
                }
            }
        } catch (IOException e) {
            //TODO pabaigti kitam
        }

    }
}
