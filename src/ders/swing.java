package ders;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("BUTON SAYACI");
        JLabel label = new JLabel("Tıklanma sayısı = 0");
        label.setBounds(100,60,200,200);

        JButton buton = new JButton("TIKLA");
        buton.setBounds(100,100,100,50);

        buton.addActionListener(new ActionListener() {
            int c=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Butona "+ c++ +". kez tıkladınız");

            }
        });


        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(buton);
        frame.add(label);



    }
}