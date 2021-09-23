package bachir.dev.springboilerplate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static bachir.dev.springboilerplate.utils.FileReader.readFile;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class FileReaderTests {

    @Test
    @DisplayName("FileReader valid file")
    void validFileRead() {
        assertDoesNotThrow(
                () -> readFile("src/test/java/bachir/dev/springboilerplate/resources/lorem_ipsum.txt")
        );
    }


    @Test
    @DisplayName("FileReader exception handling")
    void checkExceptionHandling() {

        assertThrows(
                IOException.class,
                () -> readFile("src/test/java/bachir/dev/springboilerplate/resources/nonExistingFile.txt")
        );
    }
}
