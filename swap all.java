//Even Odd program with user input
/* 
import java.util.*;

class practice{
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter a number to check even or odd: ");
         int num =sc.nextInt();
            if(num%2 ==0){
                System.out.println("The number" + num + " is even.");
            }else{
                System.out.println("The number " + num + " is odd. ");
            }
    }
}
*/
//Print no. from 1 to n with user input
/* 
import java.util.*;
 class practice{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. that was print upto:");
        int n =sc.nextInt();
            for(int i =1; i<=n; i++){
                System.out.println(i);
            }


    }
 }

*/
//Basic arithmetic operations with user input
/* 
import java.util.*;
class practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a =sc.nextInt();
        System.out.println("Enter second number:");
        int b =sc.nextInt();
      
        int sum = a+ b;
        int diff = a-b;
        int prod = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("The evalution of the two number is : \n "  + " Sum = "+ sum +  " \nDiff =  "+ diff  +  "\nProduct = "+ prod + "\nDiv = "+ div  + "\nModulas = "+mod);



    }
}
*/
//Swap program using third variable with user input
/* 
import java.util.*;
 class practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a = sc.nextInt();
        System.out.println("Enter second no. :");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a =b;
        b=temp;
        System.out.println("After swappuing both no. : \n" + "First no. = \n" + a + "\n Second no. : \n" + b);

    }
 }
*/
//Swap program without using third variable
/* 
class practice{
    public static void main(String [] args){

        int a = 156;
        int b = 2569;
         a= a+ b;
         b = a-b;
         a= a-b;
         System.out.println("After swap :\n" + "A= " + a + "\n B = " + b ); 

        }
}
        */
//Swap program without using third variable with user input
/* 
import java.util.*;
class practice{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. :");
        int b = sc.nextInt();
         a = a+b;
         b =a-b;
         a= a-b;
         System.out.print("After swap : \n" + "A = " + a + "\nB= " + b );
        
    }
}
*/
 // Square and Cube program with user input
 /* 
import java.util.*;
class practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int square = a*a;
        int cube = a*a*a;
        System.out.println("Square of the number: " + square + "\nCube of the number : " + cube);
    }
}  
    */

//convertion of  celsius with user input
/* 
import java.util.*;
class practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit : ");
        float f = sc.nextInt();
        
        float celsius = (f - 30)/2;
         System.out.println("The Celsius of given Fahrenheit :  " + celsius);
    }
}
    */
//Convertion of fahrenheit with user input
 /*
 import java.util.*;
 class practice{
    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Celsius : ");
            float c = sc.nextInt();

            float fahrenheit = 2*c +30;
            System.out.println("The Fahrenheit of the given Celsius : " + fahrenheit);
    }
 }
 */
//Calculate Simple interest with user input
/* 
import java.util.*;
class practice{
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Simple Interest program :-" );
     System.out.print(" Enter the Principle : " );
     float p = sc.nextInt();
     System.out.print(" Enter the Rate : " );
     float r = sc.nextInt();
     System.out.print("Enter the Time : ");
     float t = sc.nextInt();

     float si = (p*r*t)/100;
     System.out.println("Simple interest of the given Pricnciple , Rate ,Time :   " + si);

    }
}
*/
//Area of Rectangle 
/* 
import java.util.*;
class practice{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        float b = sc.nextInt();

        float area = l*b;

    System.out.print("Area of the reactangle : " + area + "m");

    }
}
*/
//Area of circle
/* 
import java.util.*;
class practice{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :  ");
        float r = sc.nextInt();

        double area = 3.14*r*r;
        System.out.print("Area of the circle:  " + area);
    }
}
    */
// Area of Square
/* 
import java.util.*;
class practice{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        float s = sc.nextInt();
         
        float area = s * s;
        
        System.out.print("Area of the Square :  " + area);
    }
}
    */
//Print Hello World !!..
/* 
class practice{
    public static void main(String [] args){
        System.out.print("Hello World !!..");
    }
}
    */
//Greeting with user name
/* 
import java.util.*;
class practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Name :  ");
        String i = sc.nextLine();

        System.out.print("Hello " + i);
        System.out.println("\nWhat is your age ? \n");
        int a = sc.nextInt();
        System.out.println("Oh great now you are adult");
          String l = sc.nextLine();
        System.out.println("Where you live now ? \n"+ l  );
      
        System.out.println("\nI see ");
        sc.close();

    }
}
*/