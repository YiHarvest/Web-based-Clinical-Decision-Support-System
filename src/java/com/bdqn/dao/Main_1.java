public class Main {
public static void main(String[] args)  {
try {
URL my_url = new URL("http:coolshell.cn/");
BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
String strTemp = "";
while(null != (strTemp = br.readLine())){
System.out.println(strTemp);
}
} catch (Exception ex) {
ex.printStackTrace();
}
}
}
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
FileReader fr = new FileReader("ming.txt");
int ch = 0;
while((ch = fr.read())!=-1 )
{
System.out.print((char)ch);
}
read()
read(char[] ch,int off,int length)
while((ch = isr.read())!=-1)
{
System.out.print((char)ch);
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
package com.bdqn.dao;
import java
