package bachir.dev.springboilerplate.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {

    public static void writeFile(Path outputPath, String content) throws IOException {
        Files.write(outputPath, content.getBytes());
    }

    private FileWriter() {
    }
}
