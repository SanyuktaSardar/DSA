import java.util.*;
public class lecture12 {
    public static void main(String args[]){
        //String declaration
        String name = "Sanyukta";
        System.out.println(name);
        String fullname = "Sanyukta Sardar";
        System.out.println(fullname);
        //user input
        //single word next() 
        //for line nextLine()
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println(str1);

        //concatenation
        String firstName = "Sanyukta";
        String lastName = "Sardar";
        fullname = firstName + " "+ lastName;
        System.out.println(fullname);

        //length
        System.out.println(fullname.length());
        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //compare
        String name1= "Tony";
        String name2 = "Tony";

        //compare ascii value
        //1 s1> s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1< s2: -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        //compare objects
        if(new String("Tony")==new String("Tony")){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        //substring
        String sentence = "My name is Tony";
        String namevalue = sentence.substring(11,sentence.length());
        System.out.println(namevalue);

        //Strings are immutable
    } 
}
