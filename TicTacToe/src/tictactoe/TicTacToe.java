package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> Player1 = new ArrayList<Integer>();
    static ArrayList<Integer> Player2 = new ArrayList<Integer>();

    public static String kazananKontrol() {

        List ustSatir = Arrays.asList(7, 8, 9);
        List ortaSatir = Arrays.asList(4, 5, 6);
        List altSatir = Arrays.asList(1, 2, 3);
        List ilkSutun = Arrays.asList(7, 4, 1);
        List ikinciSutun = Arrays.asList(8, 5, 2);
        List ucuncuSutun = Arrays.asList(9, 6, 3);
        List capraz1 = Arrays.asList(7, 5, 3);
        List capraz2 = Arrays.asList(9, 5, 1);
        
        List <List> kazanma = new ArrayList<List>();
        kazanma.add(ustSatir);
        kazanma.add(ortaSatir);
        kazanma.add(altSatir);
        kazanma.add(ilkSutun);
        kazanma.add(ikinciSutun);
        kazanma.add(ucuncuSutun);
        kazanma.add(capraz1);
        kazanma.add(capraz2);
        
        for(List l: kazanma){
            if(Player1.containsAll(l))
                return "Oyuncu 1 Kazandı !";
            else if(Player2.containsAll(l))
                return "Oyuncu 2 Kazandı !";
            else if(Player1.size() + Player2.size() == 9)
                return "Berabere";
                
            
        }

        return "";
    }

    public static void tabloOlustur(char[][] tablo) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablo[i][j]);

            }
            System.out.println();
        }
        System.out.println("**************");

    }

    public static void hamleYap(char[][] tablo, int hamle, String sembol) {

        char harf = ' ';
        if (sembol.equals("Oyuncu1")) {
            harf = 'X';
            Player1.add(hamle);
        } else if (sembol.equals("Oyuncu2")) {
            harf = 'O';
            Player2.add(hamle);
        }

        switch (hamle) {
            case 7:
                tablo[0][0] = harf;
                break;

            case 8:
                tablo[0][2] = harf;
                break;

            case 9:
                tablo[0][4] = harf;
                break;

            case 4:
                tablo[2][0] = harf;
                break;

            case 5:
                tablo[2][2] = harf;
                break;

            case 6:
                tablo[2][4] = harf;
                break;

            case 1:
                tablo[4][0] = harf;
                break;

            case 2:
                tablo[4][2] = harf;
                break;

            case 3:
                tablo[4][4] = harf;
                break;
            default:
                System.out.println("Yanlış hamle girdin.");
                break;
        }
        tabloOlustur(tablo);
    }

    public static void main(String[] args) {

        System.out.println("X O X Oyununa Hoş Geldiniz");
        System.out.println("**************************");

        char[][] tablo = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

        tabloOlustur(tablo);

       

        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        while (true) {
            System.out.println("1.Oyuncu hamle yap:");
            int hamle1 = scn1.nextInt();
            while(Player1.contains(hamle1) || Player2.contains(hamle1)){
                System.out.println("Başka yer seçiniz.");
                hamle1 = scn1.nextInt();
            }
            hamleYap(tablo, hamle1, "Oyuncu1");
            tabloOlustur(tablo);
            
            String str = kazananKontrol();
            if(str.length() > 0) {
               System.out.println(str);
               break;
           }
            

            System.out.println("2.Oyuncu hamle yap:");
            int hamle2 = scn2.nextInt();
            while(Player1.contains(hamle2) || Player2.contains(hamle2)){
                System.out.println("Başka yer seçiniz.");
                hamle2 = scn2.nextInt();
            }
            hamleYap(tablo, hamle2, "Oyuncu2");
            tabloOlustur(tablo);
            
           str = kazananKontrol();
           if(str.length() > 0) {
               System.out.println(str);
               break;
           }
            
 
           
        }

    }
}
