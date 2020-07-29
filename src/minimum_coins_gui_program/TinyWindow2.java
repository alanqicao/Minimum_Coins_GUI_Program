package minimum_coins_gui_program;

import javax.swing.*;

////////////////////////////////////////////////////// class TinyWindow2
class TinyWindow2 extends JFrame
{

    //====================================================== method main
    public static void main(String[] args)
    {
        TinyWindow2 window = new TinyWindow2();             //Note 1
        window.setVisible(true);                            //Note 2
    }//main

    //====================================================== constructor
    public TinyWindow2()                                    //Note 3
    {
        //... Set window characteristics
        setTitle("Rod's Tiny Window using JFrame Subclass");      //Note 4
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Note 5
    }//constructor
}//class
/*
1.Create a new object (instance) of our JFrame subclass.
2.Make window visible. This could also be the last line of the constructor.
3.A "constructor" is like a method, and is used to initialize a class. You can tell the difference between a constructor and a normal method by two characteristics: (1) It has the same name as the class, and (2) It has no return type.
4.Set the text on the window titlebar.
5.Make sure the program stops when the window closes.

 */
