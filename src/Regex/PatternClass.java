package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".m");
        Matcher match = pattern.matcher(".am");
        Boolean bool = match.matches();
        System.out.println(bool);

        System.out.println(Pattern.matches("[abc]", "acd")); //match any char including 'a', 'b', 'c'
        System.out.println(Pattern.matches("[^abc]", "d")); //match any char except 'a', 'b', 'c'
        System.out.println(Pattern.matches("[a-zA-S]","H" ));//match any char falls between 'a' to 'z' and 'A' to 'S'
        System.out.println(Pattern.matches("[TS][a-z]", "K"));//match any String starting with 'M' & 'S' only.
        System.out.println(Pattern.matches(".m", "am"));//match any char with 'm'

    }
}
