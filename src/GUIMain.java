import javax.swing.*;

/**
 * This class will instatiate our JPanel subclass (MyFirstGUI) and places it inside a JFrame.
 */
public class GUIMain {
    public static void main(String[] args){

        //set the look and feel of our GUI
        //note: this may throw an exception
        try { //try - catch will handle Exceptions
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e){
            e.printStackTrace();
        }

        /*
        indicate to the java VM and the GUI system that we want to call a method "createAndShowGUI()"
        "aysnchronously" meaning "sometime later"
        and this function will set up our GUI

        We're going to use the Runnable class that is related to MultiThreading
        MultiThreading is technically outside the scope of the course. However, you can reuse this code
        for your assignment.
         */
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            //override the run() method inherited from Runnable
            public void run(){
                createAndShowGUI();
            }
        }); // notice this is all inside the function call invokeLater

    }

    /*
    this method instantiates and sets up our JPanel (MyFirstGUI)
     */
    private static void createAndShowGUI(){
        //create a JFrame that is going to be the outer container for our GUI
        JFrame frame = new JFrame();
        //we have to specify what happens to our program when the user closes the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create and set up the content pane (JPanel -

        //make the GUI visible
        frame.setVisible(true);
    }

}
