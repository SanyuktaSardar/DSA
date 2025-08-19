import java.util.*;
public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Enter original:");
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        StringBuilder sb = new StringBuilder(user);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
    }
}
