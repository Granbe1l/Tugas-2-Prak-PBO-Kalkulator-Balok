package tugas2;

import BangunRuang.Balok;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;



public class View extends JFrame implements ActionListener{ 
    
    JLabel ljudul = new JLabel("Cuboid Calculator");
    
    JLabel lpanjang= new JLabel( "Length : ");
    JTextField fpanjang = new JTextField(30);
    
    JLabel llebar = new JLabel( "Width : ");
    JTextField flebar = new JTextField(30);
    
    JLabel ltinggi = new JLabel( "Height : ");
    JTextField ftinggi = new JTextField(30);
    
    JLabel lhasil = new JLabel("Result");
    JLabel lluas = new JLabel();
    JLabel lkeliling = new JLabel();
    JLabel lluaspermukaan = new JLabel();
    JLabel lvolume = new JLabel();
    
    JButton bhitung = new JButton("Calculate");
    JButton breset = new JButton("Reset");
     
     public View(){ 
        setTitle( "Cuboid Calculator");
        setSize(600,550);
        ButtonGroup grup = new ButtonGroup(); 
        
        
        grup.add(bhitung);
        grup.add(breset);
        
        setLayout(null);
        
        add(ljudul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        
        add(lhasil);
        add(lluas);
        add(lkeliling);
        add(lluaspermukaan);
        add(lvolume);
        
        add(bhitung);
        add(breset);
        

        ljudul.setBounds(250, 30, 200, 20);
        lpanjang.setBounds(150, 100, 120, 20);
        fpanjang.setBounds(350, 100, 150, 20);
        llebar.setBounds(150, 150, 120, 20);
        flebar.setBounds(350, 150, 150, 20);
        ltinggi.setBounds(150, 200, 120, 20);
        ftinggi.setBounds(350, 200, 150, 20);
        
        lhasil.setBounds(275, 250, 200, 20);
        lluas.setBounds(150,300,200,20);
        lkeliling.setBounds(150,325,200,20);
        lluaspermukaan.setBounds(150,350,200,20);
        lvolume.setBounds(150,375,200,20);
        
        bhitung.setBounds(150, 440, 120, 20);
        breset.setBounds(300, 440, 120, 20);
        
        
        
          setVisible(true); 
  
        
          
         setDefaultCloseOperation(EXIT_ON_CLOSE); 
         setLocationRelativeTo(null); 
        
        bhitung.addActionListener(this);
        breset.addActionListener(this);
     }


    public void actionPerformed(ActionEvent e ){
        double Panjang, Lebar, Tinggi;
        if(e.getSource() ==bhitung){
            if (fpanjang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Panjang cannot empty");
            } else if (flebar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lebar cannot empty");
            } else if (ftinggi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tinggi cannot empty");
            } else {
                try {
                    Panjang = Integer.parseInt(fpanjang.getText());
                    Lebar = Integer.parseInt(flebar.getText());
                    Tinggi = Integer.parseInt(ftinggi.getText());
                    
                    Balok bl = new Balok(Panjang, Lebar, Tinggi);
                    
                    lluas.setText("Luas Persegi         : " + bl.hitungLuas());
                    lkeliling.setText("Keliling Persegi     : " + bl.hitungKeliling());
                    lluaspermukaan.setText("Luas Permukaan Balok : " + bl.hitungLuasPermukaan());
                    lvolume.setText("Volume Balok         : " + bl.hitungVolume());
                } catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Mohon Masukkan Angka!");
                }
            }
            

    }if (e.getSource() == breset) {
        fpanjang.setText("");
        flebar.setText("");
        ftinggi.setText("");
        lluas.setText(" ");
        lkeliling.setText(" ");
        lluaspermukaan.setText(" ");
        lvolume.setText(" ");
        
        }

    }
        
     
} 


