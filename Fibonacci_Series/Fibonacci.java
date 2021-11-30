import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int firstTerm =  0, secondTerm = 1, nextTerm,n;
        System.out.print("Fibonacci Series number of terms: ");
        n=input.nextInt();  
        nextTerm = firstTerm + secondTerm; 

        for(int i=0; i<=n; i++){
            System.out.print(firstTerm + " ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}