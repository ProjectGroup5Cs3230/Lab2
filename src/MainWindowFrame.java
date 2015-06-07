/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author Owner
 */
public class MainWindowFrame extends JFrame
{
    //new MainWindowFrame();

    public MainWindowFrame()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(400,600));
        setVisible(true);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(350,550));
        panel.setBackground(Color.red);
        
        JTextField input1 = new JTextField("I am a field");
        input1.setPreferredSize(new Dimension(100,55));
        JTextField input2 = new JTextField("I am a field");
        input2.setPreferredSize(new Dimension(100,55));
        panel.add(input1);
        panel.add(input2);
        JButton button = new JButton("new button");
        button.addActionListener(new ActionListener()    
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                panel.setBackground(Color.BLUE);
            
            }
            
        });
        panel.add(button);
        
        add(panel);
        
        setVisible(true);
    

    }

}