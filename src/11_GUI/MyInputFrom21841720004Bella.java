/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.gui.percobaan2;

/**
 *
 * @author bella
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputFrom21841720004Bella extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JButton mButton2; //script yang ditambahkan
    private JPanel mPanel;

    public MyInputFrom21841720004Bella() {
        createTextFieldBella();
        createButtonBella();
        createPanelBella();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextFieldBella() {
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai C: ");
        mCLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButtonBella() {
        mButton = new JButton("Kali"); // untuk membuat tombol "Kali"
        mButton2 = new JButton("Tambah"); // untuk membuat tombol "Tambah"
        
        class AddInterestListener implements ActionListener{
            //unutk event klik

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(mAField.getText());
                int b = Integer.valueOf(mBField.getText());
                
                //script yang dirubah
                if(e.getSource() == mButton){
                    int c = a * b;
                    mCLabel.setText("Hasil: " + c);
                }
                if(e.getSource() == mButton2){
                    int c = a + b;
                    mCLabel.setText("Hasil: " + c);
                }
            }
        }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
        mButton2.addActionListener(listener);//script ditambahkan
    }

    private void createPanelBella() {
        mPanel = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mButton2);//script ditambahkan
        mPanel.add(mCLabel);
        add(mPanel);
    }
    
    public static void main(String[] args) {
        JFrame frame = new MyInputFrom21841720004Bella();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
