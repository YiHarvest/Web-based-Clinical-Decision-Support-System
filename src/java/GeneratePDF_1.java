public class GeneratePDF {
public static void main(String[] args) {
try {
OutputStream file = new FileOutputStream(new File("C:\\Test.pdf"));
Document document = new Document();
PdfWriter.getInstance(document, file);
document.open();
document.add(new Paragraph("Hello Kiran"));
document.add(new Paragraph(new Date().toString()));
document.close();
file.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}
System.getProperties().put("http.proxyHost", "someProxyURL");
System.getProperties().put("http.proxyPort", "someProxyPort");
System.getProperties().put("http.proxyUser", "someUserName");
System.getProperties().put("http.proxyPassword", "somePassword");
