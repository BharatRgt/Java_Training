package Services;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

public interface Services {
	public void closeEverything(Socket socket,BufferedReader bufferedReader, BufferedWriter bufferedWriter);
}