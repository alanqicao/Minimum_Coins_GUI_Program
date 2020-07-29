/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minimum_coins_gui_program;

import java.awt.*;           // Needed for FlowLayout.           //Note 1
import javax.swing.*;

////////////////////////////////////////////////////// class TinyWindow4
class TinyWindow3 extends JFrame
{

    //============================================================= main
    public static void main(String[] args)
    {
        TinyWindow3 window = new TinyWindow3();
        window.setVisible(true);
    }

    //======================================================= constructor
    public TinyWindow3()
    {
        //... Create content panel, set layout
        JPanel content = new JPanel();         
        //Note 2
        
        
//        content.setLayout(new FlowLayout());   // Use FlowLayout //Note 3
        content.setLayout(new GridLayout(2,2,2,2));



        //... Add one label to the content pane.
        JLabel greeting = new JLabel("Hello World - ");       //Note 4
        content.add(greeting);     
        
        JLabel greeting1 = new JLabel("We come in peace.");       //Note 4
        content.add(greeting1);                 // Add label      //Note 5

        JLabel greeting2 = new JLabel("CIS");       //Note 4
        content.add(greeting2);                 // Add label      //Note 5
        
        JLabel greeting3 = new JLabel("1030.");       //Note 4
        content.add(greeting3);                 // Add label      //Note 5
        //... Set window (JFrame) characteristics
        setContentPane(content);                                 //Note 6
        pack();                                // Do layout.     //Note 7
        setTitle("Rod's Tiny Window using JFrame Subclass");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);           // Center window.
    }
}
/*
1.Some elements of the GUI interface are defined in the older AWT package, although the components and containers (starting with "J") are all part of Swing.
2.Create a new JPanel to hold the components for the window's content pane.
3.A layout manager should be explicitly set for the content pane.
4.Create a JLabel.
5.Add the label to the content pane. There really was no reason to assign the JLabel to a variable - the new JLabel(..) could have been an argument to add(...).
6.The content pane of this JFrame is now set to the JPanel that we created earlier, named "content".
7.After the content pane of the JFrame has been set and populated with components, it's necessary to call pack() to do the layout -- it sets the location and size of each component.

 */

