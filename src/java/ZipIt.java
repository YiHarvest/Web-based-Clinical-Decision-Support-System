public class ZipIt {
public static void main(String args[]) throws IOException {
if (args.length < 2) {
System.err.println("usage: java ZipIt Zip.zip file1 file2 file3");
System.exit(-1);
}
File zipFile = new File(args[0]);
if (zipFile.exists()) {
System.err.println("Zip file already exists, please try another");
System.exit(-2);
}
FileOutputStream fos = new FileOutputStream(zipFile);
ZipOutputStream zos = new ZipOutputStream(fos);
int bytesRead;
byte[] buffer = new byte[1024];
CRC32 crc = new CRC32();
for (int i=1, n=args.length; i < n; i++) {
String name = args[i];
File file = new File(name);
if (!file.exists()) {
System.err.println("Skipping: " + name);
continue;
}
new FileInputStream(file));
crc.reset();
while ((bytesRead = bis.read(buffer)) != -1) {
crc.update(buffer, 0, bytesRead);
}
bis.close();
new FileInputStream(file));
ZipEntry entry = new ZipEntry(name);
entry.setMethod(ZipEntry.STORED);
entry.setCompressedSize(file.length());
entry.setSize(file.length());
entry.setCrc(crc.getValue());
zos.putNextEntry(entry);
while ((bytesRead = bis.read(buffer)) != -1) {
zos.write(buffer, 0, bytesRead);
}
bis.close();
}
zos.close();
}
ackage net.java.java.xmlparser;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
