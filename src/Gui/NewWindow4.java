package Gui;

import java.awt.Color;

public class NewWindow4 extends NewWindow {

    final private String sectionName = "Degrees Fahrenheit to Degrees Celsius";

    NewWindow4() {
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
        header.setSize(400, 25);
        header.setText(this.sectionName);
    }

    // calculations
    @Override
    public void convert() {
        try {
            double numdub = Double.valueOf(input1.getText());
            double celsius = ((numdub - 32) * 5) / 9;

            // output
            System.out.println(celsius + " °C");
            System.out.println();
            
            inputMsg.setSize(450, 20);
            inputMsg.setForeground(Color.GREEN);
            String result = input1.getText() + " °F = " + celsius + " °C";
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
