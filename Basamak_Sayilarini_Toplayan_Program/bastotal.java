import java.util.Scanner;


public class bastotal{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        int total=0,counter=0;


        while (number != 0) {
            total = (number % 10)+total;
            number /= 10;
            counter++;
        }

        
        System.out.println(total);



    }
}