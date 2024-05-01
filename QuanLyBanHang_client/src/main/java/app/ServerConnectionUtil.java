package app;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerConnectionUtil {
	public static Socket socket;

    static {
        try {
            socket = new Socket("192.168.1.8", 8888);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ObjectOutputStream getObjectOutputStream() throws IOException {
        return new ObjectOutputStream(socket.getOutputStream());
    }

    public static ObjectInputStream getObjectInputStream() throws IOException {
        return new ObjectInputStream(socket.getInputStream());
    }
}
