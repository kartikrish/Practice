//Area of Rectangle 
 
import java.util.*;
class rectangle{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        float b = sc.nextInt();

        float area = l*b;

    System.out.print("Area of the reactangle : " + area + "m");
sc.close();
    }
}
