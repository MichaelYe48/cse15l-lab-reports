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
    public void testFileLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-page.html");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testEmptyLinks() throws IOException {
        Path fileName = Path.of("empty.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testFile2Links() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://mlb.com");
        expected.add("ucsd-student.html");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testExample3Links() throws IOException {
        Path fileName = Path.of("example3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("some-thing.html");
        expected.add("some-thing.html");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testFailingTest() throws IOException {
        Path fileName = Path.of("failingTest.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://mlb.com");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("Snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://mlb.com");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testSnippet2() throws IOException {
        Path fileName = Path.of("Snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://mlb.com");

        assertEquals(expected, mark.getLinks(content));
    }

    @Test
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://mlb.com");

        assertEquals(expected, mark.getLinks(content));
    }

}
