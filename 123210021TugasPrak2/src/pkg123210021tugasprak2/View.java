/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210021tugasprak2;


import ruang.Balok;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Lenovo
 */
public class View extends JFrame implements ActionListener {
    String angka;
    
   JTextField fPanjang = new JTextField(5);
   JTextField fLebar = new JTextField(5);
   JTextField fTinggi = new JTextField(5);

   JLabel judul = new JLabel("Cuboid Calculator");
   JLabel panjang = new JLabel("Length");
   JLabel lebar = new JLabel("Width");
   JLabel tinggi = new JLabel("Height");
   JLabel result = new JLabel("Result :");
   JLabel Luas = new JLabel();
   JLabel Keliling = new JLabel();
   JLabel Volume = new JLabel();
   JLabel LPermu = new JLabel();

   JButton count = new JButton("Count");
   JButton reset = new JButton("Reset");

   public View(){
	setTitle("Calculator");
	setDefaultCloseOperation(3);
	setSize(350,400);
       
	setLayout(null);
	add(fPanjang);
	add(fLebar);
	add(fTinggi);
	add(judul);
	add(panjang);
	add(lebar);
	add(tinggi);
	add(result);
	add(count);
	add(reset);
        add(Luas);
        add(Keliling);
        add(Volume);
        add(LPermu);

	judul.setBounds(120,10,120,20);
        panjang.setBounds(10,45,120,20);
        fPanjang.setBounds(130,45,150,20);
        lebar.setBounds(10,70,120,20);
        fLebar.setBounds(130,70,150,20);
        tinggi.setBounds(10,95,120,20);
        fTinggi.setBounds(130,95,150,20);
        result.setBounds(145,120,120,20);
        count.setBounds(80,320,80,20);
        reset.setBounds(180,320,80,20);
        setVisible(true);
        
        count.addActionListener(this);
        reset.addActionListener(this);
        fPanjang.addActionListener(this);
        fLebar.addActionListener(this);
        fTinggi.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
   }
   
   @Override
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == count){
           
           String p = fPanjang.getText();
           int numLength = Integer.parseInt(p);
           String l = fLebar.getText();
           int numWidth = Integer.parseInt(l);
           String t = fTinggi.getText();
           int numHeight = Integer.parseInt(t);
           int pvalue=0, lvalue=0, tvalue=0;
           try{
               pvalue = Integer.parseInt(p);
               lvalue = Integer.parseInt(l);
               tvalue = Integer.parseInt(t);
           }catch(InputMismatchException error){
               Errorhand a = new Errorhand(error.getMessage());
               System.out.println(error.getMessage());
               
           }
           
         
           Balok balok = new Balok(pvalue, lvalue, tvalue);
           Luas.setBounds(10,135,120,20);
           Luas.setText("Luas P P : " + balok.hitungLuas());
           
           Keliling.setBounds(10,160,120,20);
           Keliling.setText("Keliling P P : " + balok.hitungKeliling());
           
           Volume.setBounds(10,185,120,20);
           Volume.setText("Volume balok : " + balok.hitungVolume());
           
           LPermu.setBounds(10,210,300,20);
           LPermu.setText("Luas permukaan balok : " + balok.hitungLuasPermukaan());

       }
       
       
       if(e.getSource() == reset){
           fPanjang.setText("");
           fLebar.setText("");
           fTinggi.setText("");
           Luas.setText("");
           Keliling.setText("");
           Volume.setText("");
           LPermu.setText(""); 

       }
       
   }
}


