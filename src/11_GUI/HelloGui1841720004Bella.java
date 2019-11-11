/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.gui.percobaan1;

/**
 *
 * @author bella
 */

import javax.swing.*;
public class HelloGui1841720004Bella {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program akan berhenti jika ditutup.
        frame.setSize(600, 300); // lebar, tinggi window
        frame.setLocation(200, 200); // x,y tampilan pada windows
        frame.setLocationRelativeTo(null);// menempatkan frame di tengah-tengah layar
        frame.setVisible(true);//untuk menampilkan frame
    }
}
