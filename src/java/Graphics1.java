public class Graphics1 extends Frame {
private static final long serialVersionUID = 1L;
private int xPosition = 100;
private int yPosition = 50;
private static final int xSize = 300;
private static final int ySize = 100;
private static Graphics2D graphics2D;
private static final String MESSAGE = "Welcome to 2D Graphics";
public Graphics1() {
addWindowListener(new ExitAdapter());
}
public void paint(Graphics g) {
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
public void captureScreen(String fileName) throws Exception {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Rectangle screenRectangle = new Rectangle(screenSize);
Robot robot = new Robot();
BufferedImage image = robot.createScreenCapture(screenRectangle);
ImageIO.write(image, "png", new File(fileName));
}
import java.io.File;
import java.io.FileOutputStream;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
