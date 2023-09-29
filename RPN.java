import java.util.*;

public class RPN {
    public static String evaluate(String expression) {
        String[] exp = expression.split(" ");
        Stack<Double> rpn = new Stack<>();
        double first;
        double second;
        for (String ix : exp) {
            switch (ix) {
                case "+" -> {
                    first = rpn.pop();
                    second = rpn.pop();
                    rpn.push(first + second);
                }
                case "-" -> {
                    first = rpn.pop();
                    second = rpn.pop();
                    rpn.push(second - first);
                }
                case "*" -> {
                    first = rpn.pop();
                    second = rpn.pop();
                    rpn.push(first * second);
                }
                case "/" -> {
                    first = rpn.pop();
                    second = rpn.pop();
                    rpn.push(second / first);
                }
                case "^" -> {
                    first = rpn.pop();
                    second = rpn.pop();
                    rpn.push(Math.pow(first, second));
                }
                default -> {
                    rpn.push(Double.parseDouble(ix));
                }
            }
        }
            return rpn.pop().toString();
    }

}


