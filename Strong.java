import java.util.*;
class Strong 
{

    static int fact(int n)//finding a factorial of the individual digits 
    {
      return (n==1 || n==0 ?1:n*fact(n-1));

    }


     public boolean Strong(int N)
     {
       
        int rem,Sum=0,temp;
        temp=N;
        while(temp!=0)
        {
            rem=temp%10;
            if(rem>=0)
            {
            Sum=Sum+fact(rem);// summation of the factorial of individual digits 
            temp=temp/10;
            }
         }
        
        return  (Sum==N);


     }


     public static void main (String argsp[])
     {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter a number");
         int Num=sc.nextInt();
         Strong obj=new Strong();
         boolean b=obj.Strong(Num);
         System.out.println(b);
         

     }
}
