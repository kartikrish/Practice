 //Grade system using marks

import java.util.*;
class gradesystem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks between 1-100 :  ");
        int a = sc.nextInt();

        if (a >=85 && a <= 100){
            System.out.print("Grade A+");
        }else if(a >=70 && a < 85 ){
            System.out.print("Grade A");
        }else if(a >= 55 && a < 70){
            System.out.print("Grade B");
        }else if( a >= 40 && a < 55 ){
            System.out.print("Grade C");
        }else if(a >= 101){
            System.out.print("Enter the marks between 1 - 100 . Not exceed the marks");
        }else{
            System.out.print("Fail");
        }
    sc.close();
}
}
