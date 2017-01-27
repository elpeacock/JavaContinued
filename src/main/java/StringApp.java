import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by user on 1/27/17.
 */
public class StringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me something: ");
        String something = sc.nextLine();

        System.out.println("you entered: " + something);
        if (isNumeric(something)) {
            System.out.println(something + " is a number");
        } else {
            System.out.println(something + " is not a number");
        }
        System.out.println("Flipped Case: " + flipCase(something));
        System.out.println("Reversed: " + reverseString(something));

    }

    public static boolean isNumeric(String something) {
        return StringUtils.isNumericSpace(something);
    }

    public static String flipCase(String something) {
        return StringUtils.swapCase(something);
    }

    public static String reverseString(String something) {
        return StringUtils.reverse(something);
    }

}
