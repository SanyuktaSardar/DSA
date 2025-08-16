import java.util.*;
public class multiply {
    public static int calculateMultiplication(int a,int b)
    {
        int answer = a*b;
        return answer;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int multi = calculateMultiplication(x, y);

        System.out.println("The answer of the mulplication: "+ multi);
    }
}
