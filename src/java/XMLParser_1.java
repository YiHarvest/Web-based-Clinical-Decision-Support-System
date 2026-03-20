public class XMLParser {
public void getAllUserNames(String fileName) {
try {
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
DocumentBuilder db = dbf.newDocumentBuilder();
File file = new File(fileName);
if (file.exists()) {
Document doc = db.parse(file);
Element docEle = doc.getDocumentElement();
+ docEle.getNodeName());
NodeList studentList = docEle.getElementsByTagName("student");
.println("Total students: " + studentList.getLength());
if (studentList != null && studentList.getLength() > 0) {
for (int i = 0; i < studentList.getLength(); i++) {
Node node = studentList.item(i);
if (node.getNodeType() == Node.ELEMENT_NODE) {
Element e = (Element) node;
NodeList nodeList = e.getElementsByTagName("name");
+ nodeList.item(0).getChildNodes().item(0)
.getNodeValue());
nodeList = e.getElementsByTagName("grade");
+ nodeList.item(0).getChildNodes().item(0)
.getNodeValue());
nodeList = e.getElementsByTagName("age");
+ nodeList.item(0).getChildNodes().item(0)
.getNodeValue());
}
}
} else {
System.exit(1);
}
}
} catch (Exception e) {
System.out.println(e);
}
}
public static void main(String[] args) {
XMLParser parser = new XMLParser();
parser.getAllUserNames("c:\\test.xml");
}
}
import java.util.Map;
import org.apache.commons.lang.ArrayUtils;
