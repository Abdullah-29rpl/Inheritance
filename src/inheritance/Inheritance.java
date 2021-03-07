/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author apple
 */
//parent class
public class Inheritance {

    Scanner input = new Scanner (System.in);
    //variable instance
    public int Bilangan1;
    public int Bilangan2;
    public int hasil;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Subclass1 class1 = new Subclass1();//objek subclass1
        Subclass2 class2 = new Subclass2();//objek subclass1
        //tampilan
        System.out.println(" Menu Hitung Bangun Datar ");
        System.out.println("<––––––––––––––––––––––––>");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.print("Pilih Menu : ");
        int pilihan = input.nextInt();//input variable menu untuk memilih
        switch(pilihan){//percabangan pemilihan menu
            case 1 ://pilihan 1
                class1.Subclass1(0);//memanggil konstruktor
                break;
            case 2 ://pilihan2
                class2.Subclass2(0,0);//memanggul konstruktor
                break;
            default: // selain pilihan diatas
                System.out.println("Pilihan Tidak Tersedia");
        
        }
    }
    
}
