import java.util.Scanner;

public class Main5{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n, k,total=1;
        System.out.print("Üssü alınacak sayı: ");
        n=input.nextInt();
        System.out.print("Üs olan sayı: ");
        k=input.nextInt();

        for(int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("Sonuç: "+total);


    }
}