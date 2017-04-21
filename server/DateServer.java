import java.net.*;
import java.io.*;

public class DateServer
{
	public static void main(String[] args) {
		try {
			ServerSocket sock = new ServerSocket(6013);
			System.out.println("listening on " + sock.getLocalPort());
			while(true) {
				Socket client = sock.accept();
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
				pout.println(new java.util.Date().toString());
				System.out.println("Just connected to " + client.getRemoteSocketAddress());
				InputStream in = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
            
				String line = null;
				int idx;
				do {
					line = br.readLine();
					System.out.println(line);
					pout.println(new java.util.Date().toString());
					idx = line.indexOf("end");
				} while(idx != 1);
				br.close();
				pout.close();
				client.close();
				break;
			}
		} catch (IOException  e) {
			System.err.println(e);
		}
	}
}
			
