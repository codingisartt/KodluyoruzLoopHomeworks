import java.util.Scanner;

public class Asal2 {
    public static void main(String[] args) {
    System.out.print("Bir sayı giriniz: ");
    Scanner scan = new Scanner(System.in);
    int sayi= scan.nextInt();
    int sayac=0;
    int i;
 
    for(i=1; i<=sayi; i++) {
    if(sayi%i==0) sayac++; 
    }
    if(sayac==2) {
    System.out.println(sayi+" asaldır.");
     }else{
    System.out.println(sayi+" asal değildir.");
    }
    }
}
