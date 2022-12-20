/**
 *
 * @author soyka
 */
public class UygulamaBes {
 public static void main (String[] args)  {
  int sayi = 50;
  int kalan = sayi % 12;
  switch(kalan) {
      case 0 :
          System.out.println("çift");
          break;
      case 1 : System.out.println("TEK");break;
  }
 }
}
