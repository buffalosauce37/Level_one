
public class Pizza {
	private int slices;
	private String topping;

	public Pizza(int slices, String topping) {
		this.slices = slices;
		this.topping = topping;
	}

	int getSlices() {
		return this.slices;
	}

	String getTopping() {
		return this.topping;
	}

	void setSlices(int slices) {
		if (slices < 16) {
			this.slices = slices;
		} else {
			this.slices = 16;
		}
	}

	void setTopping(String topping) {
		this.topping = topping;
	}

	public void eatSclice() {
		if (this.slices > 0) {
			this.slices--;
		} else {
			this.slices = 0;
		}
	}

	public static void yum() {
		System.out.println("yummmm");
	}
}
