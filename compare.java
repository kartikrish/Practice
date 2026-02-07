//Find largest of two numbers

import java.util.*;
class compare{
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the First number : ");
     int a = sc.nextInt();
     System.out.print("Enter the Second number : ");
     int b = sc.nextInt();

     if(a > b){
     System.out.print("First Number " + a + " is larger then Second Number " + b  );
     }else if(a < b){
     System.out.print("First Number " + a + " is smaller then Second Number " + b );
     } else{
     System.out.print("Both number.. This  " + a + " and This " + b + " are same.");
     }
     sc.close();
    }
}
