//Greeting with user name
 
import java.util.*;
class greetings{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Name :  ");
        String i = sc.nextLine();
          sc.nextLine();
        System.out.print("Hello " + i);
        System.out.println("\nWhat is your age ? \n");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Oh great now you are adult");
          sc.nextLine(); // consume leftover newline after nextInt()
        
        System.out.println("Where you live now ? \n");
      String l = sc.nextLine();
        System.out.println("\nI see ");
        sc.close();

    }
}
