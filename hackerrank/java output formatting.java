import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
            System.out.print(s1);
            if(s1.length()<15){
                int a=15-s1.length();
                while(a>0){
                    System.out.print(" ");
                    a--;
                }
            }
            if(x<10)
            System.out.println("00"+x);
            else if(x<100)
            System.out.println("0"+x);
            else
            System.out.println(x);
          
          
            }
            System.out.print("================================");

    }
}



