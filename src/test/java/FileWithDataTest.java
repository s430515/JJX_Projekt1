import javafx.fxml.FXML;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class FileWithDataTest {



    @Test
    public void removeLinea() throws IOException {
        FileWithData file = new FileWithData("exampleTest.txt");
        file.savee("Poznań","Paul","von Hindenburg","44051401358");
        file.removeLine("44051401358");

        String path = "exampleTest.txt";
        List<String> content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        System.out.println(content.isEmpty());

    }
}