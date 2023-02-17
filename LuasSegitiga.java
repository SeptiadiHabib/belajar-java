/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;

public class LuasSegitiga {
    
    public static void main(String[] args){
        Double luas;
        int alas, tinggi;
        
        Scanner baca = new Scanner(System.in);
        
        System.out.println("== Program Hitung luas Segitiga ==");
        System.out.print("Input Alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi :");
        tinggi = baca.nextInt();
        
        luas = Double.valueOf((alas * tinggi) / 2);
        
        System.out.println("Luas =" + luas);
        
        
    }
}
