// Square and Cube program with user input
 
import java.util.*;
class squareorcube{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int s = a*a;
        int c = a*a*a;
        System.out.println("Square of the number: " + s + "\nCube of the number : " + c);
    sc.close();
    }
}  
    
