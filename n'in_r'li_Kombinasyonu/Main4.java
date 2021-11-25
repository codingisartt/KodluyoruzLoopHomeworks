import java.util.Scanner;

public class Main4{
    public static void main(String[] args) {
        int N,r,faktN=1,faktr=1,faktNr=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir N değeri giriniz: ");
        N=input.nextInt();
        System.out.print("Bir r değeri giriniz: ");
        r=input.nextInt();

        for(int i=1;i<=N;i++){
            faktN*=i;
        }

        for(int j=1; j<=r; j++){
            faktr*=j;
        }

        for(int k=1; k<=N-r; k++){
            faktNr*=k;
        }

        int komb=faktN/(faktr*(faktNr));
        System.out.println("N'in r'li Kombinasyonu:"+komb);



    }
}