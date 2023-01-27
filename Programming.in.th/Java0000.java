import java.io.PrintWriter;
import java.util.Scanner;

public class Java0000 implements Runnable{
    private Scanner in = new Scanner(System.in);
    private PrintWriter out = new PrintWriter(System.out); 
    private int a, b, sum;

    public static void main(String[] args){
        new Thread(new Java0000()).start();
    }

    private void read(){
        a = in.nextInt();
        b = in.nextInt();
    }

    private void solve(){
        sum = a+b;
    }

    private void write() {
        out.println(sum);
    }

    public void run(){
        read();
        solve();
        write();
        out.close();
    }

}