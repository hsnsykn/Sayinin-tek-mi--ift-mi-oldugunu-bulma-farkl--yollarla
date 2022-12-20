
/**
 *Mod almadan tek çift bulmak
 * @author soyka
 */
public class UygulamaDort {
 public static void main (String[]args )  {
 int sayi = 11; 
 System.out.println("Sayi =" + sayi);
int bolum = sayi / 2;
System.out.println("Bölüm =" + bolum);
int carpim = bolum * 2 ;
System.out.println("Çarpim =" + carpim);
if (carpim != bolum ) {
  System.out.println("TEK");
} else {
   System.out.println("ÇİFT");
}
 } 
}
