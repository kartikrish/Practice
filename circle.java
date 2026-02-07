//Area of circle

import java.util.*;
class circle{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :  ");
        float r = sc.nextInt();

        double area = 3.14*r*r;
        System.out.print("Area of the circle:  " + area);
    sc.close();
}
}
    
