public class CreateAFile {
public static void main(String[] args) throws IOException {
byte[] buf = new byte[8192];
long n = Long.parseLong(args[0]);
FileOutputStream fos = new FileOutputStream(args[1]);
long m = n / buf.length;
for (long i = 0; i < m; i++) {
fos.write(buf, 0, buf.length);
}
fos.write(buf, 0, (int)(n % buf.length));
fos.close();
}
}
import mx.collections.ArrayCollection;
import mx.rpc.events.ResultEvent;
import mx.rpc.http.HTTPService;
