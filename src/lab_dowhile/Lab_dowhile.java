
package lab_dowhile;
import java.util.Scanner;
public class Lab_dowhile {

    public static void main(String[] args) {
       String jawab;
       Scanner scanner = new Scanner(System.in);
       int nom1,nom2;
       
       do{
           System.out.println("Nombor pertama:");
           nom1=scanner.nextInt();
           System.out.println("Nombor kedua:");
           nom2=scanner.nextInt();
           System.out.println("Hasil darab:"+nom1+"x"+nom2+"="+Math.abs(nom2*nom1));
           System.out.println("Taipkan Y untuk teruskan ...");
           jawab=scanner.next();
           
       }while(jawab.equals("Y"));
       
    }
    
}
