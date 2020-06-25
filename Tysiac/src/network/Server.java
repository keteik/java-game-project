package network;

import java.io.*;
import java.net.*;

public class Server {
	
	public Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream input;
	private DataOutputStream output;
	
	public Server(int port) {
		try {
			server = new ServerSocket(port);
			socket = server.accept();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void closeConnection() {
		try {
			input.close();
			output.close();
			socket.close();
			server.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void serverWriteInt(int score) {
			
			try {
				output = new DataOutputStream(socket.getOutputStream());
				output.writeInt(score);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	public void serverWriteString(String string) {
		
		try {
			output = new DataOutputStream(socket.getOutputStream());
			output.writeUTF(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int serverReadInt() {
		int i = 0;
		
		try {
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			i = input.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public String serverReadString() {
		String string = null;
		
		try {
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			string = input.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return string;
	}

}
