
package minimum_coins_gui_program;

import java.awt.*; //outline
import javax.swing.*; //
import java.awt.event.*;  // Needed for ActionListener

//////////////////////////////////////////////////////// class DogYears2
class Minimum_Coins_GUI_Program extends JFrame
{
    //======================================================== constants

   
    private JTextField changeTF = new JTextField(3);    
    private JLabel quartersLBL = new JLabel("");       
    private JLabel dimesLBL = new JLabel("");     
    private JLabel nickelsLBL = new JLabel("");    
    private JLabel penniesLBL = new JLabel("");      
    

    //====================================================== constructor
    public Minimum_Coins_GUI_Program()
    {                                     
        // 1... Create/initialize components
        JButton calcBtn = new JButton("Calculate"); 
        JButton clearBtn = new JButton("Clear");  
        //Connect listeners to buttons
        
        calcBtn.addActionListener(new CalcBtnListener()); 
        clearBtn.addActionListener(new ClearBtnListener()); 

        changeTF.addActionListener(new CalcBtnListener());
        //changeTF.setEditable(false);


        // 2... Create panel panel, set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2,2,2)); //(roll,column,roll distance, column distance)

        // 3... Add the components to the panel panel.
        panel.add(new JLabel("Enter Change (1-99):"));
        panel.add(changeTF); 
        panel.add(new JLabel("Quarters"));
        panel.add(quartersLBL);
        panel.add(new JLabel("Dimes"));
        panel.add(dimesLBL);
        panel.add(new JLabel("Nickels"));
        panel.add(nickelsLBL);
        panel.add(new JLabel("Pennies"));
        panel.add(penniesLBL);
        panel.add(calcBtn);               // Add button
        panel.add(clearBtn);               // Add button
        
            

        // 4... Set this window's attributes, and pack it.
        setContentPane(panel);
        pack();                               // Layout components.
        setTitle("Minimum Coins");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.
    }

    ////////////////////////////////////////////////// ConvertBtnListener
    class CalcBtnListener implements ActionListener
    {         //Note 6

        public void actionPerformed(ActionEvent e)
        {
            int coins =0;
            String changeSTR = changeTF.getText();
            int changeINT = Integer.parseInt(changeSTR);
            //calc all coins
            //calc quarters
            while(changeINT >=25)
            {
                changeINT = changeINT-25;
                coins++;
            }
            quartersLBL.setText(""+coins);
            coins =0;
            //calc dimes
            while(changeINT >=10)
            {
                changeINT = changeINT-10;
                coins++;
            }
            dimesLBL.setText(""+coins);
            coins = 0;
            //calc nickels
            if(changeINT >=5)
            {
                changeINT = changeINT-5;
                coins=1;
            }
            nickelsLBL.setText(""+coins);
            penniesLBL.setText(""+changeINT);

        }//acttion
    }
    
       class ClearBtnListener implements ActionListener
    {         // clear all fiels

        public void actionPerformed(ActionEvent e)
        {
            
            changeTF.setText("");              
            quartersLBL.setText("");              
            nickelsLBL.setText("");             
            dimesLBL.setText("");              
            penniesLBL.setText("");            
            
        }
    }

    //====================================================== method main
    public static void main(String[] args)
    {
        Minimum_Coins_GUI_Program window = new Minimum_Coins_GUI_Program();
        window.setVisible(true);
    }
}



/* Notes
1. Your program should not contain "magic numbers". Instead, define constants with meaningful names.
2. This declares and initializes a text field to be approximately 3 characters wide.
3. The GUI constructor typically performs the following chores:
	(1) Finish initializing components (creating, setting attributes, adding listeners, ...).
	(2) Create a panel pane and set the layout.
	(3) Add the components.
	(4) Set frame attributes, including the panel pane, and pack it to do the layout.
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





