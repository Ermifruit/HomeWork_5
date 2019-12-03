import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTest {

    StringOperation stringOperation;

    @BeforeMethod
    public void setUp() {
        stringOperation = new StringOperation();
    }

    @Test(enabled = false)
    public void testGetCountWords() {
        String str = "A B C D";
        int exceptedResult = 5;
        int actualResult = stringOperation.getCountWords(str);
        Assert.assertEquals(actualResult, exceptedResult);
    }

    @Test
    public void testGetCharPositionFirstWord() {
        String str = "";
        int excpectedResult = -1;
        int actualResult = stringOperation.getCharPositionFirstWord(str, 'g');
        Assert.assertEquals(actualResult, excpectedResult);
    }

    @Test
    public void testReplaceFirstWord() {
        String str = "A B C";
        String excpectedResult = "a B C";
        String actualResult = stringOperation.replaceFirstWord(str, "a");
        Assert.assertEquals(actualResult, excpectedResult);
    }

    @Test
    public void testRemoveLastWord() {
        String str = "first second last";
        String excpectedResult = "first second";
        String actualResult = stringOperation.removeLastWord(str);
        Assert.assertEquals(actualResult, excpectedResult);
    }
}