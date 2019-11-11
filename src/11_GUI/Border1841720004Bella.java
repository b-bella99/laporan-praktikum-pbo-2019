/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.gui.percobaan3;

/**
 *
 * @author bella
 */
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border1841720004Bella extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel mPanel;
    
    //membuat konstruktor BorderLayoutForm

    public Border1841720004Bella(){
        mPanel = new JPanel();
        mPanel.setLayout(new BorderLayout());
        
        mPanel.add(new JButton("1"), BorderLayout.NORTH);
        mPanel.add(new JButton("2"), BorderLayout.WEST);
        mPanel.add(new JButton("3"), BorderLayout.CENTER);
        mPanel.add(new JButton("4"), BorderLayout.EAST);
        mPanel.add(new JButton("5"), BorderLayout.SOUTH);
        
        add(mPanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Border Layout Demo");
    }
    
}
