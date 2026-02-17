package New;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {

        String fileName = "Tech.txt";

        try {
            // 1️⃣ Create file if it doesn't exist
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            // 2️⃣ Write data using FileWriter only
            FileWriter fw = new FileWriter(file, true); // true = append mode
            fw.write("101 Kumar 25 Fever\n");
            fw.write("102 Raj 30 Cold\n");
            fw.write("103 Prakhar 28 Flu\n");
            fw.close();
            System.out.println("Data written successfully using FileWriter only");

            // 3️⃣ Read data using FileReader only
            FileReader fr = new FileReader(file);
            int ch;
            System.out.println("\nReading file content character by character:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // convert ASCII int to char
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
