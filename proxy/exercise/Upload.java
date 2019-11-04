package proxy.exercise;

public class Upload {

	private String file;
	private String extension;

	public Upload(String file, String extension) {
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
