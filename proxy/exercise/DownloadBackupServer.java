package proxy.exercise;

public class DownloadBackupServer implements Server {

	Download download;

	public DownloadBackupServer(Download download) {
		this.download = download;
	}

	@Override
	public void request() {
		System.out.println(
				"Downloading file " + this.download.getFile() + "" + this.download.getExtension() + " from a backup.");
	}

}