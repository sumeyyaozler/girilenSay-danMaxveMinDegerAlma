import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayiAdeti,max=1,min=1,sayi;
        Scanner input= new Scanner(System.in);
        System.out.print("pls enter numbers:");
        sayiAdeti =input.nextInt();

        for(int i=1;i<=sayiAdeti;i++) {
            System.out.print(i+ ". number :");
            sayi = input.nextInt();

            if (i == 1) {
                min = sayi;
                max= sayi;


            } else if (sayi > max) {
               max=sayi;
            } else if (sayi < min) {
                min=sayi;

            }
        }
        System.out.println("maximum number :" +max);
        System.out.println(" minimum number  :" + min);

        }
    }
