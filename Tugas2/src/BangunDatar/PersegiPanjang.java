/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements MenghitungBangunDatar {
    double Panjang, Lebar;
    
    public PersegiPanjang(double Panjang, double Lebar) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }

    public double getPanjang() {
        return Panjang;
    }

    public void setPanjang(double panjang) {
        this.Panjang = panjang;
    }

    public double getLebar() {
        return Lebar;
    }

    public void setLebar(double lebar) {
        this.Lebar = lebar;
    }

    @Override
    public double hitungLuas() {
         return Panjang * Lebar;
    }

    @Override
    public double hitungKeliling() {
       return 2 *(Panjang + Lebar);   
    }
    
}
