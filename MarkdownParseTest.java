import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void multiplication() {
        assertEquals(10, 5*2);
    }
    
    @Test
    public void testLink() {
        String[] links = {"https://something.com","some-page.html"};
        List<String> Array4 = Arrays.asList("http:…");
        assertSame(links, MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    }
