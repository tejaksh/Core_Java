package Regex;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[a-z][a-z]{3}", "kite"));
        System.out.println(Pattern.matches("[a-g]?", "f"));//matches if char lies between a to z once
        System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", "tejasksh99@gmail.com"));
    }
}
