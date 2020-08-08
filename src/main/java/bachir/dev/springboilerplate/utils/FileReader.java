package bachir.dev.springboilerplate.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    private static final Logger logger = LogManager.getLogger(FileReader.class);

    public static void readFile(String pathToFile) throws IOException {

        try (BufferedReader br = Files.newBufferedReader(Paths.get(pathToFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                logger.info(line);
            }

            logger.info("EOF");
        } catch (IOException e) {
            logger.error("Erreur lors de la récupération du fichier", e);
            throw new IOException(e);
        }
    }

    private FileReader() {
    }
}
