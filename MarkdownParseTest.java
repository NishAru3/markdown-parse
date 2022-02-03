import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    public void test(){
        Path fileName = Path.of("test-file1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> newList = new ArrayList<String>();
        assertEquals(newList, links);
    }
}
