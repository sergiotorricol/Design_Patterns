package proxy.exercise;

public class UploadServer implements Server {

	Upload upload;

	public UploadServer(Upload upload) {
		this.upload = upload;
	}

	@Override
	public void request() {
		System.out.println("Uploading file " + this.upload.getFile() + "" + this.upload.getExtension() + ".");
	}
}