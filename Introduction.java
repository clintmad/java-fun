
import java.util.Scanner;

public class Introduction {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in); 

    System.out.println("Hello, what's your name?");
    String name = input.next();

    if (name.equals("Clint")) 
        System.out.println("Clint? My name is Clint! Lovely.");    
    else 
        System.out.println(name + " ? Nice to meet you, " + name);    

    System.out.println("How are you on this fine day?");
    System.out.println("Good / Bad");    
    String theirResponse = input.next();

    if (theirResponse.equals("Good")) 
        System.out.println("Great! Glad to hear you're doing well.");    
    else if (theirResponse.equals("Bad")) 
        System.out.println("That's too bad, I'm sorry to hear that.");  
    else
        System.out.println("Sounds like a personal problem.");

    System.out.println("I know, let's play a game!");
    System.out.println("Would you like to? Y/N");
    String theirAnswer = input.next();

    if (theirAnswer.equals("Y")) {
        System.out.println("Great! Let's get started, shall we?");
    }
    else if (theirAnswer.equals("N")) {
        System.out.println("Bummer. Well, Goodbye.");
        input.close();      
    }
    else {
        System.out.println("Look, I'm not sure where to go with that.");        
        System.out.println("I'll assume you said yes.");
    }

    System.out.println("Think of a number between 0 and 10 " +
        "and I'll try to guess it!");
    
    while (true) {
        int guess = (int)(Math.random() * 11);
        System.out.println("Is the number " + guess + "?");
        System.out.println("Y/N");
        String newResponse = input.next();

        if (newResponse.equals("Y")) {
            System.out.println("Wohoo!");
            System.out.println("Better luck next time, Chump");
            return;
        }
        else {
            System.out.println("Drat. Let me guess again.");
        }
    }
      
  }
}

 
