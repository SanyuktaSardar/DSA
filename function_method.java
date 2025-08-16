import java.util.*;
public class function_method{
    //returnType functionName(type arg1,type arg2){
   //operations
    //}
    //functionName should not be a keyword
    // type-> int,float,string
    //functions are stored in a stack

    public static void printMyName(String name){
        System.out.println(name);
        return;
    } 
    public static int CalculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Enter a name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); //calling function
        //sum of two numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("Sum of 2 numbers: "+sum);
    }
}