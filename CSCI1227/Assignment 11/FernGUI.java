/**
 * A program that allowed you to create ferns using a GUI.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class FernGUI extends JFrame implements ActionListener
{



    private JTextField numField1;
    private JTextField numField2;
    private JTextField numField3;
    private JTextField numField4;
    private JTextField numField5;
    private JTextField numField6;

    public FernGUI()
    {

        super("A GUI for Making Ferns");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton drawButton = new JButton("Draw");
        JButton exitButton = new JButton("Exit");
        drawButton.addActionListener(this);
        exitButton.addActionListener(this);
        buttonPanel.add(drawButton);
        buttonPanel.add(exitButton);
        pane.add(buttonPanel, BorderLayout.SOUTH);

        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(6, 2));
        numField1 = createNumberField();
        numField2 = createNumberField();
        numField3 = createNumberField();
        numField4 = createNumberField();
        numField5 = createNumberField();
        numField6 = createNumberField();

        numberPanel.add(new JLabel("Window Width:"));
        numberPanel.add(numField1);
        numberPanel.add(new JLabel("WIndow Height:"));
        numberPanel.add(numField2);
        numberPanel.add(new JLabel("Root's Distance Across:"));
        numberPanel.add(numField3);
        numberPanel.add(new JLabel("Root's Distance Down:"));
        numberPanel.add(numField4);
        numberPanel.add(new JLabel("Fern's Growth Angle:"));
        numberPanel.add(numField5);
        numberPanel.add(new JLabel("Fern's Height:"));
        numberPanel.add(numField6);

        pane.add(numberPanel, BorderLayout.CENTER);

    }

    public JTextField createNumberField()
    {
        JTextField numField = new JTextField();
        Insets margin = new Insets(5, 5, 5, 5);

        numField.setHorizontalAlignment(JTextField.RIGHT);
        numField.setMargin(margin);

        return numField;
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Exit"))
            System.exit(0);
        else if (e.getActionCommand().equals("Draw"))
            drawThisFern();
    }

    public void drawThisFern()
    {
        int w = getInt(numField1);
        int h = getInt(numField2);
        double x = getDouble(numField3);
        double y = getDouble(numField4);
        double a = getDouble(numField5);
        double s = getDouble(numField6);
        FernWindow win = new FernWindow(w, h, x, y, a, s);
        win.setVisible(true);
    }


    public int getInt(JTextField field)
    {
        try
        {
            return Integer.parseInt(field.getText());
        }
        catch (NumberFormatException e)
        {
            field.setText("Error: " + field.getText());
            return 0;
        }
    }

    public double getDouble(JTextField field)
    {
        try
        {
            return Double.parseDouble(field.getText());
        }
        catch (NumberFormatException e)
        {
            field.setText("Error: " + field.getText());
            return 0;
        }
    }

    public static void main(String[] args)
    {
        FernGUI ad = new FernGUI();
        ad.setVisible(true);

        System.out.println("\n\nFern GUI");
        System.out.println("--------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This program allows you to create ferns"
                           + " using a GUI.");
        System.out.println("");
    }
}
