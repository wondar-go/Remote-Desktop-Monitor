package ConnectServer;

import java.io.IOException;
import java.net.*;

public class ConnectServer {
	Socket cnnServer;
	public ConnectServer(){
		String serverAddress = "localhost";         //服务器地址
		int port = 8090;         //端口
		try {
			cnnServer = new Socket(serverAddress, port);       //连接
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isConnected(){
		return cnnServer.isConnected();
	}
	public Socket getSocket(){
		return this.cnnServer;
	}
}
