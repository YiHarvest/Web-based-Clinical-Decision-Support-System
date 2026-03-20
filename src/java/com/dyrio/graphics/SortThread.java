class SortThread extends Thread{
int ms = 0;
public SortThread(int ms){
this.ms = ms;
}
public void run(){
try {
sleep(ms*10+10);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println(ms);
}
}
package com.dyrio.graphics;
package com.dyrio.graphics;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
