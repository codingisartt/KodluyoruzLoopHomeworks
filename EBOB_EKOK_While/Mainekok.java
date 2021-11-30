import java.util.Scanner;

public class Mainekok{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,ekok;
        System.out.print("a sayısı: ");
        a=input.nextInt();
        System.out.print("b sayısı: ");
        b=input.nextInt();
        ekok= (a > b) ? a : b;
 
        while(true)
        {
            if( ekok % a == 0 && ekok % b == 0 )
            {
                System.out.printf("%d ve %d sayılarının EKOK'u %d bulunmuştur.", a, b, ekok);
                break;
            }
            ++ekok;
        }
    }
}