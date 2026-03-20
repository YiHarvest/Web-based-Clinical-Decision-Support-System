System.out.println(files[i]);
}
}
}
}
import java.io.FileOutputStream;
import java.io.IOException;
public class CreateAFile {
public static void main(String[] args) throws IOException {
byte[] buf = new byte[8192];
long n = Long.parseLong(args[0]);
FileOutputStream fos = new FileOutputStream(args[1]);
long m = n / buf.length;
for (long i = 0; i < m; i++) {
fos.write(buf, 0, buf.length);
}
fos.write(buf, 0, (int)(n % buf.length));
fos.close();
}
}
import mx.collections.ArrayCollection;
import mx.rpc.events.ResultEvent;
import mx.rpc.http.HTTPService;
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
public class ExitAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
}
loader.load(request);
}
catch (error:Error)
{
trace("Unable to load URL");
}
function loaderCompleteHandler(e:Event):void
{
var variables:URLVariables = new URLVariables( e.target.data );
if(variables.success)
{
trace(variables.path);
}
}
function httpStatusHandler (e:Event):void
{
trace("httpStatusHandler:" + e);
}
function securityErrorHandler (e:Event):void
{
trace("securityErrorHandler:" + e);
}
function ioErrorHandler(e:Event):void
{
trace("ioErrorHandler: " + e);
}while ((strLine = bufferedReader.readLine()) != null) {
String oneLine = strLine.trim();
if (oneLine.length() >= 1) {
Pattern p = Pattern.compile("[s*.*s*]");
package com.bdqn.dao;
int nodelen = oneLine.split("[;]").length;
String[] strArray1 = new String[4];
if (nodelen == 1) {
oneLine = oneLine.split("[;]")[0].trim();
} else if (nodelen == 2) {
strArray1[3] = oneLine.split("[;]")[1].trim();
oneLine = oneLine.split("[;]")[0].trim();
}
Matcher m = p.matcher(oneLine);
if (m.matches()) {
strArray1[0] = "@Node";
strArray1[1] = oneLine;
strArray1[2] = "";
} else {
int keylen = oneLine.split("=").length;
if (keylen == 1) {
strArray1[0] = "@Key";
strArray1[1] = oneLine.split("=")[0];
strArray1[2] = "";
} else if (keylen == 2) {
strArray1[0] = "@Key";
strArray1[1] = oneLine.split("=")[0];
strArray1[2] = oneLine.split("=")[1];
} else {
strArray1[0] = "@ElementError";
strArray1[1] = "";
strArray1[2] = "";
strArray1[3] = "";
}
}
if (strArray1[0].equals("@Node")) {
previousNode = currentNode;
currentNode = strArray1[1];
if (row > 0) {
configMap.put(previousNode, vec.elementAt(0));
vec.clear();
row = 0;
}
WriteBuffer += (oneLine + "/r/n");
} else if (strArray1[0].equals("@Key") && row == 0) {
Properties ht = new Properties();
ht.setProperty(strArray1[1], strArray1[2]);
if (strArray1[1].equals(%%1)) {
WriteBuffer += (%%1+"=" + %%2 + "/r/n");
} else
WriteBuffer += (oneLine + "/r/n");
vec.add(0, ht);
row++;
} else if (strArray1[0].equals("@Key") && row > 0) {
Properties ht2 = new Properties();
ht2.put(strArray1[1], strArray1[2]);
vec.clear();
vec.add(0, ht2);
WriteBuffer += (oneLine + "/r/n");
row++;
}
}
}
configMap.put(currentNode, vec.elementAt(0));
} catch (FileNotFoundException e) {
configMap = null;
e.printStackTrace();
} catch (IOException e) {
configMap = null;
e.printStackTrace();
} finally {
vec.clear();
try {
bufferedReader.close();
fileReader.close();
} catch (IOException e) {
e.printStackTrace();
}
try {
