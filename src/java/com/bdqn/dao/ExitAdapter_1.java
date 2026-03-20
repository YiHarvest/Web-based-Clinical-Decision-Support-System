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
{
var variables:URLVariables = new URLVariables( e.target.data );
if(variables.success)
{
trace(variables.path);
}
}
{
trace("httpStatusHandler:" + e);
}
{
trace("securityErrorHandler:" + e);
}
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
FileWriter fw = new FileWriter("Config.ini");
fw.write(WriteBuffer);
fw.flush();
fw.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
public void init(FileInputStream fs)
{
Properties props = new Properties();
props.load(fs);
String url = props.getProperty("db.url");
String userName = props.getProperty("db.user");
String password = props.getProperty("db.password");
Class.forName(driverClass);
con=DriverManager.getConnection(url, userName, password);
}
public void fetch() throws SQLException, IOException
{
PreparedStatement ps = con.prepareStatement("select SYSDATE from dual");
ResultSet rs = ps.executeQuery();
while (rs.next())
{
}
rs.close();
ps.close();
}
public static void main(String[] args)
{
OracleJdbcTest test = new OracleJdbcTest();
test.init();
test.fetch();
}
}
package com.bdqn.dao;
java.util.Date utilDate = new java.util.Date();
java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
public static void fileCopy( File in, File out )
{
FileChannel inChannel = new FileInputStream( in ).getChannel();
FileChannel outChannel = new FileOutputStream( out ).getChannel();
{
inChannel.transferTo(0, inChannel.size(), outChannel);
magic number for Windows, 64Mb - 32Kb)
int maxCount = (64 * 1024 * 1024) - (32 * 1024);
long size = inChannel.size();
long position = 0;
while ( position < size )
{
position += inChannel.transferTo( position, maxCount, outChannel );
}
}
{
if ( inChannel != null )
{
inChannel.close();
}
if ( outChannel != null )
{
outChannel.close();
}
}
import java.io.*;
import java.util.*;
import java.util.regex.*;
private HashMap configMap=null;
private Map<String, Serializable> configMap=null;
if(configMap==null) {
String strLine=null;
String currentNode=null;
String previousNode=null;
Vector<Properties> vec=new Vector<Properties>();
int row=0;
FileReader fileReader = null;
try {
fileReader = new FileReader(%%1);
} catch (FileNotFoundException e1) {
e1.printStackTrace();
}
BufferedReader bufferedReader=new BufferedReader(fileReader);
try {
while((strLine=bufferedReader.readLine())!=null) {
String oneLine=strLine.trim();
if(oneLine.length()>=1) {
Pattern p=Pattern.compile("[s*.*s*]");
int nodelen=oneLine.split("[;]").length;
String[] strArray1=new String[4];
if(nodelen==1) {
oneLine=oneLine.split("[;]")[0].trim();
}
else if(nodelen==2) {
strArray1[3]=oneLine.split("[;]")[1].trim();
oneLine=oneLine.split("[;]")[0].trim();
}
Matcher m=p.matcher(oneLine);
if(m.matches()) {
strArray1[0]="@Node";
strArray1[1]=oneLine;
strArray1[2]="";
} else {
int keylen=oneLine.split("=").length;
if(keylen==1) {
strArray1[0]="@Key";
strArray1[1]=oneLine.split("=")[0];
strArray1[2]="";
} else if(keylen==2) {
strArray1[0]="@Key";
strArray1[1]=oneLine.split("=")[0];
strArray1[2]=oneLine.split("=")[1];
} else {
strArray1[0]="@ElementError";
strArray1[1]="";
strArray1[2]="";
strArray1[3]="";
}
}
if(strArray1[0].equals("@Node")) {
previousNode=currentNode;
currentNode=strArray1[1];
if(row>0) {
configMap.put(previousNode,vec.elementAt(0));
"size:"+configMap.size()
vec.clear();
row=0;
}
} else if(strArray1[0].equals("@Key") && row==0) {
Properties ht=new Properties();
ht.setProperty(strArray1[1],strArray1[2]);
vec.add(0,ht);
row++;
} else if(strArray1[0].equals("@Key") && row>0) {
Properties ht2=new Properties();
ht2.put(strArray1[1],strArray1[2]);
vec.clear();
vec.add(0,ht2);
row++;
}
}
}
package com.bdqn.dao;
configMap.put(currentNode,vec.elementAt(0));
} catch (FileNotFoundException e) {
configMap=null;
e.printStackTrace();
} catch (IOException e) {
configMap=null;
e.printStackTrace();
} finally {
vec.clear();
try {
bufferedReader.close();
fileReader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
String nodeKey="["+%%2+"]";
Properties ht=null;
if(configMap.containsKey(nodeKey)) {
ht=(Properties)configMap.get(nodeKey);
} else {
ht=(Properties)configMap.put(nodeKey,%%3);
}
try {
ht.setProperty(%%3,%%4);
} catch (NullPointException e) {
e.printStackTrace();
}
FileWriter fw= null;
BufferedWriter bw= null;
try {
fw = new FileWriter(%%1);
bw=new BufferedWriter(fw);
} catch (IOException e) {
e.printStackTrace();
}
Set keys=configMap.keySet();
Iterator ite=keys.iterator();
while(ite.hasNext()) {
String oneKey=(String)ite.next();
try {
bw.write(oneKey+"/n");
} catch (IOException e) {
e.printStackTrace();
}
ht=(Properties)configMap.get(oneKey);
ht.list(new PrintWriter(bw,true));
}
package com.bdqn.dao;
import java.io.*;
import java.util.*;
import java.util.regex.*;
private HashMap configMap=null;
private Map<String, Serializable> configMap=null;
if(configMap==null) {
String strLine=null;
String currentNode=null;
Vector<Properties> vec=new Vector<Properties>();
int row=0;
FileReader fileReader = null;
try {
fileReader = new FileReader(%%1);
} catch (FileNotFoundException e1) {
e1.printStackTrace();
}
BufferedReader bufferedReader=new BufferedReader(fileReader);
try {
while((strLine=bufferedReader.readLine())!=null) {
String oneLine=strLine.trim();
if(oneLine.length()>=1) {
Pattern p=Pattern.compile("[s*.*s*]");
int nodelen=oneLine.split("[;]").length;
String[] strArray1=new String[4];
if(nodelen==1) {
oneLine=oneLine.split("[;]")[0].trim();
}
else if(nodelen==2) {
strArray1[3]=oneLine.split("[;]")[1].trim();
oneLine=oneLine.split("[;]")[0].trim();
}
Matcher m=p.matcher(oneLine);
if(m.matches()) {
strArray1[0]="@Node";
strArray1[1]=oneLine;
strArray1[2]="";
} else {
int keylen=oneLine.split("=").length;
if(keylen==1) {
strArray1[0]="@Key";
strArray1[1]=oneLine.split("=")[0];
strArray1[2]="";
} else if(keylen==2) {
strArray1[0]="@Key";
strArray1[1]=oneLine.split("=")[0];
strArray1[2]=oneLine.split("=")[1];
} else {
strArray1[0]="@ElementError";
strArray1[1]="";
strArray1[2]="";
strArray1[3]="";
}
}
if(strArray1[0].equals("@Node")) {
previousNode=currentNode;
currentNode=strArray1[1];
if(row>0) {
row=0;
}
} else if(strArray1[0].equals("@Key") && row==0) {
Properties ht=new Properties();
ht.setProperty(strArray1[1],strArray1[2]);
vec.add(0,ht);
row++;
} else if(strArray1[0].equals("@Key") && row>0) {
Properties ht2=new Properties();
ht2.put(strArray1[1],strArray1[2]);
vec.clear();
vec.add(0,ht2);
row++;
}
}
}
configMap.put(currentNode,vec.elementAt(0));
} catch (FileNotFoundException e) {
configMap=null;
e.printStackTrace();
} catch (IOException e) {
configMap=null;
e.printStackTrace();
} finally {
vec.clear();
try {
bufferedReader.close();
fileReader.close();
} catch (IOException e) {
e.printStackTrace();
}
package com.dyrio.graphics;
public byte[]
{ Stream stream = FileUpload1.PostedFile.InputStream;
byte[] photo = new byte[FileUpload1.PostedFile.ContentLength];
return photo;
}
System.Drawing;/using System.IO;
using System.Data.SqlClient;*/ public Image SetByteToImagebyte[] mybyte
{ Image image; MemoryStream mymemorystream = new MemoryStreammybyte,0, mybyte.Length
return image;
}
