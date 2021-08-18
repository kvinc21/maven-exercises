package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;
public class Example {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Something: ");

    String userResponse = scan.nextLine();
    System.out.println("You Entered: " + userResponse);

    System.out.println("\"" + userResponse + "\"" + checkNumber(userResponse));
    }

    public static String checkNumber(String check) {
        return (StringUtils.isNumeric(check)) ? " is a number" : " is not a number";
    }

}
