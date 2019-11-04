package proxy.exercise;

public class DownloadServer implements Server {

	Download download;

	public DownloadServer(Download download) {
		this.download = download;
	}

	@Override
	public void request() {
		System.out.println("Downloading file " + this.download.getFile() + "" + this.download.getExtension() + ".");
	}

}