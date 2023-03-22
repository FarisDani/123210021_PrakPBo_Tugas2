/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210021tugasprak2;


import java.util.InputMismatchException;
import ruang.Balok;
import java.awt.event.*;
import javax.swing.*;

//import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Lenovo
 */
class Errorhand  extends JFrame implements ActionListener  {
    JLabel error1 = new JLabel("");
    
    
     public Errorhand(String errormessage){
        
         setTitle("Error");
         setDefaultCloseOperation(3);
         setSize(400,200);
         setLayout(null);
         
         add(error1);
         setVisible(true);
         error1.setBounds(70,40,220,20);
         error1.setText(errormessage);
         
         
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        InputMismatchException error;
    }
}
