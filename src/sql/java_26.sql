return photo;
}
System.Drawing;/using System.IO;
using System.Data.SqlClient;*/ public Image SetByteToImagebyte[] mybyte
{ Image image; MemoryStream mymemorystream = new MemoryStreammybyte,0, mybyte.Length
image = Image.FromStreammymemorystream
return image;
}
public class SleepSort {
public static void main(String[] args) {
int[] ints = {1,4,7,3,8,9,2,6,5};
SortThread[] sortThreads = new SortThread[ints.length];
for (int i = 0; i < sortThreads.length; i++) {
sortThreads[i] = new SortThread(ints[i]);
}
for (int i = 0; i < sortThreads.length; i++) {
sortThreads[i].start();
}
}
}
class SortThread extends Thread{
int ms = 0;
public SortThread(int ms){
this.ms = ms;
}
public void run(){
try {
sleep(ms*10+10);
} catch (InterruptedException e) {
