package incremental.java7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileReadWrite {

    public static void main(String[] filename) {
        Map<Character, Integer> mapp = new HashMap<Character, Integer>();
        try {
            // read the file
            FileInputStream inputStream = new FileInputStream("input.txt");
            InputStreamReader reader = new InputStreamReader(inputStream);
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            int character;
            while ((character = reader.read()) != -1) {
                int val = mapp.containsKey((char)character) ? mapp.get((char)character) : 0;
                //System.out.println((char) character + " " + val);
                mapp.put((char)character, val + 1);
            }
            reader.close();
            //Save the result in a text file
            for (Map.Entry<Character, Integer> entry : mapp.entrySet()) {
                //System.out.println((char)entry.getKey() + " : " + entry.getValue());
                bufferedWriter.write((char)entry.getKey() + " -> " + entry.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
