import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        n=scan.nextInt();
        
        System.out.println("4ün kuvvetleri: ");
        for(int i=1; i<n; i*=4){
            System.out.println(" * "+i);            
        }
        System.out.println("5in kuvvetleri: ");
        for(int j=1; j<n; j*=5){
            System.out.println(" * "+j);
        }
    }
}