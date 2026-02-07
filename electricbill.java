//Electricity bill claculation

import java.util.*;
class electricbill{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter yor electricity unit : ");
        float a = sc.nextInt();

        if(a <= 125){
            System.out.print("Your electricity bill is 0rs.");
        }else if(a > 125 && a <= 400){
            float saill = (a - 125) *9;
             System.out.print("Your electricity bill is  "+ saill + "rs");
        }else if ( a > 400 && a <= 600 ){
            float bill = (175 *9) + (a - 400)* 11;
            System.out.print("Your electricity bill is " + bill + "rs" );
        }else {
            System.out.print("Exceeded input. Please enter as for a house consumption.");
        }

        sc.close();
    }
}
