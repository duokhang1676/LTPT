package app;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ui.HangHoa;



public class Client {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
			try {

				ObjectOutputStream out = ServerConnectionUtil.getObjectOutputStream();
				ObjectInputStream in = ServerConnectionUtil.getObjectInputStream();
				
				out.writeUTF("TIM_HANGHOA_THEOMA");
				out.flush();
				out.writeUTF("HH00001");
				out.flush();
				System.out.println(in.readObject());

			
		

			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}

}
