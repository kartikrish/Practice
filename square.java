// Area of Square

import java.util.*;
class square{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        float s = sc.nextInt();
         
        float area = s * s;
        
        System.out.print("Area of the Square :  " + area);
    sc.close();
    }
}
    