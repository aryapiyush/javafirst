package com.piyush.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 5500);
		System.out.println("Connected to server : "+socket.getInetAddress());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		System.out.println("Enter a question");
		Scanner sc = new Scanner(System.in);
		dataOutputStream.writeUTF(sc.nextLine());
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		System.out.println("Server replies : "+dataInputStream.readUTF());
		socket.close();
		sc.close();
	}

}