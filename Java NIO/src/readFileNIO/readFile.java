package readFileNIO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class readFile {

    public static void main(String[] args) throws IOException, URISyntaxException {

        // File to read from
        Path path = Paths.get(readFile.class.getResource("/file/account_shopware.txt").toURI());
        // Open the file channel in read-only mode
        try(FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)){

            // Allocate a byte buffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int bytesRead;
            do {
                // Attempt to read data into the buffer (might not read all requested bytes)
                bytesRead = channel.read(buffer);

                // Process the read data (e.g., print or write to another file)
                if (bytesRead > 0) {
                    // Handle data processing here
                    System.out.println(new String(buffer.array(), 0, bytesRead));
                    buffer.clear(); // Prepare the buffer for the next read operation
                }
            } while (bytesRead > 0); // Continue reading until EOF
        }

    }
}
