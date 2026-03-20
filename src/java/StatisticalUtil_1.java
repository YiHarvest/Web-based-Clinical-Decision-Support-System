public class StatisticalUtil
{
public static var statisticalArr:ArrayCollection=new ArrayCollection();
public static var viewXMLList:XMLList=new XMLList();
public function StatisticalUtil()
{
}
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
graphics2D = (Graphics2D) g;
graphics2D.drawString(MESSAGE, xPosition, yPosition);
}
public static void main(String[] args) {
Graphics1 graphics1 = new Graphics1();
graphics1.setTitle("Graphics 1");
graphics1.setSize(xSize,ySize);
graphics1.setVisible(true);
}
