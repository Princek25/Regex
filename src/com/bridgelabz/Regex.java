package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Scanner sc =  new Scanner(System.in);
    static Pattern string = Pattern.compile("^[A-Z][a-z]{3,}$");

    public static void main(String[] args) {
        System.out.println("Enter your last name:- ");
        String lastName = sc.next();
        Matcher matcher = string.matcher(lastName);
        if(matcher.matches()){
            System.out.println("Valid Name");
        }
        else{
            System.out.println("Invalid Name ! \n First letter should be capital only and other should be in small");
        }
    }

}
