import java.util.*;
class array_2D
{
    public static void main(String args[])
    {
        // type[][] arrayName = new type[rows][columns];
        // int[][] numbers = new int[3][5];
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols= sc.nextInt();

        int[][] numbers = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter row:"+i+" cols:"+j);
                numbers[i][j] = sc.nextInt();

            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}