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
public class Subclass2 extends Inheritance {
    public void Subclass2(int panjang, int lebar ){
        //deklarasi variable parameter
        //variable parameter = variable aribut parentclass
        panjang = super.Bilangan1;
        lebar = super.Bilangan2;
        //tampilan
        System.out.println("");
        System.out.println("  Menu Luas Persegi Panjang  ");
        System.out.println("<–––––––––––––––––––––––––––>");
        //input atribut (Variable) parentclass
        System.out.print("Masukkan panjang : ");
        panjang = super.input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = super.input.nextInt();
        //keyword super untuk menggunakan atribut parentclass
        super.hasil = panjang * lebar;//aritmatika luas persegi panjang
        System.out.println("Luas Persegi Panjang : " + super.hasil);//tampilkan hasil luas persegi panjang
    }
    
}
