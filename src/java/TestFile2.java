public class TestFile2
public static void main(String[] args)
{
FileReader fr = new FileReader("ming.txt");
char[] buffer = new char[1024];
int ch = 0;
while((ch = fr.read())!=-1 )
{
System.out.print((char)ch);
}
InputStreamReader isr = new InputStreamReader(new FileInputStream("ming.txt"));
while((ch = isr.read())!=-1)
{
System.out.print((char)ch);
}
FileInputStream("ming.txt")));
String data = null;
while((data = br.readLine())!=null)
{
System.out.println(data);
}
FileWriter fw = new FileWriter("hello.txt");
String s = "hello world";
fw.write(s,0,s.length());
fw.flush();
OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("hello2.txt"));
osw.write(s,0,s.length());
osw.flush();
FileOutputStream("hello3.txt")),true);
pw.println(s);
fr.close();
isr.close();
br.close();
fw.close();
osw.close();
pw.close();
}
}
File myFolderPath = new File(%%1);
try {
if (!myFolderPath.exists()) {
myFolderPath.mkdir();
}
}
catch (Exception e) {
System.out.println("        ");
e.printStackTrace();
}
File myFilePath = new File(%%1);
try {
if (!myFilePath.exists()) {
myFilePath.createNewFile();
}
FileWriter resultFile = new FileWriter(myFilePath);
PrintWriter myFile = new PrintWriter(resultFile);
myFile.println(%%2);
resultFile.close();
}
catch (Exception e) {
System.out.println("        ");
e.printStackTrace();
}
File myDelFile = new File(%%1);
try {
myDelFile.delete();
}
catch (Exception e) {
System.out.println("        ");
e.printStackTrace();
}
File delFolderPath = new File(%%1);
try {
delFolderPath.delete();
}
catch (Exception e) {
System.out.println("     ");
e.printStackTrace();
}
import java.io.
File delfile=new File(%%1);
File[] files=delfile.listFiles();
for(int i=0;i<files.length;i++){
if(files[i].isDirectory()){
files[i].delete();
}
}
import java.io.
File delfilefolder=new File(%%1);
try {
if (!delfilefolder.exists()) {
delfilefolder.delete();
}
delfilefolder.mkdir();
}
catch (Exception e) {
System.out.println("   ");
e.printStackTrace();
import java.io.
FileReader fr = new FileReader(%%1);
BufferedReader br = new BufferedReader(fr);
String %%2 = br.readLine();
while (%%2 != null) {
%%2 = br.readLine();
}
br.close();
fr.close();
try {
FileWriter fw = new FileWriter(%%1);
fw.write(%%2);
fw.flush();
fw.close();
} catch (IOException e) {
e.printStackTrace();
}
import java.io.
try {
RandomAcessFile logFile=new RandomAcessFile(%%1,"rw");
long lg=logFile.length();
logFile.seek(%%2);
logFile.writeByte(%%3);
}catch(IOException ioe){
System.out.println("      "+ioe.getMessage());
}
File af = new File(%%1);
if (af.exists()) {
System.out.println(f.getName() + "           " + f.length());
System.out.println(f.isFile() ? "   " : "    ");
System.out.println(f.isDirectory() ? "   " : "    ");
System.out.println(f.canRead() ? "   " : " ");
System.out.println(f.canWrite() ? "     " : "");
System.out.println("           " + new Date(f.lastModified()));
} else {
System.out.println(f.getName() + "     ");
System.out.println(f.isFile() ? "   " : "    ");
System.out.println(f.isDirectory() ? "   " : "    ");
System.out.println(f.canRead() ? "   " : " ");
System.out.println(f.canWrite() ? "     " : "");
System.out.println("          " + new Date(f.lastModified()));
}
if(f.canRead()){
}
if(f.canWrite()){
}
File filereadonly=new File(%%1);
try {
boolean b=filereadonly.setReadOnly();
}
catch (Exception e) {
System.out.println("     "+e.printStackTrace());
}
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
%%2=f.getAbsoluteFile();
}
}
LinkedList<String> folderList = new LinkedList<String>();
folderList.add(%%1);
LinkedList<String> folderList2 = new LinkedList<String>();
folderList2.add(%%2+ %%1.substring(%%1.lastIndexOf("")));
while (folderList.size() > 0) {
(new File(folderList2.peek())).mkdirs();
File folders = new File(folderList.peek());
String[] file = folders.list();
File temp = null;
try {
for (int i = 0; i < file.length; i++) {
if (folderList.peek().endsWith(File.separator)) {
+ file[i]);
} else {
+ file[i]);
}
if (temp.isFile()) {
FileInputStream input = new FileInputStream(temp);
+ (temp.getName()).toString());
byte[] b = new byte[5120];
int len;
while ((len = input.read(b)) != -1) {
output.write(b, 0, len);
}
output.flush();
output.close();
input.close();
}
if (temp.isDirectory()) {
for (File f : temp.listFiles()) {
if (f.isDirectory()) {
folderList.add(f.getPath());
folderList2.add(folderList2.peek()
+ File.separator + f.getName());
}
}
}
}
} catch (Exception e) {
System.out.println("             ");
e.printStackTrace();
}
folderList.removeFirst();
folderList2.removeFirst();
}
File copyfolders=new File(%%1);
File[] copyfoldersList=copyfolders.listFiles();
for(int k=0;k<copyfoldersList.length;k++){
if(copyfoldersList[k].isDirectory()){
ArrayList<String>folderList=new ArrayList<String>();
folderList.add(copyfoldersList[k].getPath());
ArrayList<String>folderList2=new ArrayList<String>();
folderList2.add(%%2+"/"+copyfoldersList[k].getName());
for(int j=0;j<folderList.length;j++){
(new File(folderList2.get(j))).mkdirs();
File folders=new File(folderList.get(j));
String[] file=folders.list();
File temp=null;
try {
for (int i = 0; i < file.length; i++) {
if(folderList.get(j).endsWith(File.separator)){
temp=new File(folderList.get(j)+"/"+file[i]);
}
else{
temp=new File(folderList.get(j)+"/"+File.separator+file[i]);
}
FileInputStream input = new FileInputStream(temp);
if(temp.isFile()){
FileInputStream input = new FileInputStream(temp);
(temp.getName()).toString());
byte[] b = new byte[5120];
int len;
while ( (len = input.read(b)) != -1) {
output.write(b, 0, len);
}
output.flush();
output.close();
input.close();
}
if(temp.isDirectory()){
folderList.add(folderList.get(j)+"/"+file[i]);
folderList2.add(folderList2.get(j)+"/"+file[i]);
}
}
}
catch (Exception e) {
System.out.println("             ");
e.printStackTrace();
}
}
LinkedList<String> folderList = new LinkedList<String>();
folderList.add(%%1);
LinkedList<String> folderList2 = new LinkedList<String>();
folderList2.add(%%2 + %%1.substring(%%1.lastIndexOf("")));
while (folderList.size() > 0) {
(new File(folderList2.peek())).mkdirs();
File folders = new File(folderList.peek());
String[] file = folders.list();
File temp = null;
try {
for (int i = 0; i < file.length; i++) {
if (folderList.peek().endsWith(File.separator)) {
+ file[i]);
} else {
+ file[i]);
}
if (temp.isFile()) {
FileInputStream input = new FileInputStream(temp);
+ (temp.getName()).toString());
byte[] b = new byte[5120];
int len;
while ((len = input.read(b)) != -1) {
output.write(b, 0, len);
}
output.flush();
output.close();
input.close();
if (!temp.delete())
System.out.println("          !");
}
if (temp.isDirectory()) {
for (File f : temp.listFiles()) {
if (f.isDirectory()) {
folderList.add(f.getPath());
folderList2.add(folderList2.peek()
+ File.separator + f.getName());
}
}
}
}
} catch (Exception e) {
System.out.println("             ");
e.printStackTrace();
}
folderList.removeFirst();
folderList2.removeFirst();
}
File f = new File(%%1);
if (!f.delete()) {
for (File file : f.listFiles()) {
if (file.list().length == 0) {
System.out.println(file.getPath());
file.delete();
}
}
}
File movefolders=new File(%%1);
File[] movefoldersList=movefolders.listFiles();
for(int k=0;k<movefoldersList.length;k++){
if(movefoldersList[k].isDirectory()){
ArrayList<String>folderList=new ArrayList<String>();
folderList.add(movefoldersList[k].getPath());
ArrayList<String>folderList2=new ArrayList<String>();
folderList2.add(%%2+"/"+movefoldersList[k].getName());
for(int j=0;j<folderList.length;j++){
(new File(folderList2.get(j))).mkdirs();
File folders=new File(folderList.get(j));
String[] file=folders.list();
File temp=null;
try {
for (int i = 0; i < file.length; i++) {
if(folderList.get(j).endsWith(File.separator)){
temp=new File(folderList.get(j)+"/"+file[i]);
}
else{
temp=new File(folderList.get(j)+"/"+File.separator+file[i]);
}
FileInputStream input = new FileInputStream(temp);
if(temp.isFile()){
FileInputStream input = new FileInputStream(temp);
(temp.getName()).toString());
byte[] b = new byte[5120];
int len;
while ( (len = input.read(b)) != -1) {
output.write(b, 0, len);
}
output.flush();
output.close();
input.close();
temp.delete();
}
if(temp.isDirectory()){
folderList.add(folderList.get(j)+"/"+file[i]);
folderList2.add(folderList2.get(j)+"/"+file[i]);
}
}
}
catch (Exception e) {
System.out.println("             ");
e.printStackTrace();
}
}
movefoldersList[k].delete();
}
}
boolean b=false;
ArrayList<String>folderList=new ArrayList<String>();
folderList.add(%%1);
ArrayList<String>folderList2=new ArrayList<String>();
folderList2.add(%%2);
for(int j=0;j<folderList.length;j++){
(new File(folderList2.get(j))).mkdirs();
File folders=new File(folderList.get(j));
String[] file=folders.list();
File temp=null;
try {
for (int i = 0; i < file.length; i++) {
if(folderList.get(j).endsWith(File.separator)){
temp=new File(folderList.get(j)+"/"+file[i]);
}
else{
temp=new File(folderList.get(j)+"/"+File.separator+file[i]);
}
FileInputStream input = new FileInputStream(temp);
if(temp.isFile()){
if (b) temp.createNewFile();
}
if(temp.isDirectory()){
folderList.add(folderList.get(j)+"/"+file[i]);
folderList2.add(folderList2.get(j)+"/"+file[i]);
}
}
}
catch (Exception e) {
System.out.println("             ");
e.printStackTrace();
}
}
int bytesum = 0;
int byteread = 0;
File oldfile = new File(%%1);
try {
if (oldfile.exists()) {
FileInputStream inStream = new FileInputStream(oldfile);
FileOutputStream fs = new FileOutputStream(new File(%%2,oldfile.getName()));
byte[] buffer = new byte[5120];
int length;
while ( (byteread = inStream.read(buffer)) != -1) {
bytesum += byteread;
System.out.println(bytesum);
fs.write(buffer, 0, byteread);
}
inStream.close();
}
}
catch (Exception e) {
System.out.println("          ");
e.printStackTrace();
}
File copyfiles=new File(%%1);
File[] files=copyfiles.listFiles();
for(int i=0;i<files.length;i++){
if(!files[i].isDirectory()){
int bytesum = 0;
int byteread = 0;
try {
InputStream inStream = new FileInputStream(files[i]);
FileOutputStream fs = new FileOutputStream(new File(%%2,files[i].getName());
byte[] buffer = new byte[5120];
int length;
while ( (byteread = inStream.read(buffer)) != -1) {
bytesum += byteread;
System.out.println(bytesum);
fs.write(buffer, 0, byteread);
}
inStream.close();
} catch (Exception e) {
System.out.println("          ");
e.printStackTrace();
}
}
}
File replaceExt=new File(%%1);
replaceExt.renameTo(replaceExt.getName().split(".")[0]+"."+%%2);
final String path=%%1.endsWith("")?%%1:%%1+"";
%%3=path+%%2;
int bytesum = 0;
int byteread = 0;
File oldfile = new File(%%1);
try {
if (oldfile.exists()) {
InputStream inStream = new FileInputStream(oldfile);
FileOutputStream fs = new FileOutputStream(new File(%%2,oldfile.getName()));
byte[] buffer = new byte[5120];
int length;
while ( (byteread = inStream.read(buffer)) != -1) {
bytesum += byteread;
System.out.println(bytesum);
fs.write(buffer, 0, byteread);
}
inStream.close();
oldfile.delete();
}
}
catch (Exception e) {
System.out.println("          ");
e.printStackTrace();
}
File movefile=new File(%%1);
File[] movefiles=movefile.listFiles();
for(int i=0;i<movefiles.length;i++){
if(movefiles[i].isFile()){
int bytesum = 0;
int byteread = 0;
File oldfile = new File(movefiles[i]);
try {
if (oldfile.exists()) {
InputStream inStream = new FileInputStream(oldfile);
FileOutputStream fs = new FileOutputStream(new File(%%2,oldfile.getName()));
byte[] buffer = new byte[5120];
int length;
while ( (byteread = inStream.read(buffer)) != -1) {
bytesum += byteread;
System.out.println(bytesum);
fs.write(buffer, 0, byteread);
}
inStream.close();
oldfile.delete();
}
}
catch (Exception e) {
System.out.println("          ");
e.printStackTrace();
}
String path=%%1;
File file = new File(path);
if(file.exists()) {
if(file.isDirectory()) {
File[] fileArray = file.listFiles();
for(File f:fileArray) {
if(f.isDirectory()) {
doSearch(filter,f.getPath());
} else {
if(f.getName().indexOf(filter) >= 0) {
countFiles++;
result.append(f.getPath() + "/r/n");
}
}
statusShow1.setText(f.getPath());
}
statusShow2.setText("The numbers of files had been found:" + countFiles);
} else {
System.out.println("Couldn't open the path!");
}
} else {
System.out.println("The path had been apointed was not Exist!");
}
JFileChooser Jfc = new JFileChooser();
if (Jfc.isFileSelectionEnabled()) {
File %%1 = Jfc.getSelectedFile();
}
try {
File f=new File(%%1);
FileInputStream fileInputStream = new FileInputStream(f);
byte[] buffer = new byte[fileInputStream.available()];
FileInputStream.read(buffer);
fileInputStream.close();
String strFileName = f.getName();
FileOutputStream fileOutputStream = new FileOutputStream(new File(%%2+""+ strFileName + "1"));
fileOutputStream.write(buffer,0,buffer.length/2);
fileOutputStream.close();
fileOutputStream = new FileOutputStream(new File(%%2+""+ strFileName + "2"));
fileOutputStream.write(buffer, buffer.length/2, buffer.length-buffer.length/2);
fileOutputStream.close();
} catch (ArrayIndexOutOfBoundsException e) {
System.out.print("using FileStreamDemo src des");
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
import java.io.
String strFileName = %%1.substring(%%1.LastIndexOf("") + 1);
try {
FileInputStream fileInputStream1 = new FileInputStream(new File(%%2 + strFileName + "1"));
FileInputStream fileInputStream2 = new FileInputStream(new File(%%2 + strFileName + "2"));
byte[] buffer = new byte[fileInputStream1.available()+fileInputStream2.available()];
FileInputStream.read(buffer, 0, fileInputStream1.available());
FileInputStream2.read(buffer, fileInputStream1.available(), fileInputStream2.available());
fileInputStream.close();
fileInputStream2.close();
FileOutputStream fileOutputStream = new FileOutputStream(new File(%%2+""+ strFileName));
fileOutputStream.write(buffer,0,buffer.length);
fileOutputStream.close();
catch(IOException e){
e.printStackTrace();
}
import java.io.
try {
File f=new File((new File(%%1)).getPath()+"enc_"+(new File(%%1)).getName().split("")[1]);
String strFileName = f.getName();
FileInputStream fileInputStream = new FileInputStream(%%2+""+strFilename);
byte[] buffer = new byte[fileInputStream.available()];
FileInputStream.read(buffer);
fileInputStream.close();
for(int i=0;i<buffer.length;i++)
{
int ibt=buffer[i];
ibt+=100;
ibt%=256;
buffer[i]=(byte)ibt;
}
FileOutputStream fileOutputStream = new FileOutputStream(f);
fileOutputStream.write(buffer,0,buffer.length);
fileOutputStream.close();
}
catch(ArrayIndexOutOfBoundException e){
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
import java.io.
try {
File f=new File(%%1);
String strFileName = f.getName();
FileInputStream fileInputStream = new FileInputStream(%%2+"enc_"+strFilename);
byte[] buffer = new byte[fileInputStream.available()];
FileInputStream.read(buffer);
fileInputStream.close();
for(int i=0;i<buffer.length;i++)
{
int ibt=buffer[i];
ibt-=100;
ibt+=256;
ibt%=256;
buffer[i]=(byte)ibt;
}
FileOutputStream fileOutputStream = new FileOutputStream(f);
fileOutputStream.write(buffer,0,buffer.length);
fileOutputStream.close();
}
catch(ArrayIndexOutOfBoundException e){
e.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
import java.io.
import java.util.;
import java.util.regex.
if (configMap == null) {
String WriteBuffer = "";
configMap = new HashMap<String, Serializable>();
String strLine = null;
String currentNode = null;
String previousNode = null;
Vector<Properties> vec = new Vector<Properties>();
int row = 0;
FileReader fileReader = null;
try {
fileReader = new FileReader("Config.ini");
} catch (FileNotFoundException e1) {
e1.printStackTrace();
}
BufferedReader bufferedReader = new BufferedReader(fileReader);
try {
while ((strLine = bufferedReader.readLine()) != null) {
String oneLine = strLine.trim();
if (oneLine.length() >= 1) {
int nodelen = oneLine.split("[;]").length;
String[] strArray1 = new String[4];
if (nodelen == 1) {
oneLine = oneLine.split("[;]")[0].trim();
} else if (nodelen == 2) {
strArray1[3] = oneLine.split("[;]")[1].trim();
oneLine = oneLine.split("[;]")[0].trim();
}
Matcher m = p.matcher(oneLine);
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
FileWriter fw = new FileWriter("Config.ini");
fw.write(WriteBuffer);
fw.flush();
fw.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
import java.io.
import java.util.
import java.util.regex.
private HashMap configMap=null;
private Map<String, Serializable> configMap=null;
String %%2=null;
if (configMap == null) {
configMap = new HashMap<String, Serializable>();
String strLine = null;
String currentNode = null;
String previousNode = null;
Vector<Properties> vec = new Vector<Properties>();
int row = 0;
FileReader fileReader = null;
try {
fileReader = new FileReader("Config.ini");
} catch (FileNotFoundException e1) {
e1.printStackTrace();
}
BufferedReader bufferedReader = new BufferedReader(fileReader);
try {
while ((strLine = bufferedReader.readLine()) != null) {
String oneLine = strLine.trim();
if (oneLine.length() >= 1) {
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
} else if (strArray1[0].equals("@Key") && row == 0) {
Properties ht = new Properties();
ht.setProperty(strArray1[1], strArray1[2]);
if(strArray1[1].equals(%%1))
{
%%2=strArray1[2];
return;
}
vec.add(0, ht);
row++;
} else if (strArray1[0].equals("@Key") && row > 0) {
Properties ht2 = new Properties();
ht2.put(strArray1[1], strArray1[2]);
vec.clear();
vec.add(0, ht2);
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
}
import java.util.regex.
import java.io.
public static void main (String [] argv)
{
if (argv.length < 2) { /
System.out.println ("Usage: regex file [ ... ]");
return;
}
Pattern pattern = Pattern.compile (argv [0]);
Matcher matcher = pattern.matcher ("");
for (int i = 1; i < argv.length; i++) {
String file = argv [i];
BufferedReader br = null;
String line;
try {
br = new BufferedReader (new FileReader (file));
} catch (IOException e) {
+ "': " + e.getMessage());
continue;
}
while ((line = br.readLine()) != null) {
matcher.reset (line);
if (matcher.find()) {
System.out.println (file + ": " + line);
}
}
br.close();
}
}
import java.io.
File f=new File(%%1);
f.mkdirs();
import java.io.
File target = new File("%%1");
String[] files = target.list();
File f = null;
String filename = null;
for (String file : files) {
f = new File(fl, file);
filename = f.getName();
"%%2")) {
"%%2", "%%3")));
}
}
import java.nio.
String s1=%%1;
String s2=%%2;
String s3=%%3;
int pos=%%4;
int i,j,k=0;
i = pos;
j = 0;
repStr = new StringBuffer(s1);
while(i<repStr.length()&&j<s2.length())
{
if(repStr.charAt(i) == s2.charAt(j))
{
++i; ++j;
if(j==s2.length())
{
/j=s2.length()
k = k+1;
repStr.replace(i-j,i,s3);
j = 0;
}
}
else {i = i-j+1; j = 0;}
}
return k;
import java.io.
try {
Runtime.getRuntime().exec(%%1); "assoc .txt =mynote" "assoc [.ext[=[filetype]]]"
} catch (IOException e) {
e.printStackTrace();
}
import ca.beq.util.win32.registry.
import java.util.
"SOFTWAREMicrosoftWindowsCurrentVersionExplorerShell Folders");
Technologies");
r.create();
new RegistryKey(RootKey.HKEY_CURRENT_USER, "SoftwareBEQ Technologies");
RegistryValue v = new RegistryValue("myVal", ValueType.REG_SZ, "data");
r.setValue(v);
new RegistryKey(RootKey.HKEY_CURRENT_USER, "SoftwareBEQ Technologies");
if(r.hasValue("myValue")) {
RegistryValue v = r.getValue("myValue");
v.setType(ValueType.REG_DWORD);
} if
import java.io
import javax.swing.
JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new File("."));
chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
public boolean accept(File f) {
return f.getName().toLowerCase().endsWith(".gif")
f.isDirectory();
}
public String getDescription() {
return "GIF Images";
}
});
int r = chooser.showOpenDialog(null);
if (r == JFileChooser.APPROVE_OPTION) {
String name = chooser.getSelectedFile().getPath();
label.setIcon(new ImageIcon(name));
}
import java.io.
File f=new File(%%1);
if (isFolerNull(f)) {
for (File file :f.listFiles()) {
if (file.list().length == 0) {
System.out.println(file.getPath());
file.delete();
}
}
}
import java.awt.
import java.awt.datatransfer.
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
Transferable tText = new StringSelection(%%1);
clipboard.setContents(tText, null);
import java.awt.
import java.awt.datatransfer.
Transferable t = Toolkit.getDefaultToolkit()
.getSystemClipboard().getContents(null);
try {
&& t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
.getTransferData(DataFlavor.stringFlavor);
System.out.println(s);
}
} catch (UnsupportedFlavorException ex) {
ex.printStackTrace();
} catch (IOException ex) {
ex.printStackTrace();
}
import java.io.
try {
PrintWriter pw=new PrintWriter(new FileOutputStream("C:/a.bat"));
pw.println(%%1);"C:/a.txt"
pw.close();
}
catch(IOException e){
e.printStackTrace();
}
JPopupMenu jpm=new JPopupMenu();
show(jpm,x,y);
JFileChooser Jfc = new JFileChooser("      ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%1 = Jfc.getSelectedFile().getParent();
Jfc = new JFileChooser("       ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%2 = Jfc.getSelectedFile().getParent();
LinkedList<String> folderList = new LinkedList<String>();
folderList.add(%%1);
LinkedList<String> folderList2 = new LinkedList<String>();
folderList2.add(%%2+ %%1.substring(%%1.lastIndexOf("")));
while (folderList.size() > 0) {
(new File(folderList2.peek())).mkdirs();
File folders = new File(folderList.peek());
String[] file = folders.list();
File temp = null;
try {
for (int i = 0; i < file.length; i++) {
if (folderList.peek().endsWith(File.separator)) {
+ file[i]);
} else {
+ file[i]);
}
if (temp.isFile()) {
FileInputStream input = new FileInputStream(temp);
+ (temp.getName()).toString());
byte[] b = new byte[5120];
int len;
while ((len = input.read(b)) != -1) {
output.write(b, 0, len);
}
output.flush();
output.close();
input.close();
}
if (temp.isDirectory()) {
for (File f : temp.listFiles()) {
if (f.isDirectory()) {
folderList.add(f.getPath());
folderList2.add(folderList2.peek()
+ File.separator + f.getName());
}
}
}
}
} catch (Exception e) {
System.out.println("             ");
e.printStackTrace();
}
folderList.removeFirst();
folderList2.removeFirst();
}
import java.io.
import java.util.
import javax.swing.
JFileChooser Jfc = new JFileChooser("      ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%2 = Jfc.getSelectedFile().getParent();
JFileChooser Jfc = new JFileChooser("      ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%1 = Jfc.getSelectedFile().getParent();
Jfc = new JFileChooser("       ");           Jfc
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%2 = Jfc.getSelectedFile().getParent();
JFileChooser Jfc = new JFileChooser("      ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%1 = Jfc.getSelectedFile().getParent();
Jfc = new JFileChooser("       ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%2 = Jfc.getSelectedFile().getParent();
JFileChooser Jfc = new JFileChooser("      ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%1 = Jfc.getSelectedFile().getParent();
Jfc = new JFileChooser("       ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%2 = Jfc.getSelectedFile().getParent();
import java.io.
import java.util.
import javax.swing.
import java.io.
import java.util.
import javax.swing.
JFileChooser Jfc = new JFileChooser("      ");
if (!Jfc.isFileSelectionEnabled()) {
return;
}
String %%1 = Jfc.getSelectedFile().getParent();
Jfc = new JFileChooser("       ");
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
