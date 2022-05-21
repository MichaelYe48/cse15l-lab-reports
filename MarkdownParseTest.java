import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    private static MarkdownParse mark;

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("Snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("another link");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testSnippet2() throws IOException {
        Path fileName = Path.of("Snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("nested link");
        expected.add("a nested parenthesized url");
        expected.add("some escaped [ brackets ]");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("this title text is really long and takes up more than one line");

        assertEquals(expected, mark.getLinks(content));
    }

}
