package com.piyush.demo;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerConnection {
	private ServerSocket serverSocket;

	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	public ServerConnection() throws IOException {
		serverSocket = new ServerSocket(5500);
	}
}
