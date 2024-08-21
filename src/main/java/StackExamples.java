import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

  // Return the same Stack as given in the input, but with the top number replaced by newTop.
  public static Deque<Integer> updateStack(Deque<Integer> stack, int newTop) {
    stack.pop();
    stack.push(newTop);
    return stack;
}

  public static void main(String[] args) {
    
    Deque<String> stack = new ArrayDeque<>();
    stack.push("First request");
    stack.push("Second request");
    stack.push("Third request");
    System.out.println(stack);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack);
    stack.poll();
    System.out.println(stack);


    // testing updateStack
    Deque<Integer> stack2 = new ArrayDeque<>();
    stack2.push(2);
    stack2.push(3);
    stack2.push(5);
    stack2.push(7);
    stack2.push(10);
    int newTop = 11;
    Deque<Integer> result = updateStack(stack2, newTop); 
    System.out.println(result); // expected [11, 7, 5, 3, 2]
  }

}
