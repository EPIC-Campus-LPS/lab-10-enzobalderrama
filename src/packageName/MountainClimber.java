package packageName;

public class MountainClimber {
	private Mountain[] wantToClimb;
	public MountainClimber(Mountain[] wtc) {
		wantToClimb = wtc;
	}
	public Mountain[] getWantToClimb() {
		return wantToClimb;
	}
	public void setWTC(Mountain[] wtc) {
		wantToClimb = wtc;
	}
	
	public Mountain mostDifficultClimb() {
		Mountain hardestC = wantToClimb[0];
		for (int i = 1; i < wantToClimb.length; i++) {
			if (hardestC.getDiff() < wantToClimb[i].getDiff()) {
				hardestC = wantToClimb[i];
			}
		}
		return hardestC;
	}
	public void sortClimbLowToHigh() {
        for (int i = 0; i < wantToClimb.length - 1; i++) {
            for (int j = 0; j < wantToClimb.length - i - 1; j++) {
                if (wantToClimb[j].getDiff() > wantToClimb[j + 1].getDiff()) {
                    Mountain temp = wantToClimb[j];
                    wantToClimb[j] = wantToClimb[j + 1];
                    wantToClimb[j + 1] = temp;
                }
            }
        }
	}
	
	public void sortClimbHighToLow() {
		for (int i = wantToClimb.length-1; i >= 0; i--) {
            for (int j = wantToClimb.length-i-1; j > 0; j--) {
                if (wantToClimb[j].getDiff() > wantToClimb[j - 1].getDiff()) {
                	Mountain temp = wantToClimb[j];
                    wantToClimb[j] = wantToClimb[j - 1];
                    wantToClimb[j - 1] = temp;
                }
            }
        }
	}
	
	public MountainClimber getFourteeners() {
		Mountain[] fteen = new Mountain[3];
		int count = 0;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() > 14000) {
				fteen[count] = wantToClimb[i];
				count++;
			}
		}
		MountainClimber fourteen = new MountainClimber(fteen);
		return fourteen;
	}
	
	public String toString() {
		String newthing = "MountainClimber{";
		for (int i = wantToClimb.length-1; i >= 0; i--) {
			newthing += wantToClimb[i].toString();
			if (i != 0) {
				newthing += ", ";
			}
		}
		newthing += "}";
		return newthing;
	}
}
