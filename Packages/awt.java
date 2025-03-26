import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.border.Border;

public class awt {
    public static void main(String[] args) {
        
        Frame myFrame = new Frame();

        myFrame.setTitle("Frame Test");
        myFrame.setLayout(new GridLayout(2, 2));
        myFrame.setSize(400, 480);
        myFrame.setBackground(Color.white);
        Button b1 = new Button("Click");
        Button b2 = new Button("click");
        Button b3 = new Button("click");
        Button b4 = new Button("click");

        myFrame.add(b1);
        myFrame.add(b2);
        myFrame.add(b3);
        myFrame.add(b4);
        

        myFrame.setVisible(true);
    }
}
