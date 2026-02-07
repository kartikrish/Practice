
//Check voting eligibility

import java.util.*;
class vote{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int a = sc.nextInt();

        if(a >= 18){
            System.out.print("You are eligible for vote.");
        }else{
            System.out.print("You are not eligible for vote.");
        }
        sc.close();
    }
}
