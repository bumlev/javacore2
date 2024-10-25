package writeFileNIO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class writeFile {

    public static void main(String[] args) throws URISyntaxException, IOException {

        // File to read from (located in the 'file' package)
        Path inputPath = Paths.get("src/file/account_shopware.txt");

        // Ensure that the input file exists
        if (!Files.exists(inputPath)) {
            System.out.println("Input file does not exist: " + inputPath);
            return;
        }

        // Define the output file path inside the 'src/file' directory
        Path outputPath = Paths.get("src/file/output.txt");

        // Ensure that the output directory exists
        Path outputDir = outputPath.getParent();  // 'src/file' directory
        if (!Files.exists(outputDir)) {
            Files.createDirectories(outputDir);  // Create 'src/file' directory if not exists
        }

        // Open the file channel in read-only mode for the input file
        try (FileChannel readChannel = FileChannel.open(inputPath, StandardOpenOption.READ);

             // Open the file channel in write mode (create if doesn't exist) for the output file
             FileChannel writeChannel = FileChannel.open(outputPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            // Allocate a byte buffer for reading and writing
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int bytesRead;
            while ((bytesRead = readChannel.read(buffer)) > 0) {
                // Flip the buffer to prepare for writing after reading data
                buffer.flip();

                // Write the data from buffer to the output file
                writeChannel.write(buffer);

                // Clear the buffer to prepare for the next read operation
                buffer.clear();
            }

            System.out.println("Data successfully written to " + outputPath.toString());
        }
    }

}
