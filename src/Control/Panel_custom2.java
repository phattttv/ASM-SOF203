/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author trinh
 */
public class Panel_custom2 extends JPanel{

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getBgrColor1() {
        return bgrColor1;
    }

    public void setBgrColor1(String bgrColor1) {
        this.bgrColor1 = bgrColor1;
    }

    public String getBgrColor2() {
        return bgrColor2;
    }

    public void setBgrColor2(String bgrColor2) {
        this.bgrColor2 = bgrColor2;
    }
    
    
    
    public Panel_custom2() {
        setOpaque(false);
        bgrColor1 = "#edc4b3";
        bgrColor2 = "#774936";
    }

    
    private int radius;
    private String bgrColor1;
    private String bgrColor2;
    
    protected void paintComponent(Graphics grphcs) {
        super.paintChildren(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode(bgrColor1), 0, getHeight(), Color.decode(bgrColor2));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(grphcs);
    }
    
}
