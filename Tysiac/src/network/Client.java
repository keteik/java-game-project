package network;

import java.io.*;
import java.net.*;

public class Client {
	
	private Socket socket = null;
	public int idClient; 
	private DataInputStream input;
	private DataOutputStream output;
	
	public Client(int idClient, String address, int port) {
		try {
			socket = new Socket(address, port);
			this.idClient = idClient;
			
		}catch(UnknownHostException u) {
			System.out.println(u);
			
		}catch(IOException e) {
			System.out.println(e);
			
		}
	}
	
	public void closeConnection() {
		try {
			input.close();
			output.close();
			socket.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void clientWriteInt(int score) {
		
		try {
			output = new DataOutputStream(socket.getOutputStream());
			output.writeInt(score);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void clientWriteString(String string) {
			
			try {
				output = new DataOutputStream(socket.getOutputStream());
				output.writeUTF(string);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	public int clientReadInt() {
		int i = 0;
		
		try {
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			i = input.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public String clientReadString() {
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
