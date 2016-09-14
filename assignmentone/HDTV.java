package assignmentone;

public class HDTV {

	String brandName;
	int size;

	public HDTV(String brandName, int size) {
		super();
		this.brandName = brandName;
		this.size = size;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "HDTV [BrandName= " + brandName + ", size= " + size + "inch]";
	}

}
