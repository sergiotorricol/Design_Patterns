package proxy.exercise;

public class Client {

	public static void main(String[] args) {

		Server uploadProxy = new UploadProxy(new Upload("file", ".zip"));
		Server uploadProxy2 = new UploadProxy(new Upload("file", ".rar"));
		Server uploadProxy3 = new UploadProxy(new Upload("file", ".txt"));

		Server downloadProxy = new DownloadProxy(new Download("document", ".rar"));
		Server downloadProxy2 = new DownloadProxy(new Download("document", ".zip"));
		Server downloadProxy3 = new DownloadProxy(new Download("document", ".txt"));

		uploadProxy.request();
		uploadProxy2.request();
		uploadProxy3.request();

		downloadProxy.request();
		downloadProxy2.request();
		downloadProxy3.request();

	}

}