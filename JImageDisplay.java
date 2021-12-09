import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent{
    private BufferedImage image;

    JImageDisplay(int w,int h){
        image = new BufferedImage(w,h, BufferedImage.TYPE_INT_RGB);

        Dimension dimension = new Dimension(w, h);
        super.setPreferredSize(dimension);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }

    public void clearImage(){
        int[] emptyArr= new int[getHeight()*getWidth()];
        image.setRGB(0,0,getWidth(),getHeight(),emptyArr,0,1);
    }

    public void drawPixel(int x, int y, int rgbColor){
        image.setRGB(x,y,rgbColor);
    }
}