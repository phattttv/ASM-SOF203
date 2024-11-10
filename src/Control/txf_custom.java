/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.color.ColorSpace;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicTextFieldUI;

/**
 *
 * @author trinh
 */
public class txf_custom extends JTextField{
   
    private Color brColor;
    private Color lineColor;
    private int radius;
    
    
   public txf_custom() {
       brColor = Color.decode("#adb5bd");
       lineColor = Color.decode("#6c757d");
       radius = 2;
       setOpaque(false);
       setBorder(BorderFactory.createEmptyBorder(2,10,2,10));
       
   }

  @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int s = radius;
        int h = getHeight() - (2 * s);
        int w = getWidth() - (2 * s);
        g2.setColor(brColor);
        g2.fillRoundRect(s, s, w, h, h, h);
        g2.setStroke(new BasicStroke(s));
        g2.setColor(lineColor);
        g2.drawRoundRect(s, s, w, h, h, h);
        super.paintComponent(g);
    }
   
}
