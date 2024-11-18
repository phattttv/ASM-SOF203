/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author trinh
 */
public class button3_custom extends JButton{
    
    
    private boolean over;
    private String color;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        setBackground(Color.decode(color));
    }

    public String getColorOver() {
        return colorOver;
    }

    public void setColorOver(String colorOver) {
        this.colorOver = colorOver;
    }

    public String getColorClick() {
        return colorClick;
    }

    public void setColorClick(String colorClick) {
        this.colorClick = colorClick;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
    
    public button3_custom() {
        //  Init Color
        setColor("#ffff");
        colorOver = "#84b3e7";
        colorClick = "#6f4518";
        borderColor = "#144552";
        setContentAreaFilled(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(Color.decode(colorOver));
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(Color.decode(color));
                over = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(Color.decode(colorClick));
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(Color.decode(colorOver));
                } else {
                    setBackground(Color.decode(colorClick));
                }
            }
        });
    }
    
    
    private String colorOver;
    private String colorClick;
    private String borderColor;
    private int radius = 0;
    
    
    
    
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Paint Border
        g2.setColor(Color.decode(borderColor));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        //  Border set 2 Pix
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
    
}
