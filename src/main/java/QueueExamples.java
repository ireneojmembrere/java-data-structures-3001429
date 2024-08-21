import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueExamples {

  // Return the same ArrayDeque given as input, but with the first 3 numbers removed from the front.
  public static Queue<Integer> shortenQueue(Queue<Integer> queue) {
    // Your code goes here.
    queue.poll();
    queue.poll();
    queue.poll();
    return queue;
  }

  public static void main(String[] args) {

    //Queue<String> queue = new ArrayDeque<>();
    //queue.offer("Person One");
    //queue.offer("Person Two");
    //queue.offer("Person Three");
    //System.out.println(queue);
    //System.out.println(queue.peek());
    //queue.poll();
    //System.out.println(queue);

    // testing shortenQueue
    int testing = 3;
    if (testing == 1){
      Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 93, -13, 6, 105));
      Queue<Integer> result = shortenQueue(queue);
      System.out.println(result); // expected [6, 105]
    } else if (testing == 2){
      Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(2, 5, 20, 30, 56));
      Queue<Integer> result = shortenQueue(queue);
      System.out.println(result); // expected [30, 56]
    } else if (testing == 3){
      Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(-20, 30, -56));
      Queue<Integer> result = shortenQueue(queue);
      System.out.println(result); // expected []
    }
  }

}
