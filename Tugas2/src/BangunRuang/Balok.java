    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.PersegiPanjang;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungBangunRuang {

   private double Tinggi;
    
    public Balok(double Panjang, double Lebar, double Tinggi){
        super(Panjang , Lebar);
       this. Tinggi = Tinggi;
    }
    
    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }

    public double getTinggi() {
        return Tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * Tinggi;
    }


    @Override
    public double hitungLuasPermukaan() {
         return 2 * (super.hitungLuas() + (super.getLebar() * Tinggi) + (super.getPanjang() * Tinggi));
    }
    
}
