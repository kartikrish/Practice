//Basic arithmetic operations with user input
 
import java.util.*;
class arithmetic{
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

    sc.close();


    }
}
