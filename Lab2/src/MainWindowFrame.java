/*
 * Lab 2 - Create an application with 'Student' and 'Group' objects based on the CS 3230 Summer 2015 class. This project
 * should populate a conversation between all of the students in a group and should run through (once) each group's
 * conversations.  Each student has five conversation greetings. Each student takes a turn outputing a greeting to the
 * console until each of the student's five greetings have been written to the console.
 *
 * Lab 3 - Build a JFrame with a scrollable text field, a scrollable input field, and a 'Send' button. Outputs now go
 * to a JFrame text field.
 *
 * Created By - Mat Brewer and Tyler Cazier
 * 6/7/15
 */

import java.awt.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JTextField;

/**
 * This class is used to initialize a JFrame that can be used to create a new chat window.
 *
 * @author Owners - Mat Brewer and Tyler Cazier
 * 5/26/15
 */
public class MainWindowFrame extends JFrame
{
    //new MainWindowFrame();
    CS3230StudentChat a = new CS3230StudentChat();
    
    public  MainWindowFrame()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500,600));
        setVisible(true);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(450,550));
        panel.setBackground(Color.LIGHT_GRAY);
        
        JTextArea input1 = new JTextArea();
        JScrollPane scrollText = new JScrollPane(input1);
        panel.add(scrollText);
        
        input1.setEditable(false);
        scrollText.setPreferredSize(new Dimension(420,300));
        
        JTextField input2 = new JTextField("Enter message here.");
        JScrollPane scrollText2 = new JScrollPane(input2);
        panel.add(scrollText2);
        scrollText2.setPreferredSize(new Dimension(420,55));
        
        JButton button = new JButton("get chats");
        button.addActionListener(new ActionListener()    
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                //panel.setBackground(Color.BLUE);
                input1.setText(a.runChats());
            }
            
        });
        panel.add(button);
        
        add(panel);
        
        setVisible(true);
        

    }
    

}