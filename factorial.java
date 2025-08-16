import java.util.Scanner;

public class factorial {
    public static int fact(int a){
        int product = 1;
        if (a>0){
            for(int i=1;i<=a;i++){
                product *= i;
            }}
        else if(a==0){
            return 1;
        }
        else{
            return -1;
        }
        return product;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of number: "+ fact(a));
    }
}
