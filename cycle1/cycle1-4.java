import java.util.*;

import javax.lang.model.util.ElementScanner6;
class  prime
     {
         public static void main(String args[])
               {
                   int flg=0,i;
                   Scanner obj=new Scanner(System.in);
                   System.out.println("enter the digit");
                   int n=obj.nextInt();
                   if(n==1)
                      System.out.println("not prime");
                   else if(n==2)
                      System.out.println("prime");   
                   else  
                       {
                           for(i=2;i<=n/2;i++)
                               if(n%i==0)
                                  {
                                      flg=1;
                                      break;
                                  }
                            if(flg==0)
                            System.out.println("prime");
                            else 
                            System.out.println("not prime");        

                        
                      
                       }
               }
     }