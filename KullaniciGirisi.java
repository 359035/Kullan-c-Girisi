/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanicigirisi;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;

public class KullaniciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kullaniciAdi,sifre;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Kullan�c� Ad�n� Giriniz:");
        kullaniciAdi=input.nextLine();
        
        System.out.print("�ifrenizi Giriniz:");
        sifre=input.nextLine();
        
        if((kullaniciAdi.equals("patika"))&&(sifre.equals("java123"))){
            System.out.println("Giri� Yapt�n�z");
        }else{
            System.out.println("Giri� Yapamad�n�z");
            
       }
    }
}
                    