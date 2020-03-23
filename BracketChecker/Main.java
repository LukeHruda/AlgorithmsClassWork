import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String value = "";
    Stack<Integer> stack = new Stack<Integer>();
    while(in.hasNext())
    {
      value = in.nextLine();
      for(int i = 0;i<value.length();i++){
        if(value.charAt(i)=='(')
        {
          stack.push(1);
        }
        else if(value.charAt(i)==')')
        {
          if(!stack.empty())
          {
            stack.pop();
          }
          else
          {
            stack.push(1);
          }
        }
      }
      if(stack.empty())
      {
        System.out.println("correct");
      }
      else
      {
        System.out.println("incorrect");
      }
      while(!stack.empty())
      {
        stack.pop();
      }
    }
  }
}
