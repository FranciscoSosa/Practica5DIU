package practica5;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class ImagePanel extends JPanel{
    
    private class Point{
        private int x;
        private int y;
        
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public ImagePanel(){
        try {
            originalImage = ImageIO.read(new File("./images/dice.jpeg"));
            copyImage = originalImage;
            logo = ImageIO.read(new File("./images/osi.png"));
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        logoCoordinates = new Point(265,0);
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(copyImage, 0, 0, null);
        g.drawImage(logo, logoCoordinates.x, logoCoordinates.y, null);
    }
    
    public void updateImageColor(boolean red, boolean green, boolean blue){
        copyImage = UtilsPractica5.seleccionarComponentes(originalImage, red, green, blue);
        repaint();
    }
    
    public void setLogoCoordinates(int x, int y){
        logoCoordinates.x = x;
        logoCoordinates.y = y;
        repaint();
    }
    
    
    private BufferedImage originalImage;
    private BufferedImage copyImage;
    private BufferedImage logo;
    private final Point logoCoordinates;
}
