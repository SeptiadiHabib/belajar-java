/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args){
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Total Belanja : RP ");
        belanja = scan.nextInt();
        
        if ( belanja > 100000 ){          
            System.out.println("Selamat, anda mendapatkan hadiah!");
        } 
        
        System.out.println("Terima Kasih...");
    }
    
}
