package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;
public class Example {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Something: ");

    String userResponse = scan.nextLine();

    System.out.println("You Entered: " + "\"" + userResponse + "\"");
    //      TAKES IN THE USER RESPONSE AND RETURNS IT

    System.out.println("\"" + userResponse + "\"" + checkNumber(userResponse));
    //       TAKES IN THE USER RESPONSE AND CHECK FOR NUMBERS DUE TO FUNCTION WRITTEN BELOW.

    System.out.println("Flipped Case: " + StringUtils.swapCase(userResponse));
    //       THIS WILL FLIP MESSAGE

    System.out.println("reversed: " + StringUtils.reverse(userResponse));
    //       THIS WILL REVERSE MESSAGE
    }

    public static String checkNumber(String check) {
        return (StringUtils.isNumeric(check)) ? " is a number" : " is not a number";
//        QUESTION MARK WILL CHECK FOR NUMBER, It is the short-hand solution of the IF
//        ... ELSE statement in Java and can be used as a single line statement for decision making
//            COLON ( : ) = TRUE OR FALSE
//        https://www.delftstack.com/howto/java/java-question-mark-colon/
    }

}
