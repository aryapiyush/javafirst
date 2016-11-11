package com.piyush.demo;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

	private void solveQuestion(Socket socket) throws IOException{
		System.out.println("Just Connected to Client : "+socket.getInetAddress());
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		String question = dataInputStream.readUTF();
		System.out.println("client : "+socket.getInetAddress()+" is asking question : "+question);
		
		System.out.println("server will reply....");
		
		String answer = "";
		
		if(question.equals("what is my name")){
			answer = "Piyush Arya";
		}else if(question.equals("organization name")){
			answer = "Axway";
		}else if(question.equals("project")){
			answer = "TNT";
		}else if(question.equals("Age")){
			answer = "24";
		}else{
			answer = "server does not know answer of this question";
		}
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		outputStream.writeUTF(answer);
		socket.close();
	}
	public static void main(String[] args) throws IOException {
		System.out.println("server started and waiting for client to connect");
		ServerConnection conn = new ServerConnection();
		ServerSocket serverSocket = conn.getServerSocket();
		Server server = new Server();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					Socket socket = serverSocket.accept();
					server.solveQuestion(socket);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++){
			executorService.execute(runnable);
		}
		

	}

}