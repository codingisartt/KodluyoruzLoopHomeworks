import java.util.Scanner;

public class Ekok{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();
        
        int ebob=1;

        for(int k=n1;k>=1;k--){//another way
            if(n1%k==0 && n2%k==0){
                ebob=k;
                break;
            }
        }

        for(int i=1; i<=(n1*n2); i++){//ekok calculator
            if(i%n1==0 && i%n2==0){
                System.out.println("Ekok "+i);
                break;
            }
        }

        System.out.println("Sağlama: "+(n1*n2)/ebob);
        

    }
}