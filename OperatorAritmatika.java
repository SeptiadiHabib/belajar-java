/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;

public class OperatorAritmatika {
      public static void main(String[] args){
          int angka1;
          int angka2;
          int hasil;
          
          Scanner keyboard = new Scanner(System.in);
          
          System.out.print("Input Angka-1: ");
          angka1 = keyboard.nextInt();
          System.out.print("Input Angka-2: ");
          angka2 = keyboard.nextInt();
          
          //penjumlahan
          hasil = angka1 + angka2;
          System.out.println("Hasil = " + hasil);
          
          //pengurangan
          System.out.print("Input Angka-1: ");
          angka1 = keyboard.nextInt();
          System.out.print("Input Angka-2: ");
          angka2 = keyboard.nextInt();
          
          hasil = angka1 - angka2;
          System.out.println("Hasil = " + hasil);
          
          //perkalian
          System.out.print("Input Angka-1: ");
          angka1 = keyboard.nextInt();
          System.out.print("Input Angka-2: ");
          angka2 = keyboard.nextInt();
          
          hasil = angka1 * angka2;
          System.out.println("Hasil = " + hasil);
          
          //pembagian
          System.out.print("Input Angka-1: ");
          angka1 = keyboard.nextInt();
          System.out.print("Input Angka-2: ");
          angka2 = keyboard.nextInt();
          
          hasil = angka1 / angka2;
          System.out.println("Hasil = " + hasil);
          
          //sisa bagi
          System.out.print("Input Angka-1: ");
          angka1 = keyboard.nextInt();
          System.out.print("Input Angka-2: ");
          angka2 = keyboard.nextInt();
          
          hasil = angka1 % angka2;
          System.out.println("Hasil = " + hasil);
          
      }    
}
