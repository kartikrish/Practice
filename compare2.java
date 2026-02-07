//Find largest of three numbers

import java.util.*;
class compare2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the First no. : ");
    int a = sc.nextInt();
    System.out.print("Entr the Second no. : ");
    int b = sc.nextInt();
    System.out.print("Enter the Third no. : ");
    int c = sc.nextInt();

    if(a >= b && a >= c){
        System.out.print("First no. " +a + " is larger then Second no. " + b + " and Third no. " + c);
    }else if( b >= a && b >= c){
        System.out.print("Second no. " + b + " is larger then First no. " + a + " and Third no. "+ c);
    }else{
        System.out.print("Third no. " + c + " is larger then First no. " + a + " and Second no. " +b);
    }
    sc.close();

    }
}
