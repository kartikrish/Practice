import java.util.*;
class areavote{
 public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter your  age: ");
int a = sc.nextInt();
sc.nextLine();
System.out.println("Enter your state: ");
String b = sc.nextLine();
String c = "bihar";
if(a >= 18){
    if( b.equals(c)){
        System.out.println("you are eligible.");
        
    }else{
        System.out.println("your place not matched .");
    }
    
}else{
    System.out.println("You are not eligible.");
}
 }   
}