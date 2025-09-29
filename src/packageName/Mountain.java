package packageName;

public class Mountain {
	private String name;
	private int elevation;
	private double climbDifficulty;
	
	public Mountain(String n, int e, double cd) {
		name = n;
		elevation = e;
		climbDifficulty = cd;
	}
	public String getName() {
		return name;
	}
	public int getElevation() {
		return elevation;
	}
	public double getDiff() {
		return climbDifficulty;
	}
	public void setName(String s) {
		name = s;
	}
	public void setElevation(int e) {
		elevation = e;
	}
	public void setDiff(double cd) {
		climbDifficulty = cd;
	}
	
	public String toString() {
		return "Mountain{" + getName() + ", " + getElevation() + ", " + getDiff() + "}";
	}
}
