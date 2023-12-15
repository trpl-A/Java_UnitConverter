package Gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {

    JPanel panel;
    JComboBox combo;

    JMenuBar bar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JMenuItem testItem;
    // ================================

    String[] items = {
        "calories to joules",
        "gallons to litres",
        "ounces to grams",
        "pounds to grams",
        "Fahrenheit to Celsius"
    };

    // ================================
    public MainWindow() {
        // frame
        this.setSize(500, 500);
        this.setLocationRelativeTo(null); // centers the window
        this.setResizable(false);

//        this.setLayout(new FlowLayout());
//        this.setBackground(Color.yellow);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setTitle("Unit converter");
        this.setBackground(Color.YELLOW);

        // panel
        panel = new JPanel();
        panel.setBackground(Color.BLACK);

        // combo dropdown
        combo = new JComboBox(items);
        combo.setBounds(10, 10, 200, 20);
        combo.setBackground(Color.WHITE);
        combo.addActionListener(this);

        // menu
        bar = new JMenuBar();
        bar.setBackground(Color.WHITE);

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        editMenu.addActionListener(this);

        helpMenu = new JMenu("Help");
        bar.add(fileMenu);
        bar.add(editMenu);
        bar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        testItem = new JMenuItem("test");
        testItem.setBackground(Color.WHITE);
        testItem.setSize(100, 20);
        testItem.addActionListener(this);
        bar.add(testItem);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        // ------------------------------
        
        // adding components
//        this.add(panel);
        this.add(combo);
        this.setJMenuBar(bar);

        this.setVisible(true);
    }

    
    // METHODS
    public void choice() {
        String userChoice = String.valueOf(combo.getSelectedItem());

        switch (userChoice) {
            default ->  System.out.println("*Something went wrong*");
                
            case "calories to joules" -> {
                System.out.println("open window1");
                NewWindow window1 = new NewWindow();
                window1.app();
            }
            
            case "gallons to litres" -> {
                System.out.println("open window2");
                NewWindow1 window2 = new NewWindow1();
                window2.app();
            }
            
            case "ounces to grams" -> {
                System.out.println("open window3");
                NewWindow2 window3 = new NewWindow2();
                window3.app();
            }

            case "pounds to grams" -> {
                System.out.println("open window4");
                NewWindow3 window4 = new NewWindow3();
                window4.app();
            }
             
            case "Fahrenheit to Celsius" -> {
                System.out.println("open window5");
                NewWindow4 window5 = new NewWindow4();
                window5.app();
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combo) {
            choice();
        }
        
    }

}
