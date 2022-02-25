import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class MarkdownParseTest {

    @Test
    public void testSnippet1() throws IOException{
        String contents= Files.readString(Path.of("test-snippet1.md"));
        List<String> links = List.of("`google.com","google.com","ucsd.edu");
        assertEquals(links, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException{
        String contents= Files.readString(Path.of("test-snippet2.md"));
        List<String> links = List.of("a.com","a.com(())","example.com");
        assertEquals(links, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException{
        String contents= Files.readString(Path.of("test-snippet3.md"));
        List<String> links = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(links, MarkdownParse.getLinks(contents));
    }
    
}
