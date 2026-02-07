//Check pass or fail

import java.util.*;
class passfail{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter your marks : ");
    int a = sc.nextInt();

    if(a >= 35){
        System.out.print("You are Pass.");
    }else{
        System.out.print("You are Fail.");
    }
    sc.close();
    }
}

