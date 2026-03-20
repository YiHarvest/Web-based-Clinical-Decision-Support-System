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
temp = new File(folderList.peek() + File.separator
+ file[i]);
} else {
temp = new File(folderList.peek() + File.separator
+ file[i]);
}
if (temp.isFile()) {
FileInputStream input = new FileInputStream(temp);
FileOutputStream output = new FileOutputStream(
folderList2.peek() + File.separator
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
