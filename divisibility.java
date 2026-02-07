//Check divisible by 5 And 11

import java.util.*;
class divisiblity{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print( " Enter the no. to check divisible by 5 and 11 : ");
        int a = sc. nextInt();

    
        if(a % 5 ==0 && a % 11 ==0){
            System.out.print("Yes, It is divisible by both no. 5 and 11. ");
    }else if(a % 5 ==0 ){
            System.out.print("Yes, It is divisible by 5. ");
        }else if (a % 11 ==0){
            System.out.print("Yes, It is divisible by 11.");
        }else{
            System.out.print("The no. is not divisible by both no. 5 and 11.");
        }
        sc.close();
    }
}
    