package copyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopier {


    public static void main(String[] args) {

        // Specify the source file and the destination file paths
        Path sourceFile = Paths.get("src/file/sourceFile.txt");
        Path destinationFile = Paths.get("src/file/destinationFile.txt");

        try {
            // Copy the source file to the destination file
            Files.copy(sourceFile, destinationFile , StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error occurred while copying the file: " + e.getMessage());
        }
    }
}
