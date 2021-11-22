import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i,n,toplam=0,s=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n=scan.nextInt();
        
        for(i=1; i<n; i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                s++;
            }
        }
        double average=toplam/s;
        System.out.println("Ortalama: "+average);
    }
}
