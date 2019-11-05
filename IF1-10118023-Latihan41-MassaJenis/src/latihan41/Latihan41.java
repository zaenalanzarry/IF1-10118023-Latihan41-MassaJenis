/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan41;
import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Massa Jenis
 */

public class Latihan41 {

    public static void main(String[] args) {
        MassaJenis msJenis = new MassaJenis();
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("======MASSA JENIS KUBUS======");
        System.out.print("Sisi : ");
        msJenis.setSisi(input.nextInt()) ;
        
        System.out.print("Massa : ");
        msJenis.setMassa(input.nextInt());
        
        //output
        System.out.println("");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + msJenis.hitungVolume(msJenis.getSisi()));
        System.out.println("Massa Jenis : " +
                msJenis.hitungMassaJenis(msJenis.getMassa(), msJenis.hitungVolume(msJenis.getSisi())));
        
    }
    
}
