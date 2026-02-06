//Check Even or Odd
/*
import java.util.*;
class Basic{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number :  ");
     int a = sc.nextInt();

     if(a % 2 == 0){
        System.out.print("The number " + a + " is even. ");
     }else{
        System.out.print("The number " + a + " is Odd.");
     }
     sc.close();
    } 
}
*/
//Check Positive , Negative or Zero
/* 
import java.util.*;
class Basic{
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
*/
//Find largest of two numbers
/*
import java.util.*;
class Basic{
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
*/
//Find largest of three numbers
/* 
import java.util.*;
class Basic{
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
*/
//Check voting eligibility
/* 
import java.util.*;
class Basic{
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
*/
//Check Leap year
/* 
import java.util.*;
class Basic{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int a = sc.nextInt();
        if(a % 4==0 || a % 100==0){
            System.out.print("It is a Leap year.");
        }else{
            System.out.print("It is not a Leap year.");
        }
    }
}
*/
//Grade system using marks
/* 
import java.util.*;
class Basic{
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
*/
//Check pass or fail
/* 
import java.util.*;
class Basic{
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
*/
//Check divisible by 5 And 11
/* 
import java.util.*;
class Basic{
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
    */
//Electricity bill claculation
/* 
import java.util.*;
class Basic{
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
*/