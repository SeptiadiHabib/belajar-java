/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.Scanner;

public class LampuLalulintas {
    
    public static void main(String[] args){
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input Nama Warna: ");
        lampu = scan.nextLine();
        
        switch (lampu){
            case "merah":
                System.out.println("Lampu Merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Hati-Hati!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, Jalan!");
                break;
            default:
                System.out.println("warna lampu salah");
                
        }
        
    }
    
}
