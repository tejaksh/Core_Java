package Regex;

import javax.imageio.ImageTranscoder;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {

        //if regex accepts 5 char sequence, starting with 'S' or 'T'
        System.out.println(Pattern.matches("[ST][a-z]{4}","Tejas" ));
        System.out.println();

        //Quantifier examples
        System.out.println(Pattern.matches("[xyz]?", "x"));//matches if String contains zero or one occurances
        System.out.println(Pattern.matches("[xyz]?", "xxyyyzz"));//matches if String contains zero or one occurances
        System.out.println(Pattern.matches("[xyz]+", "xxyzz"));//matches if String contains at least one occurances

    }
}
