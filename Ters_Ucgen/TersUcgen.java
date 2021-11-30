import java.util.Scanner;

public class TersUcgen{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=input.nextInt();

        for(int i=0;i<a;i++){
            for(int j=0;j<=i ;j++){
                System.out.print(" ");
            }
            for(int k=(2*a-1); k>=(2*i+1);k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
         

    }
}