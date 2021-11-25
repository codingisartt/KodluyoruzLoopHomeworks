import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        int n,total=0;
        Scanner scan=new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz: ");
            n=scan.nextInt();
            if(n%2==0 &&  n%4==0){
                total+=n;
            }

        }while(n%2==0);
        System.out.println("Toplam:" +total);

    }
}
