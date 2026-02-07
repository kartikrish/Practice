
//Check Positive , Negative or Zero

import java.util.*;
class checksign{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

    if(a > 0){
        System.out.print("The number " + a + " is Positive .");
    }else if( a == 0 ){ 
            System.out.print("The number " + a + " is Neutral .");
        
    }else{
        System.out.print("The number " + a + " is Negative .");
    }
    sc.close();
}
}




