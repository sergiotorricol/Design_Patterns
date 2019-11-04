package proxy.exercise;

public class UploadProxy implements Server {

	private Upload upload;
	private UploadServer uploadServer = null;
	private UploadBackupServer uploadBackupServer = null;

	public UploadProxy(Upload upload) {
		this.upload = upload;
	}

	@Override
	public void request() {
		if (uploadServer == null && uploadBackupServer == null) {
			uploadServer = new UploadServer(upload);
			uploadBackupServer = new UploadBackupServer(upload);
		}
		if (upload.getExtension().equals(".zip") || upload.getExtension().equals(".rar")) {
			this.uploadServer.request();
			this.uploadBackupServer.request();
		} else {
			System.out.println("Please use the extension .zip or .rar.");
		}
	}

}