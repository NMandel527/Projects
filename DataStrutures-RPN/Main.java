import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an RPN expression or <CR> to exit");
        String expression = input.nextLine();
        while (!Objects.equals(expression, "<CR>"))
        {
            try
            {
                System.out.println(RPN.evaluate(expression));
            }
            catch (Exception exception)
            {
                System.out.println("Syntax error");
            }
            finally
            {
                System.out.println("Enter an RPN expression or <CR> to exit");
                expression = input.nextLine();
            }
        }
        System.out.println("Good bye");
    }
}
