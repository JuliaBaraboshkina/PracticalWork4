
import java.awt.*;
import java.awt.font.TextLayout;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;

    public Main() {

        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Shape line = new Line2D.Double(120, 150, 255, 190);
                Shape line2 = new Line2D.Double(120, 150, 220, 200);
                Shape line3 = new Line2D.Double(380, 150, 250, 190);
                Shape line4 = new Line2D.Double(380, 150, 240, 215);
                Shape line5 = new Line2D.Double(220, 200, 215, 210);
                Shape line6 = new Line2D.Double(215, 210, 240, 215);
                Shape line7 = new Line2D.Double(380, 150, 215, 210);
                Shape line8 = new Line2D.Double(252, 190, 245, 200);
                Shape line9 = new Line2D.Double(220, 200, 245, 200);
                Shape line10 = new Line2D.Double(120, 150, 245, 200);

                Shape circle = new Ellipse2D.Double(200, 150, 100, 100);
                g2.draw(line);
                g2.draw(line2);
                g2.draw(line3);
                g2.draw(line4);
                g2.draw(line5);
                g2.draw(line6);
                g2.draw(line7);
                g2.draw(line8);
                g2.draw(line9);
                g2.draw(line10);
                g2.draw(circle);
                Font font = new Font("Georgia", Font.BOLD, 50);
                TextLayout textLayout = new TextLayout("UAZ", font, g2.getFontRenderContext());
                textLayout.draw(g2, 195, 250);
            }
        };
        setTitle("UAZ");
        this.getContentPane().add(p);
    }

    public static void main(String arg[]) {
        new Main();
    }

}