e.printStackTrace();
}
System.out.println(ms);
}
}
package com.dyrio.graphics;
package com.dyrio.graphics;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
public class JpgTest {
public void JpgTset throws Exception{
File _file = new File"/Order005-0001.jpg"
Image src = javax.imageio.ImageIO.read_file
int wideth=src.getWidthnull
int height=src.getHeightnull
BufferedImage tag = new BufferedImagewideth/2,height/2,BufferedImage.TYPE_INT_RGB
