package dataset.fetch.data.main;

public class GoodForMeal {
	
	private Boolean dessert;
	private Boolean latenight;
	private Boolean lunch;
	private Boolean dinner;
	private Boolean breakfast;
	private Boolean brunch;
	
	
	@Override
	public String toString() {
		return dessert + ", " + latenight + ", " + lunch + ", "
				+ dinner + ", " + breakfast + ", " + brunch;
	}
	public Boolean getDessert() {
		return dessert;
	}
	public void setDessert(Boolean dessert) {
		this.dessert = dessert;
	}
	public Boolean getLatenight() {
		return latenight;
	}
	public void setLatenight(Boolean latenight) {
		this.latenight = latenight;
	}
	public Boolean getLunch() {
		return lunch;
	}
	public void setLunch(Boolean lunch) {
		this.lunch = lunch;
	}
	public Boolean getDinner() {
		return dinner;
	}
	public void setDinner(Boolean dinner) {
		this.dinner = dinner;
	}
	public Boolean getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(Boolean breakfast) {
		this.breakfast = breakfast;
	}
	public Boolean getBrunch() {
		return brunch;
	}
	public void setBrunch(Boolean brunch) {
		this.brunch = brunch;
	}
	
	


}
