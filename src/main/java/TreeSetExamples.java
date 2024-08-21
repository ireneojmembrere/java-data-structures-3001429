import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

  // Return a TreeSet containing the three words, ordered by length.
  public static TreeSet<String> createSortedTreeSet(String word1, String word2, String word3) {
    // Your code goes here.
    TreeSet<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));
    treeSet.add(word1);
    treeSet.add(word2);
    treeSet.add(word3);
    return treeSet;
}

  public static void main(String[] args) {

    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(300);
    treeSet.add(47);
    treeSet.add(6);
    System.out.println(treeSet);
    treeSet.add(6);
    System.out.println(treeSet);

    Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("bear");
    System.out.println(wordSet);
    wordSet.add("wolf");
    System.out.println(wordSet);
    wordSet.remove("giraffe");
    System.out.println(wordSet);

    // testing createSortedTreeSet
    TreeSet<String> result1 = createSortedTreeSet("red","yellow","blue");
    System.out.println(result1);
    TreeSet<String> result2 = createSortedTreeSet("car","bicycle","truck");
    System.out.println(result2);
    TreeSet<String> result3 = createSortedTreeSet("pineapple","pear","papaya");
    System.out.println(result3);
  }

}
