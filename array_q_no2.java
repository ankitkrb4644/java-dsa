import java.util.Scanner;
public class array_q_no2 {
    public static void main(String[] args) {
        //take an array as input from the user.Search for a given x and print the index at which it occurs.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i=0;i<size; i++){
            numbers[i] = sc.nextInt(i);
        }
        //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
