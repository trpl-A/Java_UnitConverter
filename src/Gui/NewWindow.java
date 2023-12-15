package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


// main sub-window
public class NewWindow implements ActionListener, KeyListener {
    JFrame frame;
    JPanel panel;
    JLabel header;
    JLabel text1;
    JLabel inputMsg;
    JTextArea input1;
    JButton enterBtn;
    // ===============================
    
    final private String sectionName = "Calories to Joules";
    final private Color mainForeColor = Color.GREEN;

    
    // METHODS
    // gui
    public void app() {
        // frame    
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setTitle(this.sectionName);
        frame.setResizable(false);
        frame.setBackground(mainForeColor);

//        frame.addKeyListener(this);

        // panel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        // text
        header = new JLabel();
        header.setText(this.sectionName);
        header.setBounds(10, 10, 200, 20);
        header.setForeground(mainForeColor);
        header.setFont(new Font("Times", Font.PLAIN, 20));

        text1 = new JLabel("Enter a value");
        text1.setBounds(10, 50, 200, 20);
        text1.setForeground(mainForeColor);

        inputMsg = new JLabel("");
        inputMsg.setBounds(10, 150, 200, 20);        
        
        
        // input
        input1 = new JTextArea();
        input1.setBounds(250, 50, 200, 20);
        input1.setForeground(mainForeColor);
        input1.setBackground(Color.BLACK);
        input1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        input1.addKeyListener(this);
        
        // button
        enterBtn = new JButton("Convert");
        enterBtn.setBounds(10, 100, 100, 20);
        enterBtn.setForeground(mainForeColor);
        enterBtn.setBackground(Color.BLACK);
        enterBtn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        enterBtn.addActionListener(this);
//        enterBtn.addActionListener(e -> {
//           System.out.println("testing");
//        });


        // adding components
        frame.add(panel);

        panel.add(header);
        panel.add(text1);
        panel.add(inputMsg);

        panel.add(input1);

        panel.add(enterBtn);

        // visible
        frame.setVisible(true);
    }

    // calculations
    public void convert() {
        try {
            double userCalories = Double.valueOf(input1.getText());
            double joules = userCalories * 4.186;

            // output
            System.out.println(joules + " J");
            System.out.println();

            inputMsg.setForeground(Color.GREEN);
            String result = input1.getText() + " calories (cal) = " + joules + " J";
            inputMsg.setText(result);
            
             // clear input
            input1.setText("");
        } 
        
        catch (NumberFormatException e) {
             // clear input
            input1.setText("");
        
            // output
            inputMsg.setForeground(Color.RED);
            inputMsg.setText("invalid input");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");

        if (e.getSource() == enterBtn) {
            convert();
        }
    }

    
    // key events
    @Override
    public void keyTyped(KeyEvent e) {
//                System.out.println(" released " + e.getKeyChar());
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void keyPressed(KeyEvent e) {
//                System.out.println("You " + e.getKeyChar());
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You released " + e.getKeyChar());
//        System.out.println("You released " + e.getKeyCode());
//        System.out.println();

        if (e.getKeyCode() == 10){
            convert();
        }
    }
}
