package minimum_coins_gui_program;

import javax.swing.*;                                           //Note 1

class TinyWindow
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();                           //Note 2
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Note 3
        
        window.setVisible(true);                                //Note 4
    }                                                           //Note 5

}
/*
1.This import statement gets all classes in the javax.swing package, although we use only the JFrame class here. There are usually a couple of imports of other common packages.
2."Windows" are implemented by the JFrame class.
3.Make the application quit when the close box is clicked.
4.After the window has been constructed in memory, display it on the screen. The setVisible call also starts a separate thread to monitor user interaction with the interface.
5.When we are finished setting up and displaying the window, don't call System.exit(0). We don't want to stop the program. Although main returns, execution continues because the call to setVisible(true) created another execution thread, A GUI program builds the user interface, then just "goes to sleep" until the user does something.
*/


