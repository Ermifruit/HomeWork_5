public class StringOperation {

    public int getCountWords(String str) {
        return str.split(" ").length;
    }

    public int getCharPositionFirstWord(String str, char ch) {
        return str.split(" ")[0].indexOf(ch);
    }

    public String getLastWord(String str) {
        String[] wordsArray = str.split(" ");
        return wordsArray[wordsArray.length - 1];
    }

    public String replaceFirstWord(String str, String replacement) {
        String[] wordsArray = str.split(" ");
        return str.replaceFirst(wordsArray[0], replacement);
    }

    public String removeLastWord(String str) {
        String newStr = "";
        String[] wordsArray = str.split(" ");
        for (int i = 0; i < wordsArray.length - 1; i++) {
            newStr = newStr + wordsArray[i];
            newStr += i != wordsArray.length - 2 ? " " : "";
        }
        return newStr;
    }
}
