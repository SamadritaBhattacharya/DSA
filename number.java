adding a source of java for checking of a unique no 
// unique numbers within range
import java.util.*;
class Unique 
{   private int m,n;
    Scanner sc = new Scanner (System.in);
    public void get()
    {   System.out.print("INPUT:    m=");
        m=sc.nextInt();
        System.out.print("\t n=");
        n= sc.nextInt();System.out.println();
        if(m<=99 ||m>=1000 || n<=99 ||n>=1000 || m>=n)
        {   System.out.println("OUTPUT: INVALID INPUT "); System.exit(0);
        }
        String t=""; int c=0;
        for(int i=m;i<=n;i++)
        { if(isUnique(i))
           { t+=""+i+" ,"; c++;}
        }
        if(c>0)
        System.out.println("OUTPUT: THE UNIQUE DIGIT NUMBERS ARE: \n \t"+ t.substring(0,t.length()-1));
        else
         System.out.println("OUTPUT: THE UNIQUE DIGIT NUMBERS ARE: NIL");
         System.out.println();
          System.out.println("\t FREQUENCY OF UNIQUE DIGIT NUMBERS IS :" +c);
        }
      boolean isUnique(int a)
    {  String s= Integer.toString(a);
         for(int i=0;i<s.length();i++)
        {   if(s.indexOf(s.charAt(i),i+1)>=0)
            return false;
        }   //return true;
        return true;
        
    }  // checking for unique number
    public static void main(String args[])
    {   Unique obj = new Unique();
        obj.get();
    }
}
