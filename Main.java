import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
      input = sc.nextLine(); //waits for the user to enter a word
      words.add(input);
      System.out.println("Just added the word. ArrayList is now " + words);
    }
    

    System.out.println("Exited loop. ArrayList is now " + words);
    words.set(words.size()-1, "HELLOOOOOOOO");
    words.remove(lastIndex);
    System.out.println("Removed the last word. ArrayList is now " + words);

    String firstIndex = words.get(0);
    words.set(words.size()-1, firstIndex);

    System.out.println("Switched the first index with the last index. ArrayList is now " + words);

    String secondIndex = words.get(2);
    words.set(1,secondIndex);

    System.out.println("Switched the first with the second. ArrayList is now " + words);
  }
}
