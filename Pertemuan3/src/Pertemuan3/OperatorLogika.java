/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

public class OperatorLogika {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c;
        
        //konjungsi (dan)
        c = a && b;
        System.out.println("true && false = "+c);
        
        //disjungsi (atau)
        c = a || b;
        System.out.println("true || false = "+c);
        
        //negasi (bukan)
        System.out.println("negasi, !true = " + !a);
        
    }
    
}
