package repeatedWord;

import java.util.HashSet;

//I used https://javahungry.blogspot.com/2020/08/find-duplicate-words-in-string.html for a lot of the solution.
//I worked with Meghan Domeck on this and had some help from Bade Habib and Matt Petersen as well.

public class RepeatedWord {
    public static String duplicateWord(String string) throws Exception {
        if (string != null) {
            String[] strArray = string.toLowerCase().replace(",", "").split(" ");
            HashSet<String> repeatedWords = new HashSet<>();
            for (String str : strArray) {
                if (!repeatedWords.add(str))
                    return str;
            } return null;
        }
        throw new Exception("There are no duplicates.");
    }
}
