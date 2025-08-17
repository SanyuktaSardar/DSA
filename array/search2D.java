import java.util.*;
public class search2D {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows = sc.nextInt();
        System.out.print("Enter cols:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter row:"+i+" cols:"+j);
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to find: ");
        int searchElement = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if( numbers[i][j] == searchElement){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
