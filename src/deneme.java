import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.print("bir deger giriniz=");
        int giris=input.nextInt();

        String sayi=Integer.toString(giris);
        StringBuffer a = new StringBuffer(sayi);
        System.out.println(a.reverse());
        int son=Integer.parseInt(String.valueOf(a));
        System.out.println("ters çevrilmiş hali="+son);
        if (son==giris) System.out.println("Bu Sayı polindrom bir sayıdır");
        else System.out.println("Bu sayı polindrom bir sayı degildir");
    }














}
