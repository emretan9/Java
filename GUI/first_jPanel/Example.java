package GUI.first_jPanel;

import javax.swing.*;
import java.awt.*;

public class Example extends  JFrame{
    //this is the class of Example.form when we did something at the form it will automaticaly type here as a code form
    private JPanel wrapper; //name of upper layer.JPanel comes from swing as window

    //constructor that will add functions

    public Example(){
        this.add(wrapper);
        setSize(400,400);
        setTitle("My First Application ");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//it closes the window and will finish the process when we click at close button
        setVisible(true);
        setResizable(false);//we cant no longer resize the screen.

        ImageIcon image=new ImageIcon("GUI/first_jPanel/logo.png");//create ImageIcon
        setIconImage(image.getImage());//change icon of frame

        getContentPane().setBackground(new Color(0,10,180));//change color of background
    }
    //In order to avoid typing that codes at main class we added them into constructor
/*
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setContentPane(new Example().wrapper);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
*/
}
