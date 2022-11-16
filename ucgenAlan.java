import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args){

        System.out.println("Üçgen alanı hesaplama");

        double kenar1, kenar2, kenar3, alan, cevre, u;
        Scanner input = new Scanner(System.in);
        System.out.println("A kenarını giriniz :");
        kenar1 = input.nextInt();
        System.out.println("B kenarını giriniz :");
        kenar2 = input.nextInt();
        System.out.println("C kenarını giriniz :");
        kenar3 = input.nextInt();

        u = ((kenar1+kenar2+kenar3)/2);
        cevre = (2*u);
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçcenin Alanı="+alan);
        System.out.println("Üçgenin çevresi="+cevre);



    }

}
