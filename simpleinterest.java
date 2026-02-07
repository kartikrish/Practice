//Calculate Simple interest with user input
 
import java.util.*;
class simpleinterest{
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
    sc.close();
    }
}
