if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%2 = Jfc.getSelectedFile().getParent();
import java.io.
try{
String command = "C:Program FilesInternet ExplorerIexplore.exe "+%%1;
Runtime.getRuntime().exec(command);
} catch (IOException ex) {
ex.printStackTrace();
}
String root; root
for(i=0;i<20;i++) 0-20
{
root.Format("%c:",allfenqu[i]);
if(GetDriveType(root)==5)
allfenqu[i]='/0';
}
allfenqu[]
String root;
for(i=0;i<20;i++)
{
root=allfenqu[i]+":";
if(GetDriveType(root)==5)
allfenqu[i]='/0';
}
import java.io.
try {
Runtime.getRuntime().exec(%%1);
} catch (IOException e) {
e.printStackTrace();
}
public class DownloadCSVFileAction extends Action{
public ActionForward execute(ActionMapping mapping, ActionForm form,
HttpServletRequest request, HttpServletResponse response) throws Exception {
try {
String fileName = request.getParameter( "fileName ");
long maID = Long.parseLong(request.getParameter( "maID "));
String filePath = request.getSession().getServletContext
().getRealPath( "/ ")+ "csv/ "+maID+ "/ "+fileName;
File fdown = new File(filePath);
int filelength = Integer.parseInt(String.valueOf
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
