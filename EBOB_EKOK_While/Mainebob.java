import java.util.Scanner;

public class Mainebob {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,ebob;
        System.out.print("a sayısı: ");
        a=input.nextInt();
        System.out.print("b sayısı: ");
        b=input.nextInt();
        ebob= (a > b) ? a : b;

        while(true)
        {
            if( a % ebob == 0 && b % ebob == 0 )
            {
                System.out.printf("%d ve %d sayılarının EBOB'u %d bulunmuştur.", a, b, ebob);
                break;
            }
            --ebob;
        }
    }
}
