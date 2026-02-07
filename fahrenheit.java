//Convertion of fahrenheit with user input
 
 import java.util.*;
 class fahrenheit{
    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Celsius : ");
            float c = sc.nextInt();

            float fahrenheit = 2*c +30;
            System.out.println("The Fahrenheit of the given Celsius : " + fahrenheit);
    sc.close();
}
 }
 
