/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pemogramanvisual1;

import javax.swing.JFrame;

/**
 *
 * @author stanh
 */
public class frame_utama extends JFrame {
    public frame_utama()
    {
        this.setSize(300,300);
        this.setLocation(200,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void tampil()
    {
        this.setVisible(true);
    }
    
    //overide atau overload
    
    public void tampil(String nama)
    {
        this.setTitle(nama);
        this.setVisible(true);
    }
}
