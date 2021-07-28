package ca.ciccc.wmad202.assignment9.assignment4.problem4;

import java.util.Scanner;

public class Problem4 {
    public static boolean functionIsOperator(char a) {
        boolean operator = a == '%' || a == '+' || a == '-' || a == '*' || a == '/';
        return operator;
    }

    public static int count(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;

    }

    public static boolean isalpha(char c) {
        String regex = "[a-zA-Z]*";
        String s = String.valueOf(c);
        if (s.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isArithmetic() {
        Scanner console = new Scanner(System.in);
        String strArithmetic = console.next();
        int leftBrackets = count(strArithmetic, '(');
        int rightBrackets = count(strArithmetic, ')');
        if (leftBrackets == rightBrackets) {
            String withoutBrackets = strArithmetic.replace("(", "");
            withoutBrackets = withoutBrackets.replace(")", "");
            for (int i = 0; i < withoutBrackets.length(); i++) {
                if (i == (withoutBrackets.length() - 1) || i == 0) {
                    if (functionIsOperator(withoutBrackets.charAt(i))) {
                        System.out.println("Is not an arithmetic expression!!");
                        return false;
                    } else if (isalpha(withoutBrackets.charAt(1))) {
                        System.out.println("Is not an arithmetic expression!!");
                        return false;
                    }
                } else {
                    boolean statement1 = isalpha(withoutBrackets.charAt(i)) && functionIsOperator(withoutBrackets.charAt(i + 1));
                    boolean statement2 = functionIsOperator(withoutBrackets.charAt(i)) && isalpha(withoutBrackets.charAt(i));
                    if (statement1 || statement2) {
                        System.out.println("Is an arithmetic expression!! :)");
                        return true;
                    } else {
                        System.out.println("Is not an arithmetic expression!!");
                        return false;
                    }
                }

            }

        } else {
            System.out.println("Missing Brackets!!");
            return false;
        }
        return true;

    }


}
