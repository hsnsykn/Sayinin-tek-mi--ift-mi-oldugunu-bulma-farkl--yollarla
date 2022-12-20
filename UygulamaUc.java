
/**
 *Birler basamağına göre tek çift
 * @author soyka
 */
public class UygulamaUc {
public static void main (String [] args){
 int sayi = 188 ;   
int b =sayi % 10  ;
System.out.println("Birler basamağı  =" + b);
if (b==0 || b==2 || b == 4 || b== 8 ) {
   System.out.println("ÇİFT");
} else {
 System.out.println("TEK");
}
}
}