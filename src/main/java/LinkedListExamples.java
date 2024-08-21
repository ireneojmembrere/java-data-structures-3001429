import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

  public static LinkedList<String> updateLinkedList(LinkedList<String> words, String newWord, int index){
    words.add(index,newWord);
    return words;
  }

  public static void main(String[] args) {

    LinkedList<String> shoppingList = new LinkedList<>();
    shoppingList.add("apple");
    shoppingList.add("banana");
    shoppingList.add("pear");
    System.out.println(shoppingList);

    shoppingList.add(1, "mango");
    System.out.println(shoppingList);

    shoppingList.removeFirst();
    System.out.println(shoppingList);

    List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
    System.out.println(synchronizedShoppingList);
    
    // testing updateLinkedList
    LinkedList<String> words = new LinkedList<>(Arrays.asList("Mercury", "Venus", "Mars"));
    LinkedList<String> wordsCopy = new LinkedList<>(words);
    String newWord = "Earth";
    int index = 2;
    LinkedList<String> result = updateLinkedList(words, newWord, index);
    System.out.println(result); // expected [Mercury, Venus, Earth, Mars]

    LinkedList<String> words2 = new LinkedList<>(Arrays.asList("Hello", "World"));
    LinkedList<String> wordsCopy2 = new LinkedList<>(words2);
    String newWord2 = "!";
    int index2 = 2;
    LinkedList<String> result2 = updateLinkedList(words2, newWord2, index2);
    System.out.println(result2); // expected [Hello, World, !]

    LinkedList<String> words3 = new LinkedList<>(Arrays.asList("Cat", "Rabbit", "Dog", "Hamster"));
    LinkedList<String> wordsCopy3 = new LinkedList<>(words3);
    String newWord3 = "Goldfish";
    int index3 = 1;
    LinkedList<String> result3 = updateLinkedList(words3, newWord3, index3);
    System.out.println(result3); // expected [Cat, Goldfish, Rabbit, Dog, Hamster]

  }

}
