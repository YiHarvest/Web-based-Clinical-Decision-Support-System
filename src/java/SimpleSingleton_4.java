public enum SimpleSingleton {
INSTANCE;
public void doSomething() {
}
}
SimpleSingleton.INSTANCE.doSomething();
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
File dir = new File("directoryName");
String[] children = dir.list();
if (children == null) {
} else {
for (int i=0; i < children.length; i++) {
String filename = children[i];
}
}
FilenameFilter filter = new FilenameFilter() {
public boolean accept(File dir, String name) {
return !name.startsWith(".");
}
};
children = dir.list(filter);
File[] files = dir.listFiles();
FileFilter fileFilter = new FileFilter() {
public boolean accept(File file) {
return file.isDirectory();
}
};
files = dir.listFiles(fileFilter);
import java.util.zip.*;
import java.io.*;
