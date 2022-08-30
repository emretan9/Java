package GUI.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame  implements ActionListener{
    JButton button;
    //Since we declare it into constructor we can access it only in constructor we dont want it because we will use it outside of constructor with override method.

    //JLabel
    JLabel label;

    MyFrame(){
        //Image icon
        ImageIcon icon=new ImageIcon("GUI/Button/point.png");
        ImageIcon icon2=new ImageIcon("GUI/Button/emoji1.png");

        //JLabel

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(300,250,200,150);
        label.setText("HI! I'm Emre TANRIKULU");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(25);
        label.setVisible(false);


        //JButton

        button = new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener(this);//it means use this method as an button action
        //button.addActionListener(e -> System.out.println("HI! I'M EMRE TANRIKULU"));
        //this is a shortcut u can use lambda expression at that point like this
        //Other type of giving action to button is first implement actionlistener then override its method
        button.setText("CLICK HERE TO SEE WHO AM I");
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIcon(icon);//setting icon to button
        button.setFont(new Font("Comic Sans",Font.BOLD,12));//changing fontname,fontsize etc.
        button.setIconTextGap(-15);//making icon closer to text
        button.setForeground(Color.cyan);//setting fontcolor as cyan
        button.setBackground(Color.lightGray);//setting background color as light gray
        button.setBorder(BorderFactory.createEtchedBorder());//kinda like 2d border
        /*
        button.setEnable(false); -> It will make button disable
        */


        //setting up the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GRAY);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);//as aLways when add something to panel we need to add into frame with "frame.add(comp)"
        this.add(label);//adding label to frame

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setVisible(true);//when we clicked the button it will show the image
        }
    }
    //When we give action to button we need to implement actionlistener and it will override method and it means this event will listen the events


}

public class button_example {
    public static void main(String[] args) {

        // JButton =  a button that performs an action when clicked on

        new MyFrame();

    }
}
