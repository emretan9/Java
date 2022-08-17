package GUI.jLabel;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class jLabel_example {
    public static void main(String[] args) {

     // JLabel is display area for a string of text ,an image or both.

     //icon image
     ImageIcon image=new ImageIcon("C:\\Users\\Emre TANRIKULU\\Desktop\\java\\src\\GUI\\jLabel\\profile_pic.png");

     //broder
     Border border=BorderFactory.createLineBorder(Color.green,3);

     //creating label
     JLabel label=new JLabel();//u can also add text into JLabel() part.
     label.setText("Hi! I'm Emre Tanrıkulu");//set text of label
     label.setIcon(image);
     label.setHorizontalTextPosition(JLabel.CENTER);//added text at center of image.set tex LEFT,CENTER,RIGHT
     label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER,BOTTOM of image icon
     label.setForeground(new Color(0x00FF00));//set font color which is green with customizing style.another way is Color.green
     label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
     label.setIconTextGap(75);//put gap between text and image.U can also write - numbers in order to get closer text.
     label.setBackground(Color.black);//set background color as black
     label.setOpaque(true);//display background color
     label.setBorder(border);//displaying border
     label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
     label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label


     //creating frame
     JFrame frame =new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(750,750);
     frame.setVisible(true);
     frame.add(label);//adding label into frame
     frame.pack();
    }
}
