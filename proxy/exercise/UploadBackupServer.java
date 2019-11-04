package proxy.exercise;

public class UploadBackupServer implements Server {

	Upload upload;

	public UploadBackupServer(Upload uplaod) {
		this.upload = uplaod;
	}

	@Override
	public void request() {
		System.out.println(
				"Uploading file " + this.upload.getFile() + "" + this.upload.getExtension() + " for a backup.");
	}

}