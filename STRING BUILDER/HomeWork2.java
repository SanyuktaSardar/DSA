import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputemail = sc.next();
        StringBuilder email = new StringBuilder(inputemail);
        
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                System.out.println(email.substring(0, i));
                break;
            }
        }
    }
}
