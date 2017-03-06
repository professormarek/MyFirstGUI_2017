//swing is a library of Java GUI components Standard WINdownG toolkit
import javax.swing.*;
import java.awt.*;

/**
 * This program implements a simple GUI for demonstration purposes.
 * We use the JPanel class to contain the windowed application.
 * .
 */
public class MyFirstGUI extends JPanel{
    //all GUI panels in Java need a unique identifier for the windowing system
    private static final long serialVersionUID=123456789;
    //for controls where we need to refer to their values or properties later - declare these as instance variables (fields)

    //a text entry box to store the user's input sequence
    JTextArea inputSequence;

    //let's create a constructor that sets up our GUI when the application is launched
    public MyFirstGUI(){
        //create a layout within our MyFirstGUI JPanel
        //note: the layout itself is going to be contained within another JPanel
        JPanel controlsArea = new JPanel(new GridLayout(2,2));
        //try to set the preferred size of the window
        setPreferredSize(new Dimension(500,400));

        //populate the layout with controls

        //Label is a non-interactive text display control
        //https://docs.oracle.com/javase/7/docs/api/java/awt/Label.html
        controlsArea.add(new Label("Hello GUI!"));

        //IMPORTANT!: make sure to add the controlsArea layout to this JPanel
        //or else it won't display
        this.add(controlsArea, BorderLayout.SOUTH); //BorderLayout.SOUTH is a constant indicating where to place the control

        //just for fun, let's add some controls to let the user enter a sequence and search it for some text
        inputSequence = new JTextArea();
        //add the inputSequence textbox to the layout
        controlsArea.add(inputSequence);

        //notice the pattern; instantiate a new conrol and add it to the layout
        //add another label to indicate to the user that they can search
        controlsArea.add(new Label("search for: "));

        //create a JTextArea to let the user input a string to search for

    }

    //let's instantiate our GUI from another class.

}
