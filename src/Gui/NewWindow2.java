package Gui;

import java.awt.Color;

public class NewWindow2 extends NewWindow {
    final private String sectionName = "Ounces to Grams";
//    final private Color mainForeColor = Color.WHITE;

    NewWindow2() {
        super();
    }

    // METHODS
    // gui
    @Override
    public void app(){
        super.app();
        
        // frame
        frame.setTitle(this.sectionName);

        // text
        header.setText(this.sectionName);
    }
    
    
    // calculations
    @Override
    public void convert() {
        try {
            double userOunces = Double.valueOf(input1.getText());
            double grams = userOunces * 28.35;

            // output
            System.out.println(grams + " g");
            System.out.println();

            inputMsg.setForeground(Color.GREEN);
            String result = input1.getText() + " ounces (oz) = " + grams + " g";
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

}
