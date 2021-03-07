/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author apple
 */
//subclass // keyword extends agar bisa menggunakan atribut dari class inheritance
public class Subclass1 extends Inheritance {
    public void Subclass1(int sisi){
        sisi = super.Bilangan1;
        //tampilan
        System.out.println("");
        System.out.println("  Menu Luas Persegi ");
        System.out.println("<–––––––––––––––––––>");
        System.out.print("Masukkan sisi : ");
        sisi = super.input.nextInt();//input variable yang ada di parentclass
        //keyword super untuk menggunakan atribut parent class
        super.hasil = sisi  * sisi;//aritmatika luas persegi 
        
        System.out.println("Luas Persegi : " + super.hasil);//tampilkan hasil luas persegi
    }
    
}
