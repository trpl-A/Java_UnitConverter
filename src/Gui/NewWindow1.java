package Gui;

import java.awt.Color;
import javax.swing.*;

public class NewWindow1 extends NewWindow {
    final private String sectionName = "Gallons to Litres";
    final private Color mainForeColor = Color.WHITE;

    NewWindow1(){
        super();
    }
    
    // METHODS
    // gui
    @Override 
    public void app() {
        super.app();
        // frame    
        frame.setTitle(this.sectionName);

        // panel
        panel.setBackground(Color.BLUE);

        // text
        header.setText(this.sectionName);
        header.setForeground(mainForeColor);
        text1.setForeground(mainForeColor);
        
        // input
        input1.setForeground(mainForeColor);
        input1.setBorder(BorderFactory.createLineBorder(mainForeColor));

        // button
        enterBtn.setForeground(mainForeColor);
      
    }
     
    // calculations
    @Override
    public void convert() {
        try {
            double userGallons = Double.valueOf(input1.getText());
            double litres = userGallons * 3.78;

            // output
            System.out.println(litres + " L");
            System.out.println();

            inputMsg.setForeground(mainForeColor);
            String result = input1.getText() + " gallons = " + litres + " L";
            inputMsg.setText(result);
            
             // clear input
            input1.setText("");
        } 
        
        catch (NumberFormatException e) {
             // clear input
            input1.setText("");
        
            // output
            inputMsg.setForeground(Color.YELLOW);
            inputMsg.setText("invalid input");
        }

    }
}