import java.util.*;
public class ArrayMultiplier 
{
    public static void main(String[] args)
    {
        int index=0,product=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int arrayLength=sc.nextInt();
        int [] numberArray=new int[arrayLength];   
        
        for(index=0;index<arrayLength;index++)
        {
            numberArray[index]=sc.nextInt();
            product=product*numberArray[index];
        }

        System.out.println(product);


    }
}
