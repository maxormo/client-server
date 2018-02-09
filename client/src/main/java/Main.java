import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    private static int PORT = 8000;

    public static void main(String[] args) throws IOException {
        System.out.println("hello-client");

        Socket socket = new Socket("localhost", PORT);
        PrintWriter socketWriter = new PrintWriter(socket.getOutputStream());
        BufferedReader sockerReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        socketWriter.write("hohoho\r\n");
        socketWriter.flush();
        String s;
        ;
        while ((s = sockerReader.readLine()) != null) {
            System.out.println("server: " + s);
        }
    }
}
