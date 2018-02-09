import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {


    private static int PORT = 8000;

    public static void main(String[] args) throws IOException {

        System.out.println("hello-sever");
        ServerSocket socket = new ServerSocket(PORT);
        Socket accept = socket.accept();
        System.out.println("connected");
        BufferedReader in = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        Writer out = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        String userInput;
        while ((userInput = in.readLine()) != null) {
            System.out.println("client:" + userInput);
            out.write("response:" + userInput + "\r\n");
            out.flush();
        }
    }
}
