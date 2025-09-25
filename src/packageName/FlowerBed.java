package packageName;

public class FlowerBed {
	private Flower[] bed;
	public FlowerBed(Flower[] bedset) {
		bed = bedset;
	}
	public FlowerBed(int number) {
		bed = new Flower[number];
	}
	public Flower[] getBed() {
		return bed;
	}
	public void setBed(Flower[] bedset) {
		bed = bedset;
	}
	
	public int plantFlower(Flower f) {
		if (bed.length < 2) {
			if (bed[0] == null) {
				bed[0] = f;
				return 0;
			}
			return -1;
		}
		if (bed[0] == null && bed[1] == null) {
			bed[0] = f;
			return 0;
		}
		for (int i = 1; i < bed.length-1; i++) {
			if (bed[i] == null && bed[i-1] == null && bed[i+1] == null) {
				bed[i] = f;
				return i;
			}
		}
		if (bed[bed.length-1] == null && bed[bed.length-2] == null) {
			bed[bed.length] = f;
			return bed.length-1;
		}
		return -1;
	}
	
	public void flipBed() {
		Flower[] newBed = new Flower[bed.length];
		int count = 0;
		for (int i = bed.length-1; i >= 0; i--) {
			newBed[count] = bed[i];
			count++;
		}
		bed = newBed;
	}
	public String toString() {
		String full = "FlowerBed{";
		for (int i = 0; i < bed.length; i++) {
			full += toStringSmall(bed[i]);
		}
		full += "}";
	}
}
