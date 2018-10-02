import java.util.ArrayList;
import java.util.LinkedList;

public class Zad1 {

    final static int N = 100;

    public static void zad1a() {
        int[] array = new int[N];
        for(int i = 1; i <= array.length; i++){
            array[i-1] = i;
        }
    }

    public static void zad1b() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 1; i <= array.size(); i++){
            array.add(i);
        }
    }

    public static void zad1c() {
        ArrayList<Integer> array = new ArrayList<Integer>(N);
        for(int i = 1; i <= array.size(); i++){
            array.set(i-1, i);
        }
    }

    public static void zad1d() {
        LinkedList<Integer> array = new LinkedList<Integer>();
        for(int i = 1; i <= array.size(); i++){
            array.add(i);
        }
    }


    public static void main(String[] args){
        long startTime = System.nanoTime();
        zad1d();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }
}
