Package com;
import java.io;
import java.util;
package java.framework;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
public class listdir{
public static void listfile(String file){
LinkedList<String> folderList = new LinkedList<String>(Arrays.asList(file));
while (folderList.size() > 0) {
File[] files = new File((String)folderList.poll()).listFiles();
for (int i = 0; i < files.length; i++) {
if (files[i].isDirectory())
folderList.add(files[i].getPath());
System.out.println(files[i]);
}
}
}
}
import java.io.FileOutputStream;
import java.io.IOException;
