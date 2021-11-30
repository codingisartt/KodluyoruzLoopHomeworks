import java.util.Scanner;

public class MinMax{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int adet=input.nextInt();
        int maks=0,min=0;
        int i,sayi;
        do{
            for(i=1;i<=adet;i++){
                System.out.print((i)+". Sayıyı giriniz: ");
                sayi=input.nextInt();

                if (i==1){
                maks=sayi;
                min=sayi;
                }
            
                if (sayi>maks)
                maks=sayi;
            
                if (sayi<min)
                min=sayi;
            }
                  
        }while(i==adet);
        System.out.println("En büyük sayı: "+maks);
        System.out.println("En küçük sayı: "+min);
 
    
    }
}