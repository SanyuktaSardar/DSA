import java.util.*;
public class array2 {
    public static void main(String args[]){
        System.out.print("Enter the size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        for (int i=0;i<size;i++){
            int value = sc.nextInt();
            numbers[i] = value;
        }
        System.out.println("The Array:");
        for (int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
