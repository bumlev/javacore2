package Exceptions.checkedExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

    public static void main(String[] args) throws IOException {

        try {
            // Attempt to open a file
            FileReader fileReader = new FileReader("example.txt");

            // Attempt to read from the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read a line from the file
            String line = bufferedReader.readLine();

            // Output the line
            System.out.println("Content of the file: " + line);

            // Close the file
            bufferedReader.close();
        } catch (FileNotFoundException e) {

            // Handle the case where the file is not found
            System.out.println("The specified file does not exist.");
            System.exit(0);
            // e.printStackTrace();

        } catch (IOException e) {

            // Handle other I/O errors
            System.out.println("An I/O error occurred while reading the file.");
            System.exit(0);
           // e.printStackTrace();

        }
    }
}
