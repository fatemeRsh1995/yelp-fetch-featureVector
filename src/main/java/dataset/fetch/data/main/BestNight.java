package dataset.fetch.data.main;

public class BestNight {
	
	private Boolean monday;
	private Boolean tuesday;
	private Boolean friday;
	private Boolean wednesday;
	private Boolean thursday;
	private Boolean sunday;
	private Boolean saturday;
	
	
	
	
	@Override
	public String toString() {
		return  monday + ", " + tuesday + ", " + friday + ", "
				+ wednesday + ", " + thursday + ", " + sunday + ", " + saturday;
	}
	public Boolean getMonday() {
		return monday;
	}
	public void setMonday(Boolean monday) {
		this.monday = monday;
	}
	public Boolean getTuesday() {
		return tuesday;
	}
	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}
	public Boolean getFriday() {
		return friday;
	}
	public void setFriday(Boolean friday) {
		this.friday = friday;
	}
	public Boolean getWednesday() {
		return wednesday;
	}
	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}
	public Boolean getThursday() {
		return thursday;
	}
	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}
	public Boolean getSunday() {
		return sunday;
	}
	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}
	public Boolean getSaturday() {
		return saturday;
	}
	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}
	


}
