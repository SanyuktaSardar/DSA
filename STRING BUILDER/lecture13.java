public class lecture13 {
    public static void main(String[] args) {
        //strings are immutable
        //data stored in the form of stacks and heap
        //The value of string store in heap and the variable store in stack that points the heap memory location
        //stringbuilder is faster than string as it is mutable
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        //set chat at index 0 
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //insert
        sb.insert(0, "T");
        System.out.println(sb);
        //delete
        sb.delete(0, 2);
        System.out.println(sb);
        //append
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append("e"); //str = str + 'e';
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);

        //length
        System.out.println(sb1.length());
        
    }
}
