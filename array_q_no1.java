import java.util.Scanner;
public class array_q_no1 {
    //Take an array as input from the user.Search for a given number X and print the index at which it occur
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for(int i=0;i<size;i++){
        number[i] =sc.nextInt();
        }
        int x=sc.nextInt(); // x as a input which we have to find
        //output
        for(int i=0; i<number.length;i++){
            if(number[i] == x){
            System.out.println("x found at index :"+i);
        }
        }
    }
}
