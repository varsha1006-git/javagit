package newjava.folder;
import java.util.*;
public class salary 
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary: ");
        float a = input.nextFloat();
        if(a<=10000){
            a+=2000;

        }
        else if (a>10000 && a<=20000){
            a+=1000;
        }
        else{
            a+=500;
        }
        System.out.println("your increased salary is : " +a);
   } 
}
