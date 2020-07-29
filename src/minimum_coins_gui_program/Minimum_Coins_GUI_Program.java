
package minimum_coins_gui_program;

import java.awt.*; //outline
import javax.swing.*; //
import java.awt.event.*;  // Needed for ActionListener

//////////////////////////////////////////////////////// class DogYears2
class Minimum_Coins_GUI_Program extends JFrame
{
    //======================================================== constants

    private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;      //Note 1
    //=============================================== instance variables
    private JTextField _humanYearsTF = new JTextField(3);       //Note 2
    private JTextField _dogYearsTF = new JTextField(3);

    //====================================================== constructor
    public Minimum_Coins_GUI_Program()
    {                                        //Note 3
        // 1... Create/initialize components
        JButton convertBtn = new JButton("Convert");  //Note 4
        convertBtn.addActionListener(new ConvertBtnListener()); //Note 5

        _dogYearsTF.addActionListener(new ConvertBtnListener());
        _humanYearsTF.setEditable(false);


        // 2... Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // 3... Add the components to the content panel.
        content.add(new JLabel("Dog Years"));
        content.add(_dogYearsTF);              // Add input field
        content.add(convertBtn);               // Add button
        content.add(new JLabel("Human Years"));
        content.add(_humanYearsTF);            // Add output field

        // 4... Set this window's attributes, and pack it.
        setContentPane(content);
        pack();                               // Layout components.
        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.
    }

    ////////////////////////////////////////////////// ConvertBtnListener
    class ConvertBtnListener implements ActionListener
    {         //Note 6

        public void actionPerformed(ActionEvent e)
        {
            //... Get the value from the dog years textfield.
            String dyStr = _dogYearsTF.getText();                //Note 7
            int dogYears = Integer.parseInt(dyStr);              //Note 8

            //... Convert it - each dog year is worth 7 human years.
            int humanYears = dogYears * DOG_YEARS_PER_HUMAN_YEAR; //Note 9

            //... Convert to string and set human yrs textfield
            _humanYearsTF.setText("" + humanYears);              //Note 10
        }
    }

    //====================================================== method main
    public static void main(String[] args)
    {
        DogYearsExample window = new DogYearsExample();
        window.setVisible(true);
    }
}



/* Notes
1. Your program should not contain "magic numbers". Instead, define constants with meaningful names.
2. This declares and initializes a text field to be approximately 3 characters wide.
3. The GUI constructor typically performs the following chores:
	(1) Finish initializing components (creating, setting attributes, adding listeners, ...).
	(2) Create a content pane and set the layout.
	(3) Add the components.
	(4) Set frame attributes, including the content pane, and pack it to do the layout.
4. This declares and initializes a "Convert" button.
5. This creates an association between the button and an object.
	When the button is clicked, it will call the actionPerformed method of that object.
6. This is one of most common ways to create a listener
	- define an inner class that "implements ActionListener",
	and in that class define the actionPerformed() method.
7. Get the text from a JTextField with a call to its getText() method.
	This returns a string, which in this case must be converted to a number before it can be used in the computation.
8. If this can't be converted, it will throw an exception.
	You'll learn how to handle exceptions later.
9. This is the essential "logic" or "model" of the problem. It's so simple that I put it here in the listener. It would be better in a separate class, or at least a separate method,
	Later examples with more logic will separate the logic/model...
10 Set the value of a JTextField by calling its setText() method and passing a string to it.
	Concatenating an empty string is a common idiom to convert a number to String.
*/





