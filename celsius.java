//convertion of  celsius with user input

import java.util.*;
class celsius{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit : ");
        float f = sc.nextInt();
        
        float celsius = (f - 30)/2;
         System.out.println("The Celsius of given Fahrenheit :  " + celsius);
    sc.close();
}
}
  