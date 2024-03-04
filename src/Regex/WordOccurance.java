package Regex;
import java.util.regex.*;

public class WordOccurance {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hi", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hi World");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match Not Found");
        }
    }
}
