public class Main {
public static void main(String[] args)  {
try {
URL my_url = new URL("http:coolshell.cn/");
new BufferedReader(new InputStreamReader(my_url.openStream()));
String strTemp = "";
while(null != (strTemp = br.readLine())){
System.out.println(strTemp);
}
} catch (Exception ex) {
ex.printStackTrace();
}
}
}
private static Object resizeArray (Object oldArray, int newSize) {
int oldSize = java.lang.reflect.Array.getLength(oldArray);
Class elementType = oldArray.getClass().getComponentType();
elementType,newSize);
int preserveLength = Math.min(oldSize,newSize);
if (preserveLength > 0)
System.arraycopy (oldArray,0,newArray,0,preserveLength);
return newArray;
}
public static void main (String[] args) {
int[] a = {1,2,3};
a = (int[])resizeArray(a,5);
a[3] = 4;
a[4] = 5;
for (int i=0; i<a.length; i++)
System.out.println (a[i]);
}
try {
package com.bdqn.dao;
"D:\\1.xls")));
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
InputStream is = new FileInputStream(new File("d:1.xls"));
byte b[] = new byte[Integer.parseInt(new File("d:1.xls").length()
+ "")];
is.read(b);
System.out.write(b);
System.out.println();
is.close();
Reader r = new FileReader(new File("d:1.xls"));
char c[] = new char[(int) new File("d:1.xls").length()];
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
FileReader fr = new FileReader("ming.txt");
int ch = 0;
while((ch = fr.read())!=-1 )
package com.bdqn.dao;
import java.io.*;
import java.util.*;
import java.util.regex.*;
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
Pattern p = Pattern.compile("[s*.*s*]");
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
package com.bdqn.dao;
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
}
}
