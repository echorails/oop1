import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double leftOperand, result, rightOperand;
       String leftString, operator, rightString;
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);
       String line = in.nextLine();

       String[] expressions = line.trim().split("\\s+");

       for (String expr : expressions){
           tokenizer = new StringTokenizer(expr, "+-*/", true);

           try
           {
              leftString   = tokenizer.nextToken();
              operator     = tokenizer.nextToken();
              rightString  = tokenizer.nextToken();

              try {
                  leftOperand  = Double.parseDouble(leftString);
              } catch (NumberFormatException e) {
                  System.out.println("Left operand is not a number");
                  continue;
              }

              try {
                  rightOperand = Double.parseDouble(rightString);
              } catch (NumberFormatException e) {
                  System.out.println("Right operand is not a number");
                  continue;
              }

              if (operator.equals("+")){
                 result = leftOperand + rightOperand;
              } else if (operator.equals("-")){
                   result = leftOperand - rightOperand;
              } else if (operator.equals("*")){
                   result = leftOperand * rightOperand;
              } else if (operator.equals("/")){
                   result = leftOperand / rightOperand;
              } else {
                result = 0.0;
              }

              System.out.println("Result: " + result);
           }

           catch (NoSuchElementException nsee)
           {
              System.out.println("Invalid syntax");
           }
       }
}
}