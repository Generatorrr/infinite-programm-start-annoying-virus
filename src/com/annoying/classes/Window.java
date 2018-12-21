package com.annoying.classes;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.*;

/**
 * Created on 12/20/18.
 * <p>
 * @author Vlad Martinkov
 */
public class Window extends JFrame
{
    
    public Window() {
        JFrame frame = drawWindow();
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent windowEvent)
            {
                SwingUtilities.invokeLater(Window::new);
            }
        });
    }

    public static void main(String[] args)
    {
        new Window();
    }
    
    private static JFrame drawWindow() {
        Random random = new Random();
        JFrame frame = new JFrame("Zdarova!!!");

        Panel panel = new Panel();
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 500);
        frame.add(panel);
        frame.setLocation(random.nextInt(700), random.nextInt(700));
        frame.setVisible(true);
        return frame;
    }
}
