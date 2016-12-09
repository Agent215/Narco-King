/*
Abraham Schultz
GUI for  start screen : Narco King Game
12/8/2016 3:37pm
 */
package NarcoKing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StartScreen extends JFrame {

    private final JButton InstructionsButton;
    private final JButton NewGameButton;
    private final JButton ContinueButton;
    private final JButton OptionsButton;

    //add fields for all components
    public StartScreen() {
        // method that describes Start Screen

        setLayout(new BorderLayout()); // set main layout as border layout

        JPanel topPanel = new JPanel(new FlowLayout()); // panel for top of screen
        topPanel.setBackground(Color.black);// set top panel background
        JPanel CenterPanel = new JPanel(new FlowLayout()); //Center Panel
        CenterPanel.setBackground(Color.black); // set Center panel background
        JPanel BottomPanel = new JPanel(new FlowLayout());// bottom panel
        BottomPanel.setBackground(Color.black); // set bottom panel background

        add(topPanel, BorderLayout.NORTH);// add top panel to screen
        add(BottomPanel, BorderLayout.SOUTH); // adds bottom panel to Screen
        add(CenterPanel, BorderLayout.CENTER);
        // add title image to top panel
        topPanel.add(new JLabel(new ImageIcon("narcoKingTitle.png")));
        CenterPanel.add(new JLabel(new ImageIcon("narcoKingLogo.png")));
        // add logo image to Center panel

        // add and describe components
        InstructionsButton = new JButton("Instructions"); // Intructions button
        NewGameButton = new JButton("New Game"); // New Game button 
        ContinueButton = new JButton("Continue"); // Continue button 
        OptionsButton = new JButton("Options"); // Power button 

        BottomPanel.add(ContinueButton);
        BottomPanel.add(NewGameButton);
        BottomPanel.add(InstructionsButton);
        BottomPanel.add(OptionsButton);

        // Action Listeners *****************************************************
        // add action listeners
        InstructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsButtonActionPerformed(evt);
            }
        });

        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        OptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });

    }

    //************************************************************************
    //EVENT HANDLERS**************************************************************
// add event handlers
    private void InstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Instructions button has been pressed");
    }

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "New Game button has been pressed");
    }

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Continue button has been pressed");  
    }

    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {

        JOptionPane.showMessageDialog(null, "Options button has been pressed");

    }

}
