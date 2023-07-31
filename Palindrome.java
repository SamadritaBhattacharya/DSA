//import java.util.*;
  class Palindrome {
    int n;
 void get(){
    java.util.Scanner sc = new Scanner(System.in);
     System.out.println("enter a no to check");
    n= sc.nextInt();
     if(se(n))
         System.out.println("palindrome ");
     else
         System.out.println("not a palindrome ");
 }
 boolean se(int no){
     int cp=no; int rev= 0;
     while (cp>0){
         int dg= cp%10;
         rev= rev*10 + dg;
         cp/=10;
     }
     if (rev==no)
         return true;
     else
         return false;
     // checking for a palindrome number
 }

    public static void main(String[] args) {
       palindrome obj = new palindrome();
        obj.get();
    }
}
