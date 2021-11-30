import java.util.Scanner;

public class Mukemmel{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Bir sayı giriniz: ");
        a=input.nextInt();
        int total=0;

        for(int i=1; i<a; i++){
            if(a%i==0){
                total+=i;
            }
        }
        String str=(a == total) ? "Mükemmel sayıdır" :"Mükemmel sayı değildir";
        System.out.println(a+" "+str);

    }
}