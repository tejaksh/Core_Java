package Regex;

import java.util.Scanner;

public class EmailAndPhoneRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        System.out.println("Enter your phone: ");

        boolean result = email.matches(regex);
        if(result){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is not valid");
        }
    }
}
