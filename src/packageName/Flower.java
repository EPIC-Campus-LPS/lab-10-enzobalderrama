package packageName;

public class Flower {
	private String species;
	
	public Flower(String s) {
		species = s;
	}
	public void setSpecies(String s) {
		species = s;
	}
	public String getSpecies() {
		return species;
	}
	
	public String toStringSmall(String s) {
		return "Flower{" + species + "}";
	}
}
