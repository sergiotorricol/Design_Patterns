package proxy.exercise;

public class DownloadProxy implements Server {

	private Download download;
	private DownloadServer downloadServer = null;
	private DownloadBackupServer downloadBackupServer = null;

	public DownloadProxy(Download download) {
		this.download = download;
	}

	@Override
	public void request() {
		if (downloadServer == null && downloadBackupServer == null) {
			downloadServer = new DownloadServer(download);
			downloadBackupServer = new DownloadBackupServer(download);
		}
		if (download.getExtension().equals(".zip") || download.getExtension().equals(".rar")) {
			this.downloadServer.request();
			this.downloadBackupServer.request();
		} else {
			System.out.println("Please use the extension .zip or .rar.");
		}
	}
}