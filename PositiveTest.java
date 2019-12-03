import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveTest {

    StringOperation stringOperation;

    @BeforeMethod
    public void setUp() {
        stringOperation = new StringOperation();
    }

    @Test
    public void testGetCountWords() {
        int expectedResult = 3;
        String str = "A B C";
        int actualResult = stringOperation.getCountWords(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetCharPositionFirstWord() {
        int expectedResult = 5;
        String str = "switch closed";
        int actualResult = stringOperation.getCharPositionFirstWord(str, 'h');
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetLastWord() {
        String str = "one two three four five";
        String actualResult = stringOperation.getLastWord(str);
        String expectedResult = "five";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(enabled = false)
    public void testReplaceFirstWord() {
        String str = "??? B C D";
        String replaceStr = "A";
        String expectedResult = "A B C D";
        String actualResult = stringOperation.replaceFirstWord(str, replaceStr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveLastWord() {
        String str = "first second third last";
        String actualResult = stringOperation.removeLastWord(str);
        String expectedResult = "first second third";
        Assert.assertEquals(actualResult, expectedResult);
    }
}