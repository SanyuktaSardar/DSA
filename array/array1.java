//Non primitive data type
public class array1 {
    public static void main(String args[]){
        // int age = 18;
        // int english = 95;
        // int physics = 97;
        // type[] arrayname = new type[size];

        // int[] marks = new int[3];
        int marks[] = new int[3];
        
        // int marks[] = {97,98,95};
        
        // index starts from 0
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

       for(int i=0;i<3;i++)
       {
        System.out.println(marks[i]);
       }
    }
}
