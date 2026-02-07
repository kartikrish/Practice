//Print no. from 1 to n with user input
 
import java.util.*;
 class uptoN{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. that was print upto:");
        int n =sc.nextInt();
            for(int i =1; i<=n; i++){
                System.out.println(i);
            }

    sc.close();
    }
 }

