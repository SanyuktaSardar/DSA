public class hw2 {
    public static void main(String[] args) {
        int numbers[] = {1,7,0,4,7};
        int max = 0;
        int min = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }

             if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("largest number is:"+max);
        System.out.println("Smallest number is:"+min);
    }
}
