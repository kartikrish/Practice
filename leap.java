
//Check Leap year

import java.util.*;
class leap{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int a = sc.nextInt();
        if(a % 4==0 || a % 100==0){
            System.out.print("It is a Leap year.");
        }else{
            System.out.print("It is not a Leap year.");
        }
        sc.close();
    }
}
