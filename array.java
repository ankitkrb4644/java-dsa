import java.util.Scanner;
public class array{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    arr[0]=1;
    arr[1]=13;
    arr[2]=41;
    arr[3]=34;
    arr[4]=25;//it will save as [1,13,41,34,25]
    System.out.println(arr[4]);
    //input using for loops
    for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    // way 1 to print an array
    // for(int j : arr){
    //     System.out.print(j + " ");
    // }
    // way 2 to print an array
    // for(int num : arr){                      //for every element in array , print the element
    //     System.out.println(num + " ");       //here num represents element of the array
    // }
    }
}