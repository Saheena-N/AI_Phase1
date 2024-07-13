import java.util.*;
import java.lang.String;
class Exception_handling 
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      String str=obj.nextLine();
      int c=0,b=0;
      try
      {
          for(int i=0;i<str.length();i++)
          {
              char v=str.charAt(i);
              if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
              c++;
          }
          if(c>=1)
          System.out.print("String contains vowels");
          else
          System.out.printf("%d",c/b);
      }
      catch(Exception e)
      {
          System.out.print("Error: String does not contain any vowels");
      }
    }
}
