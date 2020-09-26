/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anıl
 */
public class TasKagitMakas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TAŞ KAĞIT MAKAS OYUNU
        
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        String hamlePc;
        int hamleInsan;
        int skorBilgisayar = 0,skorInsan = 0;

        while (skorBilgisayar != 3 && skorInsan != 3) {
            System.out.println("Bir hamle yapınız: 1(Taş), 2(Kağıt), 3(Makas), 4(Çıkış)");
            hamleInsan = scn.nextInt();

            int game = (1 + rnd.nextInt(3));

            if (hamleInsan == 1) {
                System.out.println("Taşı seçtin");
                if (game == 1) {
                    System.out.println("Berabere");
                } else if (game == 2) {
                    System.out.println("Bilgisayar Kağıt Seçti.Bilgisayar kazandı.");
                    skorBilgisayar++;
                    System.out.println("Sen:" +skorInsan+"-"+skorBilgisayar+ ":Bilgisayar");
                } else {
                    System.out.println("Bilgisayar makası seçti.Sen kazandın.");
                    skorInsan++;
                    System.out.println("Sen:" +skorInsan+"-"+skorBilgisayar+ ":Bilgisayar");
                }
            } 
            
            else if (hamleInsan == 2) {
                System.out.println("Kağıdı seçtin");
                
                if (game == 1) {
                    System.out.println("Bilgisayar taşı seçti.Sen kazandın.");
                    skorInsan++;
                    System.out.println("Sen:" +skorInsan+"-"+skorBilgisayar+ ":Bilgisayar");
                } else if (game == 2) {
                    System.out.println("Berabere.");
                } else {
                    System.out.println("Bilgisayar makası seçti.Bilgisayar kazandı");
                    skorBilgisayar++;
                    System.out.println("Sen:" +skorInsan+"-"+skorBilgisayar+ ":Bilgisayar");
                
                }
                
            } 
            
            else if (hamleInsan == 3) {
                System.out.println("Makası seçtin");
                
                if (game == 1) {
                    
                    System.out.println("Bilgisayar taşı seçti.Bilgisayar kazandı.");
                    skorBilgisayar++;
                    System.out.println("Sen:" +skorInsan+"-"+skorBilgisayar+ ":Bilgisayar");
                } else if (game == 2) {
                    System.out.println("Bilgisayar makası seçti.Sen kazandın");
                    skorInsan++;
                    System.out.println("Sen:" +skorInsan+"-"+skorBilgisayar+ ":Bilgisayar");
                } else {
                    System.out.println("Berabere.");
                 
                }
            }
            else{
                System.out.println("Geçersiz hamle program kapanıyor");
                break;
            }
                
        }
    }
    
}
