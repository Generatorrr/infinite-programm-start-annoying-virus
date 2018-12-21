package com.annoying.classes;

import java.awt.*;

import javax.swing.*;

/**
 * Created on 12/21/18.
 * <p>
 * @author Vlad Martinkov
 */
public class Panel extends JPanel
{

    public Panel()
    {
        setBackground(Color.RED);
    }

    @Override
    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font(null, Font.BOLD, 25));
        graphics.drawString("CLOSE ME IF YOU CAN xD)()()", 150, 200);
    }
}
