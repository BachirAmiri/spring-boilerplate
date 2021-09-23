package bachir.dev.springboilerplate;

import bachir.dev.springboilerplate.utils.FileWriter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.springframework.test.util.AssertionErrors.assertTrue;

class FileWriterTests {

    @Test
    @DisplayName("File writing test")
    void thisMethodDoesNotThrowExceptio(@TempDir Path tempDir) throws IOException {
        Path tempfile = tempDir.resolve("tempfile.txt");
        FileWriter.writeFile(tempfile, "test");

        assertAll(
                () -> assertTrue("File should exist", Files.exists(tempfile)),
                () -> assertLinesMatch(Collections.singletonList("test"), Files.readAllLines(tempfile)));
    }
}
