import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExceptionTest {

    StringOperation stringOperation;

    @BeforeMethod
    public void setUp() {
        stringOperation = new StringOperation();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testGetCountWords() {
        Assert.assertEquals("Some text", stringOperation.getCountWords(null));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testGetCharPositionFirstWord() {
        Assert.assertEquals("Some text", stringOperation.getCharPositionFirstWord(null, 'j'));
    }

    @Test(expectedExceptions = NullPointerException.class, enabled = false)
    public void testGetLastWord() {
        Assert.assertEquals("Some text", stringOperation.getLastWord(null));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testReplaceFirstWord() {
        Assert.assertEquals("Some text", stringOperation.replaceFirstWord("Text", null));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testRemoveLastWord() {
        Assert.assertEquals("Some text", stringOperation.removeLastWord(null));
    }
}