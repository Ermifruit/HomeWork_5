import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametersTest {

    StringOperation stringOperation;

    @DataProvider
    public Object[][] getCountWordsData() {
        return new Object[][]{
                {4, "Taxi fax answer method"},
                {2, "Car apple"}
        };
    }

    @DataProvider
    public Object[][] getCharPositionFirstWordData() {
        return new Object[][]{
                {3, "Taxi fax answer method", 'i'},
                {2, "Car apple", 'r'}
        };
    }

    @DataProvider
    public Object[][] getLastWordData() {
        return new Object[][]{
                {"something", "Doing something"},
                {"Minsk", "I live in Minsk"}
        };
    }

    @DataProvider
    public Object[][] replaceFirstWordData() {
        return new Object[][]{
                {"opqrst bbb cccccc", "aaa bbb cccccc", "opqrst"},
                {"s oooo dddd mm q rrrr", "cccc oooo dddd mm q rrrr", "s"}
        };
    }

    @DataProvider
    public Object[][] removeLastWordData() {
        return new Object[][]{
                {"aaa bbb", "aaa bbb cccccc"},
                {"cccc oooo dddd mm q", "cccc oooo dddd mm q rrrr"}
        };
    }

    @BeforeMethod
    public void setUp() {
        stringOperation = new StringOperation();
    }

    @Test(dataProvider = "getCountWordsData")
    public void testGetCountWords(int expectedResult, String str) {
        Assert.assertEquals(stringOperation.getCountWords(str), expectedResult);
    }

    @Test(dataProvider = "getCharPositionFirstWordData")
    public void testGetCharPositionFirstWord(int expectedResult, String str, char ch) {
        Assert.assertEquals(stringOperation.getCharPositionFirstWord(str, ch), expectedResult);
    }

    @Test(dataProvider = "getLastWordData")
    public void testGetLastWord(String expectedResult, String str) {
        Assert.assertEquals(stringOperation.getLastWord(str), expectedResult);
    }

    @Test(dataProvider = "replaceFirstWordData")
    public void testReplaceFirstWord(String expectedResult, String str, String replacement) {
        Assert.assertEquals(stringOperation.replaceFirstWord(str, replacement), expectedResult);
    }

    @Test(dataProvider = "removeLastWordData")
    public void testRemoveLastWord(String expectedResult, String str) {
        Assert.assertEquals(stringOperation.removeLastWord(str), expectedResult);
    }
}