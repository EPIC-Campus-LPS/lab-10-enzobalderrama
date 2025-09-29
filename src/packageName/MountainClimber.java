package packageName;

public class MountainClimber {
	private Mountain[] wantToClimb;
	public MountainClimber(Mountain[] wtc) {
		wantToClimb = wtc;
	}
	public Mountain[] getWTC() {
		return wantToClimb;
	}
	public void setWTC(Mountain[] wtc) {
		wantToClimb = wtc;
	}
	
	Mountain hardestC = wantToClimb[0];
	public Mountain mostDifficultClimb() {
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
        for (int i = wantToClimb.length-1; i > 0; i--) {
            for (int j = wantToClimb.length-i-1; j > 0; j--) {
                if (wantToClimb[j].getDiff() < wantToClimb[j - 1].getDiff()) {
                    Mountain temp = wantToClimb[j];
                    wantToClimb[j] = wantToClimb[j - 1];
                    wantToClimb[j - 1] = temp;
                }
            }
        }
	}
	
	public Mountain[] getFourteeners() {
		Mountain[] fteen = null;
		int count = 0;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() > 14000) {
				fteen[count] = wantToClimb[i];
				count++;
			}
		}
		return fteen;
	}
	
	public String toString() {
		return "MountainClimber{ + 
	}
}
