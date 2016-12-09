/*
Abraham Schultz
GUI for Narco King Game
12/8/2016 3:37pm
 */
package NarcoKing;

import java.awt.Color;
import javax.swing.JFrame;

public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an instance of StartScreen frame
        StartScreen myFrame = new StartScreen();
        myFrame.setTitle("Narco King");
        myFrame.setSize(550, 650);
        myFrame.setLocation(700, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().setBackground(Color.black);
        myFrame.setVisible(true);
        
        MainScreenGUI gameFrame = new MainScreenGUI();
        gameFrame.setTitle("Narco King");
        gameFrame.setSize(550, 650);
        gameFrame.setLocation(700, 100);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.getContentPane().setBackground(Color.black);
        gameFrame.setVisible(false);
       //set main game frame visable/ not visable
      

    } //end main

}//  // end class MainGame
