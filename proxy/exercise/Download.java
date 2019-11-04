package proxy.exercise;

public class Download {

	private String file;
	private String extension;

	public Download(String file, String extension) {
		this.file = file;
		this.extension = extension;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
}