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
