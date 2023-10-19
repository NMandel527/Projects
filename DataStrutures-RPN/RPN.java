import java.util.*;

/**
 * This program takes an RPN expression and returns the result as a double
 * @source function takes a string as an argument
 * @result evaluates and returns the result of the RPN expression
 * @author Nicole Mandel
 */

public class RPN
{
    public static String evaluate(String expression)
    {
        String[] exp = expression.split("\\s+")  ;
        Stack<Double> rpn = new Stack<>();
        for (String ix : exp)
        {
            if (ix.matches("[+\\-*/^]"))
            {
                double first = rpn.pop();
                double second = rpn.pop();
                double result = calculate(first, second, ix);
                rpn.push(result);
            }
            else
            {
                rpn.push(Double.parseDouble(ix));
            }
        }
        return rpn.pop().toString();
    }

    private static double calculate(double first, double second, String operator)
    {
        double result = switch (operator)
                {
                    case "+" -> second + first;
                    case "-" -> second - first;
                    case "*" -> second * first;
                    case "/" -> second / first;
                    case "^" -> Math.pow(first, second);
                    default -> Double.MIN_VALUE;
                };
        return result;
    }
}


