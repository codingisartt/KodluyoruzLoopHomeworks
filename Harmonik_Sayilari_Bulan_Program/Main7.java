import java.util.Scanner;

public class Main7{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int N=input.nextInt();
        double result=0;
        for(double i=1; i<=N; i++){
            result+=(1/i);
        }
        System.out.println(result);
    }
}