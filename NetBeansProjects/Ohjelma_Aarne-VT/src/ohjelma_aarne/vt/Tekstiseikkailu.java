/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjelma_aarne.vt;

import java.util.Scanner;

/**
 *
 * @author guest-ocwcam
 */
public class Tekstiseikkailu {
    public static void main(String[] args) {
   Scanner lukija = new Scanner(System.in);
   System.out.println("Kerro nimesi: ");
   String nimi = lukija.nextLine();
   System.out.println("Anna ikäsi: ");
   int ika = Integer.parseInt(lukija.nextLine());
   System.out.println("Tervehdys sinulle " + nimi + ". " + ika + " söis olla" + ika);
   
    }
    
}
    

