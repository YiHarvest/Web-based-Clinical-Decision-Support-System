public class DownloadCSVFileAction extends Action{
public ActionForward execute(ActionMapping mapping, ActionForm form,
HttpServletRequest request, HttpServletResponse response) throws Exception {
try {
String fileName = request.getParameter( "fileName ");
long maID = Long.parseLong(request.getParameter( "maID "));
().getRealPath( "/ ")+ "csv/ "+maID+ "/ "+fileName;
File fdown = new File(filePath);
(fdown.length()));
response.setContentLength(filelength);
byte b[]=new byte[filelength];
FileInputStream fi=new FileInputStream(fdown);
OutputStream o=response.getOutputStream();
int n = 0;
while((n=fi.read(b))!=-1) {
o.write(b,0,n);
}
fi.close();
o.close();
return null;
}catch (Exception e) {
request.setAttribute( "ERROR ", e);
return mapping.findForward( "error ");
}
}
}
private String getContentType(String fileName) {
String fileNameTmp = fileName.toLowerCase();
String ret = "";
if (fileNameTmp.endsWith("txt")) {
ret = "text/plain";
}
if (fileNameTmp.endsWith("gif")) {
ret = "image/gif";
}
if (fileNameTmp.endsWith("jpg")) {
ret = "image/jpeg";
}
if (fileNameTmp.endsWith("jpeg")) {
ret = "image/jpeg";
}
if (fileNameTmp.endsWith("jpe")) {
ret = "image/jpeg";
}
if (fileNameTmp.endsWith("zip")) {
ret = "application/zip";
}
if (fileNameTmp.endsWith("rar")) {
ret = "application/rar";
}
if (fileNameTmp.endsWith("doc")) {
ret = "application/msword";
}
if (fileNameTmp.endsWith("ppt")) {
ret = "application/vnd.ms-powerpoint";
}
if (fileNameTmp.endsWith("xls")) {
ret = "application/vnd.ms-excel";
}
if (fileNameTmp.endsWith("html")) {
ret = "text/html";
}
if (fileNameTmp.endsWith("htm")) {
ret = "text/html";
}
if (fileNameTmp.endsWith("tif")) {
ret = "image/tiff";
}
if (fileNameTmp.endsWith("tiff")) {
ret = "image/tiff";
}
if (fileNameTmp.endsWith("pdf")) {
ret = "application/pdf";
}
return ret;
}
import sun.net.ftp.FtpClient;
import java.io.
import sun.net.
fc.cd("foodir");
{
FtpClient fc=new FtpClient("ftp.xx.com");
fc.login("username","888888");
int ch;
File fi = new File("c:index.html");
RandomAccessFile getFile = new RandomAccessFile(fi,"rw");
getFile.seek(0);
TelnetInputStream fget=fc.get("index.html");
DataInputStream puts = new DataInputStream(fget);
while ((ch = puts.read()) >= 0) {
getFile.write(ch);
}
fget.close();
getFile.close();
fc.closeServer();
}
catch (IOException ex)
{
ex.printStackTrace();
}
private final Image image;
Transferable trans = new Transferable() {
public DataFlavor[] getTransferDataFlavors() {
return new DataFlavor[] { DataFlavor.imageFlavor };
}
public boolean isDataFlavorSupported(DataFlavor flavor) {
return DataFlavor.imageFlavor.equals(flavor);
}
public Object getTransferData(DataFlavor flavor)
throws UnsupportedFlavorException, IOException {
if (isDataFlavorSupported(flavor))
package net.java.pdf;
{
return image;
throw new UnsupportedFlavorException(flavor);
}
};
null);
import java.io.
import java.util.
LinkedList<String> folderList = new LinkedList<String>();
folderList.add(%%1);
while (folderList.size() > 0) {
File file = new File(folderList.peek());
folderList.removeLast();
File[] files = file.listFiles();
ArrayList<File> fileList = new ArrayList<File>();
for (int i = 0; i < files.length; i++) {
if (files[i].isDirectory()) {
folderList.add(files[i].getPath());
} else {
fileList.add(files[i]);
}
}
for (File f : fileList) {
f.delete();
}
}
try {
"D:1.xls")));
StringBuilder bd = new StringBuilder();
StringBuffer bd = new StringBuffer();
while (true) {
String str = br.readLine();
if (str == null) {
break;
}
System.out.println(str);
bd.append(str);
}
br.close();
System.out.println(bd.toString());

InputStream is = new FileInputStream(new File("d:\\1.xls"));
byte b[] = new byte[Integer.parseInt(new File("d:\\1.xls").length()
+ "")];
is.read(b);
System.out.write(b);
System.out.println();
is.close();

Reader r = new FileReader(new File("d:\\1.xls"));
char c[] = new char[(int) new File("d:\\1.xls").length()];
r.read(c);
String str = new String(c);
System.out.print(str);
r.close();
} catch (RuntimeException e) {
e.printStackTrace();
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
String a = String.valueOf(2);   integer to numeric string
int i = Integer.parseInt(a); numeric string to an int
BufferedWriter out = null;
try {
out = new BufferedWriter(new FileWriter(filename, true));
out.write(aString);
} catch (IOException e) {
} finally {
if (out != null) {
out.close();
}
}
String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
java.util.Date = java.text.DateFormat.getDateInstance().parse(date String);
SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy" );
Date date = format.parse( myString );
