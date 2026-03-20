public class OracleJdbcTest
{
String driverClass = "oracle.jdbc.driver.OracleDriver";
Connection con;
public void init(FileInputStream fs) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
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
}
private void createThumbnail(String filename, int thumbWidth, int thumbHeight, int quality, String outFilename)
{
Image image = Toolkit.getDefaultToolkit().getImage(filename);
MediaTracker mediaTracker = new MediaTracker(new Container());
mediaTracker.addImage(image, 0);
mediaTracker.waitForID(0);
use this to test for errors at this point: System.out.println(mediaTracker.isErrorAny());
double thumbRatio = (double)thumbWidth / (double)thumbHeight;
int imageWidth = image.getWidth(null);
int imageHeight = image.getHeight(null);
double imageRatio = (double)imageWidth / (double)imageHeight;
if (thumbRatio < imageRatio) {
thumbHeight = (int)(thumbWidth / imageRatio);
} else {
thumbWidth = (int)(thumbHeight * imageRatio);
}
BufferedImage thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);
Graphics2D graphics2D = thumbImage.createGraphics();
graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
graphics2D.drawImage(image, 0, 0, thumbWidth, thumbHeight, null);
new BufferedOutputStream(new FileOutputStream(outFilename));
JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(thumbImage);
quality = Math.max(0, Math.min(quality, 100));
param.setQuality((float)quality / 100.0f, false);
encoder.setJPEGEncodeParam(param);
encoder.encode(thumbImage);
out.close();
}
JAR   json-rpc-1.0.jar (75 kb)
import org.json.JSONObject;
JSONObject json = new JSONObject();
json.put("city", "Mumbai");
json.put("country", "India");
String output = json.toString();
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
