package Gui;

import java.awt.Color;

public class NewWindow3 extends NewWindow {

    final private String sectionName = "Pounds to Grams";

    NewWindow3() {
        super();
    }

    // METHODS
    // gui
    @Override
    public void app() {
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
            double userPounds = Double.valueOf(input1.getText());
            double grams = userPounds / 0.0022;

            // output
            System.out.println("- " + grams + " g");
            System.out.println("- " + (grams / 1000) + " kg");
            System.out.println();
            
            inputMsg.setForeground(Color.GREEN);
            inputMsg.setSize(400, 20);
            String result = input1.getText() + " pounds (lbs) = " +
                    grams + " g OR " + (grams / 1000) + " kg";
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
