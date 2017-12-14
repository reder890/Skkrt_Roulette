package view;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class RoundedFTextField extends JFormattedTextField {
    private Shape shape;
    public RoundedFTextField(MaskFormatter m) {
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-2, getHeight()-2, 17, 17);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(getBackground());
         g.drawRoundRect(0, 0, getWidth()-2, getHeight()-2, 17, 17);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds()))
        	 shape = new RoundRectangle2D.Float(0, 0, getWidth()-2, getHeight()-2, 17, 17);
    
         return shape.contains(x, y);
    }
}