package GUI.first_jPanel;

import javax.swing.*;
import java.awt.*;

public class JPanel_example {
    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components

        //Image
        ImageIcon image=new ImageIcon("GUI/first_jPanel/thumsup1.png");


        //JLabel
        JLabel label=new JLabel();
        label.setText("HI!");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);

        // JPanels
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        /*
        Layout means the arrangement of components within the container.
        In other way we can say that placing the components at a particular position within the container.
        The task of layouting the controls is done automatically by the Layout Manager.

        what is setLayout(null)?
        ->null layout means absolute positioning-you have to do all the work in your code. No layout manager to help you out.

        */


        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);


        //JFrame
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redPanel.add(label);//instead of typing frame.add we directly added label into redPanel
        frame.add(redPanel);//if you want to see JPanel u need to add into frame
        frame.add(bluePanel);
        frame.add(greenPanel);









    }
}
